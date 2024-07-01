package com.skillmatch.backend.dto.request;

import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.entity.Categoria;
import lombok.Getter;

import java.util.Date;


@Getter
public class ProjetoRequestDTO {
    private String titulo;
    private String descricao;
    private Long idCategoria;
    private Date prazo;
    private double orcamento;
    private Long idContratante;
}
