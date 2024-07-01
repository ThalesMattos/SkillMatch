package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.request.ProjetoRequestDTO;
import com.skillmatch.backend.dto.response.ProjetoResponseDTO;
import com.skillmatch.backend.entity.Projeto;

import java.util.List;

public interface IProjetoService {

    ProjetoResponseDTO findById(Long id);

    List<Projeto> findAll();

    ProjetoResponseDTO register(ProjetoRequestDTO projetoDTO);

    ProjetoResponseDTO update(Long id, ProjetoRequestDTO projetoDTO);

    String delete(Long id);
}
