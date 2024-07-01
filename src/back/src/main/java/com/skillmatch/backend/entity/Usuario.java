package com.skillmatch.backend.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@Getter
@Setter
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "usuario", nullable = false, unique = true)
    private String usuario;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "nome")
    private String nome;

    @Builder
    public Usuario(String usuario, String senha){
        this.setUsuario(usuario);
        this.setSenha(senha);
    }
}
