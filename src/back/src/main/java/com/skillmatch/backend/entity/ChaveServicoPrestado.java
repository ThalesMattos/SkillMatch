package com.skillmatch.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ChaveServicoPrestado implements Serializable {
    @Column(name = "projeto_id")
    private Long idProjeto;

    @Column(name = "freelancer_id_usuario")
    private Long idUsuarioFreelancer;

}
