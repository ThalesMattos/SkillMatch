package com.skillmatch.backend.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "servico_prestado")
@NoArgsConstructor
@Getter
@Setter
public class ServicoPrestado {
    @EmbeddedId
    private ChaveServicoPrestado idServicoPrestado;

    @ManyToOne
    @MapsId("idProjeto")
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;

    @ManyToOne
    @MapsId("idUsuarioFreelancer")
    @JoinColumn(name = "freelancer_id_usuario")
    private Freelancer course;

    @Column(name = "concluido", nullable = false)
    private boolean concluido;

    @Column(name = "pagamento", nullable = false)
    private double pagamento;
}
