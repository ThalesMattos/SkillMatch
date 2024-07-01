package com.skillmatch.backend.controller;

import com.google.common.hash.Hashing;
import com.skillmatch.backend.dto.request.FreelancerRequestDTO;
import com.skillmatch.backend.dto.response.ContratanteResponseDTO;
import com.skillmatch.backend.dto.response.FreelancerResponseDTO;
import com.skillmatch.backend.dto.response.UsuarioResponseDTO;
import com.skillmatch.backend.entity.AuthToken;
import com.skillmatch.backend.entity.Freelancer;
import com.skillmatch.backend.entity.Usuario;
import com.skillmatch.backend.service.IAuthenticationService;
import com.skillmatch.backend.service.IFreelancerService;
import com.skillmatch.backend.service.IUsuarioService;
import com.skillmatch.backend.util.FreelancerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/freelancer")
@RequiredArgsConstructor
public class FreelancerController {

    private final IFreelancerService freelancerService;
    private final IUsuarioService usuarioService;
    private final IAuthenticationService authenticationService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FreelancerResponseDTO> findById(@PathVariable(name = "id") Long id, @CookieValue("skillmatch-token") String authToken){
        if(authenticationService.validateTokenValidAndBelongsToUsuarioId(authToken, id)){
            return ResponseEntity.ok().body(new FreelancerResponseDTO(freelancerService.findById(id)));
        }else{
            return ResponseEntity.notFound().build();
        }

    }

//    @GetMapping
//    public ResponseEntity<List<FreelancerResponseDTO>> findAll(){
//        return ResponseEntity.ok().body(freelancerService.findAll());
//
//    }

    @PostMapping
    public ResponseEntity<FreelancerResponseDTO> register (@RequestBody FreelancerRequestDTO freelancerRequestDTO, UriComponentsBuilder uriBuilder) {
        Usuario usuario =  usuarioService.register(freelancerRequestDTO);

        FreelancerResponseDTO freelancerResponseDTO = freelancerService.register(freelancerRequestDTO, usuario);

        URI uri = uriBuilder.path("/freelancer/{id}").buildAndExpand(freelancerResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(freelancerResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<FreelancerResponseDTO> update(@RequestBody FreelancerRequestDTO freelancerDTO, @PathVariable(name = "id") Long id, @CookieValue("skillmatch-token") String authToken){
        if(authenticationService.validateTokenValidAndBelongsToUsuarioId(authToken, id)){
            return ResponseEntity.ok().body(freelancerService.update(id, freelancerDTO));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id, @CookieValue("skillmatch-token") String authToken){
        if(authenticationService.validateTokenValidAndBelongsToUsuarioId(authToken, id)){
            return ResponseEntity.ok().body(freelancerService.delete(id));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
