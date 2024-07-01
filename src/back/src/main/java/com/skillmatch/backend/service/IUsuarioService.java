package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.request.UsuarioRequestDTO;
import com.skillmatch.backend.dto.response.UsuarioResponseDTO;
import com.skillmatch.backend.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    UsuarioResponseDTO findById(Long id);

    Usuario findByLoginInformation(String usuario, String senha);

    List<UsuarioResponseDTO> findAll();
    Usuario register(UsuarioRequestDTO usuarioDTO);

    UsuarioResponseDTO update(Long id, UsuarioRequestDTO usuarioDTO);

    String delete(Long id);

}
