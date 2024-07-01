package com.skillmatch.backend.dto.request;

import lombok.Getter;

import java.util.Date;


@Getter
public class FreelancerRequestDTO extends UsuarioRequestDTO{

    private String numDocumento;
    private String nome;
    private Date dataNascimento;
    private String descricao;
    private String areaAtuacao;
    private String habilidades;
    private String portfolio;
}
