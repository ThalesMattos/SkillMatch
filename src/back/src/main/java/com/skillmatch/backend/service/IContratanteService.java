package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.request.ContratanteRequestDTO;
import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.entity.Contratante;
import com.skillmatch.backend.entity.Usuario;

import java.util.List;

public interface IContratanteService {

    Contratante findById(Long id);

    List<ContratanteResponseDTO> findAll();

    ContratanteResponseDTO register(ContratanteRequestDTO freelancerDTO, Usuario usuario);

    ContratanteResponseDTO update(Long id, ContratanteRequestDTO freelancerDTO);

    String delete(Long id);
}
