package com.skillmatch.backend.dto.response;

import com.skillmatch.backend.entity.Contratante;
import com.skillmatch.backend.entity.Freelancer;
import lombok.Getter;

import java.util.Date;

@Getter
public class ContratanteResponseDTO extends UsuarioResponseDTO{
    private String numDocumento;
    public ContratanteResponseDTO(Contratante contratante){
        super(contratante.getUsuario());
        this.numDocumento = contratante.getNumDocumento();
    }

}
