package com.skillmatch.backend.dto.request;

import lombok.Getter;

import java.util.Date;

@Getter
public class ContratanteRequestDTO extends UsuarioRequestDTO {
    private String numDocumento;
}