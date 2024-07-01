package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.request.ProjetoRequestDTO;
import com.skillmatch.backend.dto.response.ProjetoResponseDTO;
import com.skillmatch.backend.entity.Projeto;
import com.skillmatch.backend.repository.ProjetoRepository;
import com.skillmatch.backend.util.ProjetoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class ProjetoServiceImpl implements IProjetoService {

    private final ProjetoRepository projetoRepository;

    private final ProjetoMapper projetoMapper;

    @Override
    public ProjetoResponseDTO findById(Long id) {

        return projetoMapper.toProjetoDTO(returnProjeto(id));
    }

    @Override
    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }

    @Override
    public ProjetoResponseDTO register(ProjetoRequestDTO projetoDTO) {
        Projeto projeto = projetoMapper.toProjeto(projetoDTO);
        return projetoMapper.toProjetoDTO(projetoRepository.save(projeto));
    }

    @Override
    public ProjetoResponseDTO update(Long id, ProjetoRequestDTO projetoDTO) {
        Projeto projeto = projetoMapper.toProjeto(projetoDTO);
        projeto.setId(id);

        return projetoMapper.toProjetoDTO(projetoRepository.save(projeto));
    }

    @Override
    public String delete(Long id) {
        projetoRepository.deleteById(id);
        return "ID do Projeto: " + id + " Status: Deletado";
    }

    private Projeto returnProjeto(Long id) {
        return projetoRepository.findById(id).orElseThrow(() -> new RuntimeException("Projeto não encontrado no banco de dados"));
    }

}
