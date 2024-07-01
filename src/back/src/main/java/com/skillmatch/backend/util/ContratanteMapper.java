package com.skillmatch.backend.util;

import com.skillmatch.backend.dto.request.ContratanteRequestDTO;
import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.entity.Contratante;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContratanteMapper {

    public Contratante toContratante(ContratanteRequestDTO contratanteDTO){

        return Contratante.builder()
                .numDocumento(contratanteDTO.getNumDocumento())
                .build();
    }

    public ContratanteResponseDTO toContratanteDTO(Contratante freelancer){
        return new ContratanteResponseDTO(freelancer);
    }

    public List<ContratanteResponseDTO> toUsuarioDTO(List<Contratante> usuarioList){
        return usuarioList.stream().map(ContratanteResponseDTO::new).collect(Collectors.toList());
    }

    public void updateContratanteData(Contratante freelancer, ContratanteRequestDTO contratanteDTO){

        freelancer.setNumDocumento(contratanteDTO.getNumDocumento());
    }
}
