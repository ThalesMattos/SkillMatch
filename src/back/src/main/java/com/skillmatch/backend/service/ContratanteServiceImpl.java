package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.request.ContratanteRequestDTO;
import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.entity.Contratante;
import com.skillmatch.backend.entity.Usuario;
import com.skillmatch.backend.repository.ContratanteRepository;
import com.skillmatch.backend.util.ContratanteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class ContratanteServiceImpl implements IContratanteService {
    private final ContratanteRepository contratanteRepository;

    private final ContratanteMapper contratanteMapper;

    @Override
    public Contratante findById(Long id) {

        return returnContratante(id);
    }

    @Override
    public List<ContratanteResponseDTO> findAll() {

        return contratanteMapper.toUsuarioDTO(contratanteRepository.findAll());
    }

    @Override
    public ContratanteResponseDTO register(ContratanteRequestDTO contratanteDTO, Usuario usuario) {

        Contratante contratante = contratanteMapper.toContratante(contratanteDTO);
        contratante.setId(usuario.getId());
        contratante.setUsuario(usuario);

        return contratanteMapper.toContratanteDTO(contratanteRepository.save(contratante));
    }

    @Override
    public ContratanteResponseDTO update(Long id, ContratanteRequestDTO contratanteDTO) {

        Contratante contratante = returnContratante(id);

        contratanteMapper.updateContratanteData(contratante, contratanteDTO);

        return contratanteMapper.toContratanteDTO(contratanteRepository.save(contratante));
    }

    @Override
    public String delete(Long id) {
        contratanteRepository.deleteById(id);
        return "ID do Contratante: " + id + " Status: Deletado";
    }

    private Contratante returnContratante(Long id) {
        return contratanteRepository.findById(id).orElse(null);
    }
}
