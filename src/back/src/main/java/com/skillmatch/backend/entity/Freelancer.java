package com.skillmatch.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "freelancer")
@NoArgsConstructor
@Getter
@Setter
public class Freelancer {
    @Id
    @Column(name = "id_usuario")
    private Long id;

    @MapsId
    @Setter
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @Column(name = "num_documento", nullable = false, unique = true)
    private String numDocumento;

    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "area_atuacao", nullable = false)
    private String areaAtuacao;

    @Column(name = "habilidades", nullable = false)
    private String habilidades;

    @Column(name = "portfolio", nullable = false)
    private String portfolio;


    @Builder
    public Freelancer(String numDocumento, Date dataNascimento, String descricao, String areaAtuacao, String habilidades, String portfolio) {
        this.numDocumento = numDocumento;
        this.dataNascimento = dataNascimento;
        this.descricao = descricao;
        this.areaAtuacao = areaAtuacao;
        this.habilidades = habilidades;
        this.portfolio = portfolio;
    }
}
