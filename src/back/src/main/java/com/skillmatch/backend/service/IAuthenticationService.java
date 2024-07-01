package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.request.UsuarioRequestDTO;
import com.skillmatch.backend.dto.response.AuthenticationResponseDTO;
import com.skillmatch.backend.entity.AuthToken;

public interface IAuthenticationService {
    AuthToken registerToken(Long idUsuario);
    boolean checkValid(String tokenUUID);
    boolean checkValid(AuthToken token);

    AuthenticationResponseDTO validateCredentials(UsuarioRequestDTO usuarioDTO);
    AuthToken findById(String tokenUUID);
    boolean validateTokenValidAndBelongsToUsuarioId(String authToken, Long usuarioId);

    AuthToken findByUsuario(Long idUsuario);
}
