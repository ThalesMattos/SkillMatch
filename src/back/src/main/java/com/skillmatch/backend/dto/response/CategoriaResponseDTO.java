package com.skillmatch.backend.dto.response;

import com.skillmatch.backend.entity.Categoria;
import com.skillmatch.backend.entity.Contratante;
import lombok.Getter;

@Getter
public class CategoriaResponseDTO{
    private Long id;
    private String nome;
    private String descricao;

    public CategoriaResponseDTO(Categoria categoria){
        this.id = categoria.getId();
        this.nome = categoria.getNome();
        this.descricao = categoria.getDescricao();
    }
}
