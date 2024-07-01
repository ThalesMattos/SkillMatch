package com.skillmatch.backend.dto.response;

import com.skillmatch.backend.entity.Categoria;
import com.skillmatch.backend.entity.Contratante;
import com.skillmatch.backend.entity.Projeto;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
public class ProjetoResponseDTO {
    private Long id;
    private String titulo;
    private String descricao;
    private CategoriaResponseDTO categoria;
    private Date prazo;
    private double orcamento;
    private ContratanteResponseDTO contratante;

    @Builder
    public ProjetoResponseDTO(Long id, String titulo, String descricao, CategoriaResponseDTO categoria, Date prazo, double orcamento, ContratanteResponseDTO contratante){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.prazo = prazo;
        this.orcamento = orcamento;
        this.contratante = contratante;
    }

    public ProjetoResponseDTO(Projeto projeto){
        this.id = projeto.getId();
        this.titulo = projeto.getTitulo();
        this.descricao = projeto.getDescricao();
        this.categoria = new CategoriaResponseDTO(projeto.getCategoria());
        this.prazo = projeto.getPrazo();
        this.orcamento = projeto.getOrcamento();
        this.contratante = new ContratanteResponseDTO(projeto.getContratante());
    }
}
