package com.skillmatch.backend.util;

import com.skillmatch.backend.dto.request.ProjetoRequestDTO;
import com.skillmatch.backend.dto.response.CategoriaResponseDTO;
import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.dto.response.ProjetoResponseDTO;
import com.skillmatch.backend.entity.Projeto;
import com.skillmatch.backend.service.ICategoriaService;
import com.skillmatch.backend.service.IContratanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProjetoMapper {
    private final IContratanteService contratanteService;
    private final ICategoriaService categoriaService;

    public Projeto toProjeto(ProjetoRequestDTO projetoDTO){

        return this.toProjeto(projetoDTO, null);
    }

    public Projeto toProjeto(ProjetoRequestDTO projetoDTO, Long id){

        return Projeto.builder()
                .id(id)
                .titulo(projetoDTO.getTitulo())
                .descricao(projetoDTO.getDescricao())
                .prazo(projetoDTO.getPrazo())
                .orcamento(projetoDTO.getOrcamento())
                .contratante(contratanteService.findById(projetoDTO.getIdContratante()))
                .categoria(categoriaService.findById(projetoDTO.getIdCategoria()))
                .build();
    }

    public ProjetoResponseDTO toProjetoDTO(Projeto projeto){
        return ProjetoResponseDTO.builder()
                .id(projeto.getId())
                .titulo(projeto.getTitulo())
                .descricao(projeto.getDescricao())
                .prazo(projeto.getPrazo())
                .orcamento(projeto.getOrcamento())
                .contratante(new ContratanteResponseDTO(projeto.getContratante()))
                .categoria(new CategoriaResponseDTO(projeto.getCategoria()))
                .build();
    }
}
