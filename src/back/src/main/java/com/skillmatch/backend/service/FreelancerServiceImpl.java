package com.skillmatch.backend.service;

import com.skillmatch.backend.dto.request.FreelancerRequestDTO;
import com.skillmatch.backend.dto.response.FreelancerResponseDTO;
import com.skillmatch.backend.entity.Freelancer;
import com.skillmatch.backend.entity.Usuario;
import com.skillmatch.backend.repository.FreelancerRepository;
import com.skillmatch.backend.util.FreelancerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class FreelancerServiceImpl implements IFreelancerService {

    private final FreelancerRepository freelancerRepository;

    private final FreelancerMapper freelancerMapper;

    @Override
    public Freelancer findById(Long id) {

        return returnFreelancer(id);
    }

    @Override
    public List<FreelancerResponseDTO> findAll() {

        return freelancerMapper.toUsuarioDTO(freelancerRepository.findAll());
    }

    @Override
    public FreelancerResponseDTO register(FreelancerRequestDTO freelancerDTO, Usuario usuario) {

        Freelancer freelancer = freelancerMapper.toFreelancer(freelancerDTO);
        freelancer.setUsuario(usuario);
        freelancer.setId(usuario.getId());

        return freelancerMapper.toFreelancerDTO(freelancerRepository.save(freelancer));
    }

    @Override
    public FreelancerResponseDTO update(Long id, FreelancerRequestDTO freelancerDTO) {

        Freelancer freelancer = returnFreelancer(id);

        freelancerMapper.updateFreelancerData(freelancer, freelancerDTO);

        return freelancerMapper.toFreelancerDTO(freelancerRepository.save(freelancer));
    }

    @Override
    public String delete(Long id) {
        freelancerRepository.deleteById(id);
        return "ID do Freelancer: " + id + " Status: Deletado";
    }

    private Freelancer returnFreelancer(Long id) {
        return freelancerRepository.findById(id).orElse(null);
    }

}
