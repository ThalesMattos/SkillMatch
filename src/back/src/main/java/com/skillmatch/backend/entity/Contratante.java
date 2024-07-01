package com.skillmatch.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "contratante")
@NoArgsConstructor
@Getter
@Setter
public class Contratante {
    @Id
    @Column(name="id_usuario")
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @Column(name = "num_documento", nullable = false, unique = true)
    private String numDocumento;

    // Relação um-para-muitos com Projeto:
    // Indica que um contratante pode ter vários projetos.
    // A anotação @OneToMany indica que a relação é mapeada pelo campo "contratante" na classe Projeto.
    // CascadeType.ALL define o tipo de cascata, permitindo operações de persistência em cascata entre contratante e projetos associados.
    @OneToMany(mappedBy = "contratante", cascade = CascadeType.ALL)
    private List<Projeto> projetos = new ArrayList<>();

    @Builder
    public Contratante(Long id, String numDocumento) {
        //this.id = id;
        this.numDocumento = numDocumento;
    }
}
