package com.skillmatch.backend.service;


import com.skillmatch.backend.dto.request.FreelancerRequestDTO;
import com.skillmatch.backend.dto.response.FreelancerResponseDTO;
import com.skillmatch.backend.entity.Freelancer;
import com.skillmatch.backend.entity.Usuario;

import java.util.List;

public interface IFreelancerService {

    Freelancer findById(Long id);

    List<FreelancerResponseDTO> findAll();

    FreelancerResponseDTO register(FreelancerRequestDTO freelancerDTO, Usuario usuario);

    FreelancerResponseDTO update(Long id, FreelancerRequestDTO freelancerDTO);

    String delete(Long id);
}
