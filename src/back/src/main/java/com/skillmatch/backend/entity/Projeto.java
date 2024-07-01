package com.skillmatch.backend.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "projeto")
@NoArgsConstructor
@Getter
@Setter
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    // Relação muitos-para-um com Categoria:
    // Indica que um projeto pertence a uma categoria.
    // A anotação @JoinColumn especifica a coluna na tabela Projeto que armazena a chave estrangeira para a tabela Categoria.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @Column(name = "prazo", nullable = false)
    private Date prazo;

    @Column(name = "orcamento", nullable = false)
    private double orcamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contratante", nullable = false)
    private Contratante contratante;

    private LocalDateTime startTime;

    private LocalDateTime publishTime;


    @Builder
    public Projeto(Long id, String titulo, String descricao, Categoria categoria, Date prazo, double orcamento, Contratante contratante){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.prazo = prazo;
        this.orcamento = orcamento;
        this.contratante = contratante;
    }

}
