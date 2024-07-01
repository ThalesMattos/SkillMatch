package com.skillmatch.backend.dto.response;

import com.skillmatch.backend.entity.Usuario;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter(AccessLevel.PROTECTED)
@Getter
public class UsuarioResponseDTO {
    private Long id;
    private String usuario;
    private String nome;

    public UsuarioResponseDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.usuario = usuario.getUsuario();
        this.nome = usuario.getNome();
    }
    @Builder
    public UsuarioResponseDTO(Long id) {
        this.id = id;
    }
}
