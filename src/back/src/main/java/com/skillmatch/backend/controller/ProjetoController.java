package com.skillmatch.backend.controller;

import com.skillmatch.backend.dto.request.ProjetoRequestDTO;
import com.skillmatch.backend.dto.response.CategoriaResponseDTO;
import com.skillmatch.backend.dto.response.ProjetoResponseDTO;
import com.skillmatch.backend.entity.Projeto;
import com.skillmatch.backend.service.ICategoriaService;
import com.skillmatch.backend.service.IProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping(value = "/projeto")
@RequiredArgsConstructor
public class ProjetoController {
    private final IProjetoService projetoService;
    private final ICategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProjetoResponseDTO> findById(@PathVariable(name = "id") Long id){

        return ResponseEntity.ok().body(projetoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProjetoResponseDTO>> findAll(){
        return ResponseEntity.ok().body(projetoService.findAll().stream().map(ProjetoResponseDTO::new).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<ProjetoResponseDTO> register (@RequestBody ProjetoRequestDTO projetoDTO, UriComponentsBuilder uriBuilder) {
        ProjetoResponseDTO contratanteResponseDTO = projetoService.register(projetoDTO);

        URI uri = uriBuilder.path("/contratante/{id}").buildAndExpand(contratanteResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(contratanteResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProjetoResponseDTO> update(@RequestBody ProjetoRequestDTO projetoDTO, @PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(projetoService.update(id, projetoDTO));

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(projetoService.delete(id));
    }

    @GetMapping(value = "/categorias")
    public ResponseEntity<List<CategoriaResponseDTO>> findAllCategorias(){
        return ResponseEntity.ok().body(categoriaService.findAll().stream().map(CategoriaResponseDTO::new).collect(Collectors.toList()));
    }

    @GetMapping(value = "/tempo-medio-publicacao")
    public ResponseEntity<Double> getAveragePublicationTime() {
        List<Projeto> allProjects = projetoService.findAll();
        double averageTime = allProjects.stream()
                .mapToDouble(projeto -> Duration.between(projeto.getStartTime(), projeto.getPublishTime()).toMinutes())
                .average()
                .orElse(0.0);

        return ResponseEntity.ok().body(averageTime);
    }

}
