package com.skillmatch.backend.dto.response;

import com.skillmatch.backend.entity.Freelancer;
import lombok.Getter;

import java.util.Date;

@Getter
public class FreelancerResponseDTO extends UsuarioResponseDTO {
    private String numDocumento;
    private Date dataNascimento;
    private String descricao;
    private String areaAtuacao;
    private String habilidades;
    private String portfolio;

    public FreelancerResponseDTO(Freelancer freelancer){
        super(freelancer.getUsuario());
        this.numDocumento = freelancer.getNumDocumento();
        this.dataNascimento = freelancer.getDataNascimento();
        this.descricao = freelancer.getDescricao();
        this.areaAtuacao = freelancer.getAreaAtuacao();
        this.habilidades = freelancer.getHabilidades();
        this.portfolio = freelancer.getPortfolio();
    }

}
