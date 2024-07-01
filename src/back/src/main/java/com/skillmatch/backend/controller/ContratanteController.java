package com.skillmatch.backend.controller;

import com.google.common.hash.Hashing;
import com.skillmatch.backend.dto.request.ContratanteRequestDTO;
import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.dto.response.FreelancerResponseDTO;
import com.skillmatch.backend.dto.response.UsuarioResponseDTO;
import com.skillmatch.backend.entity.Usuario;
import com.skillmatch.backend.repository.UsuarioRepository;
import com.skillmatch.backend.service.IAuthenticationService;
import com.skillmatch.backend.service.IContratanteService;
import com.skillmatch.backend.service.IUsuarioService;
import com.skillmatch.backend.service.UsuarioServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping(value = "/contratante")
@RequiredArgsConstructor
@CrossOrigin
public class ContratanteController {
    private final IContratanteService contratanteService;
    private final IUsuarioService usuarioService;
    private final IAuthenticationService authenticationService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ContratanteResponseDTO> findById(@PathVariable(name = "id") Long id){
        /*if(authenticationService.validateTokenValidAndBelongsToUsuarioId(authToken, id)){
        , @CookieValue("skillmatch-token") String authToken
        }else{
            return ResponseEntity.notFound().build();
        }*/
        return ResponseEntity.ok().body(new ContratanteResponseDTO(contratanteService.findById(id)));
    }

//    @GetMapping
//    public ResponseEntity<List<ContratanteResponseDTO>> findAll(){
//        return ResponseEntity.ok().body(contratanteService.findAll());
//
//    }

    @PostMapping
    public ResponseEntity<ContratanteResponseDTO> register (@RequestBody ContratanteRequestDTO contratanteDTO, UriComponentsBuilder uriBuilder) {
        Usuario usuario =  usuarioService.register(contratanteDTO);

        ContratanteResponseDTO contratanteResponseDTO = contratanteService.register(contratanteDTO, usuario);

        URI uri = uriBuilder.path("/contratante/{id}").buildAndExpand(contratanteResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(contratanteResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ContratanteResponseDTO> update(@RequestBody ContratanteRequestDTO contratanteDTO, @PathVariable(name = "id") Long id, @CookieValue("skillmatch-token") String authToken){
        if(authenticationService.validateTokenValidAndBelongsToUsuarioId(authToken, id)){
            return ResponseEntity.ok().body(contratanteService.update(id, contratanteDTO));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id, @CookieValue("skillmatch-token") String authToken){
        if(authenticationService.validateTokenValidAndBelongsToUsuarioId(authToken, id)){
            return ResponseEntity.ok().body(contratanteService.delete(id));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
