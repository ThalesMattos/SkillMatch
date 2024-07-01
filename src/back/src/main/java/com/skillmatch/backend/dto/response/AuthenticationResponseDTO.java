package com.skillmatch.backend.dto.response;

import com.skillmatch.backend.entity.AuthToken;
import com.skillmatch.backend.entity.Usuario;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AuthenticationResponseDTO {
    private LocalDateTime expirationDate;
    private String token;
    private String tipo;
    private UsuarioResponseDTO usuario;

    public AuthenticationResponseDTO(AuthToken token, String tipo) {
        this.token = token.getToken();
        this.tipo = tipo;
        this.expirationDate = token.getExpirationDate();
        this.usuario = new UsuarioResponseDTO(token.getUsuario());
    }
    public AuthenticationResponseDTO() {}
}
