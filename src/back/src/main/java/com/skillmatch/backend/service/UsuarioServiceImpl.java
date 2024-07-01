package com.skillmatch.backend.service;

import com.google.common.hash.Hashing;
import com.skillmatch.backend.dto.request.UsuarioRequestDTO;
import com.skillmatch.backend.dto.response.UsuarioResponseDTO;
import com.skillmatch.backend.entity.Usuario;
import com.skillmatch.backend.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class UsuarioServiceImpl implements IUsuarioService{
    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponseDTO findById(Long id) {
        return new UsuarioResponseDTO(returnUsuario(id));
    }

    @Override
    public Usuario findByLoginInformation(String usuario, String hashedSenha) {
        return usuarioRepository.findByLoginInformation(usuario, hashedSenha);
    }

    @Override
    public List<UsuarioResponseDTO> findAll() {
        List<UsuarioResponseDTO> listUsuario = new LinkedList<>();
        usuarioRepository.findAll().stream().forEach(usuario -> listUsuario.add(new UsuarioResponseDTO(usuario)));
        return listUsuario;
    }

    @Override
    public Usuario register(UsuarioRequestDTO usuarioDTO) {
        String hashedSenha = Hashing.sha256()
                .hashString(usuarioDTO.getSenha(), StandardCharsets.UTF_8)
                .toString();

        Usuario usuario = new Usuario(usuarioDTO.getUsuario(), hashedSenha);

        return usuarioRepository.save(usuario);
    }

    @Override
    public UsuarioResponseDTO update(Long id, UsuarioRequestDTO usuarioDTO) {

        Usuario usuario = returnUsuario(id);

        usuario.setUsuario(usuarioDTO.getUsuario());
        usuario.setSenha(usuarioDTO.getSenha());


        return new UsuarioResponseDTO(usuarioRepository.save(usuario));
    }

    @Override
    public String delete(Long id) {
        usuarioRepository.deleteById(id);
        return "ID do Usuario: " + id + " Status: Deletado";
    }

    private Usuario returnUsuario(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não encontrado no banco de dados"));
    }
}
