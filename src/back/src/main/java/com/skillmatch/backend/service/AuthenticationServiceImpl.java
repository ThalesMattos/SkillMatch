package com.skillmatch.backend.service;

import com.google.common.hash.Hashing;
import com.skillmatch.backend.dto.request.UsuarioRequestDTO;
import com.skillmatch.backend.dto.response.AuthenticationResponseDTO;
import com.skillmatch.backend.dto.response.FreelancerResponseDTO;
import com.skillmatch.backend.entity.AuthToken;
import com.skillmatch.backend.entity.Contratante;
import com.skillmatch.backend.entity.Freelancer;
import com.skillmatch.backend.entity.Usuario;
import com.skillmatch.backend.repository.AuthTokenRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.id.GUIDGenerator;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
@Primary
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements IAuthenticationService{
    private final AuthTokenRepository tokenRepository;
    private final IUsuarioService usuarioService;
    private final IFreelancerService freelancerService;
    private final IContratanteService contratanteService;

    @Override
    public AuthToken registerToken(Long idUsuario) {
        AuthToken authToken = new AuthToken();
        Usuario usuario = new Usuario();
        usuario.setId(idUsuario);
        authToken.setUsuario(usuario);
        authToken.setExpirationDate(LocalDateTime.now().plusHours(1));

        return tokenRepository.save(authToken);
    }

    @Override
    public AuthenticationResponseDTO validateCredentials(UsuarioRequestDTO usuarioDTO){
        String hashedSenha = Hashing.sha256()
                .hashString(usuarioDTO.getSenha(), StandardCharsets.UTF_8)
                .toString();

        Usuario usuario =  usuarioService.findByLoginInformation(usuarioDTO.getUsuario(), hashedSenha);

        if(usuario != null){
            Freelancer freelancer = freelancerService.findById(usuario.getId());
            Contratante contratante = contratanteService.findById(usuario.getId());
            String tipo = freelancer != null ? "Freelancer" : "Contratante";

            AuthToken token = this.findByUsuario(usuario.getId());
            if(token == null || !this.checkValid(token)){
                token = this.registerToken(usuario.getId());
            }
            return new AuthenticationResponseDTO(token, tipo);
        }else {
            return new AuthenticationResponseDTO();
        }
    }

    @Override
    public AuthToken findById(String tokenUUID){
        Optional<AuthToken> token = tokenRepository.findById(tokenUUID);

        return token.orElse(null);
    }

    @Override
    public boolean validateTokenValidAndBelongsToUsuarioId(String authToken, Long usuarioId){
        if(this.checkValid(authToken)){
            AuthToken authTokenObject = this.findById(authToken);

            return Objects.equals(usuarioId, authTokenObject.getUsuario().getId());
        }else{
            return false;
        }
    }

    @Override
    public boolean checkValid(String tokenUUID){
        Optional<AuthToken> token = tokenRepository.findById(tokenUUID);

        return token.isPresent() && token.get().getExpirationDate().isAfter(LocalDateTime.now());
    }

    @Override
    public boolean checkValid(AuthToken token){
        return token.getExpirationDate().isAfter(LocalDateTime.now());
    }

    @Override
    public AuthToken findByUsuario(Long idUsuario){
        return tokenRepository.findByUsuario(idUsuario);
    }
}
