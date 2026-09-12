package br.com.ctw.api_locadora.controller;

import br.com.ctw.api_locadora.dto.AtorCreateRequest;
import br.com.ctw.api_locadora.dto.AtorPatchRequest;
import br.com.ctw.api_locadora.dto.AtorResponse;
import br.com.ctw.api_locadora.dto.AtorUpdateRequest;
import br.com.ctw.api_locadora.entity.Ator;
import br.com.ctw.api_locadora.service.AtorService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/v1/atores")

public class AtorController {
    private final AtorService service;
    private final AtomicLong sequencialId = new AtomicLong(1);

    private final List<Ator> atores = new ArrayList<>();


    public AtorController(AtorService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AtorResponse>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping(params = {"primeiroNome", "ultimoNome"})
    public ResponseEntity<List<AtorResponse>> buscarPorNome(
            @Parameter(description = "O primero nome do ator", example = "Mateus")
            @RequestParam String primeiroNome,

            @Parameter(description = "O segundo nome do ator", example = "Estevo")
            @RequestParam String ultimoNome
    ){
        List<AtorResponse> atores = service.buscarPorNome(primeiroNome, ultimoNome);
        return ResponseEntity.ok(atores);
    }


    @PostMapping
    public ResponseEntity<AtorResponse> cadastrar(@Valid @RequestBody AtorCreateRequest request) {
        AtorResponse ator = service.cadastrar(request);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(ator.id())
                .toUri();

        return ResponseEntity.created(uri).body(ator);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AtorResponse> buscarPorId(
            @Parameter(description = "identificar id do ator ", example = "1")
            @PathVariable Long id
    )   {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AtorResponse> atualizar(
            @Parameter(description = "identificador id do ator", example = "1")
            @PathVariable Long id,
            @Valid @RequestBody AtorUpdateRequest request
            ){
        return  ResponseEntity.ok(service.atualizar(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(
            @Parameter(description = "identificador id do ator", example = "1")
            @PathVariable Long id
    ){
        service.remover(id);
        return ResponseEntity.noContent().build();
    }


    @PatchMapping("/{id}")
    public ResponseEntity<AtorResponse> atualizarParcialmente(
            @Parameter(description = "identificador id do ator", example = "1")
            @PathVariable Long id,
            @RequestBody AtorPatchRequest request
    ){
        return  ResponseEntity.ok(service.atualizarParcialmente(id, request));
    }
}
