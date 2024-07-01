package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.response.CategoriaResponseDTO;
import com.skillmatch.backend.entity.Categoria;
import com.skillmatch.backend.entity.Projeto;
import com.skillmatch.backend.repository.CategoriaRepository;
import com.skillmatch.backend.util.ProjetoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
@RequiredArgsConstructor
public class CategoriaServiceImpl implements ICategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Override
    public Categoria findById(Long id) {

        return returnCategoria(id);
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    private Categoria returnCategoria(Long id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Categoria não encontrada no banco de dados"));
    }

}
