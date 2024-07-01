package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.response.CategoriaResponseDTO;
import com.skillmatch.backend.entity.Categoria;

import java.util.List;

public interface ICategoriaService {

    Categoria findById(Long id);

    List<Categoria> findAll();
}
