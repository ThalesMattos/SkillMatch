package com.skillmatch.backend.util;

import com.skillmatch.backend.dto.request.FreelancerRequestDTO;
import com.skillmatch.backend.dto.response.FreelancerResponseDTO;
import com.skillmatch.backend.entity.Freelancer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FreelancerMapper {

    public Freelancer toFreelancer(FreelancerRequestDTO freelancerDTO){

        return Freelancer.builder()
                .numDocumento(freelancerDTO.getNumDocumento())
                .dataNascimento(freelancerDTO.getDataNascimento())
                .descricao(freelancerDTO.getDescricao())
                .areaAtuacao(freelancerDTO.getAreaAtuacao())
                .habilidades(freelancerDTO.getHabilidades())
                .portfolio(freelancerDTO.getPortfolio())
                .build();
    }

    public FreelancerResponseDTO toFreelancerDTO(Freelancer freelancer){
        return new FreelancerResponseDTO(freelancer);
    }

    public List<FreelancerResponseDTO> toUsuarioDTO(List<Freelancer> usuarioList){
        return usuarioList.stream().map(FreelancerResponseDTO::new).collect(Collectors.toList());
    }

    public void updateFreelancerData(Freelancer freelancer, FreelancerRequestDTO freelancerDTO){

        freelancer.setNumDocumento(freelancerDTO.getNumDocumento());
        freelancer.setDataNascimento(freelancerDTO.getDataNascimento());
        freelancer.setDescricao(freelancerDTO.getDescricao());
        freelancer.setAreaAtuacao(freelancerDTO.getAreaAtuacao());
        freelancer.setHabilidades(freelancerDTO.getHabilidades());
        freelancer.setPortfolio(freelancerDTO.getPortfolio());
    }

}
