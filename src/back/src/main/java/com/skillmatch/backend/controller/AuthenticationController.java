package com.skillmatch.backend.controller;

import com.google.common.hash.Hashing;
import com.skillmatch.backend.dto.request.UsuarioRequestDTO;
import com.skillmatch.backend.dto.response.AuthenticationResponseDTO;
import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.dto.response.FreelancerResponseDTO;
import com.skillmatch.backend.entity.AuthToken;
import com.skillmatch.backend.entity.Contratante;
import com.skillmatch.backend.entity.Freelancer;
import com.skillmatch.backend.entity.Usuario;
import com.skillmatch.backend.service.IAuthenticationService;
import com.skillmatch.backend.service.IContratanteService;
import com.skillmatch.backend.service.IFreelancerService;
import com.skillmatch.backend.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthenticationController {
    private final IAuthenticationService authenticationService;
    @PostMapping
    public ResponseEntity<AuthenticationResponseDTO> register (@RequestBody UsuarioRequestDTO usuarioDTO, UriComponentsBuilder uriBuilder) {
        AuthenticationResponseDTO responseDTO = authenticationService.validateCredentials(usuarioDTO);
        if(responseDTO.getToken() == null){
            return ResponseEntity.status(403).body(responseDTO);
        }else{
            return ResponseEntity.ok().body(responseDTO);
        }
    }
}
