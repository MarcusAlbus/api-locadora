package br.com.ctw.api_locadora.controller;


import br.com.ctw.api_locadora.dto.PaisCreateRequest;
import br.com.ctw.api_locadora.dto.PaisPatchRequest;
import br.com.ctw.api_locadora.dto.PaisResponse;
import br.com.ctw.api_locadora.dto.PaisUpdateRequest;
import br.com.ctw.api_locadora.entity.Pais;
import br.com.ctw.api_locadora.service.PaisService;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/v1/pais")

public class PaisController {


    private final PaisService service;
    private final AtomicLong sequencialId = new AtomicLong(1);

    private final List<Pais> paises = new ArrayList<>();


    public PaisController(PaisService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PaisResponse>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping(params = {"pais"})
    public ResponseEntity<List<PaisResponse>> buscarPorNome(
            @Parameter(description = "O primero nome do pis", example = "Brasil")
            @RequestParam String pais

    ){
        List<PaisResponse> paises = service.buscarPorNome(pais);
        return ResponseEntity.ok(paises);
    }


    @PostMapping
    public ResponseEntity<PaisResponse> cadastrar(@Valid @RequestBody PaisCreateRequest request) {
        PaisResponse pais = service.cadastrar(request);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pais.id())
                .toUri();

        return ResponseEntity.created(uri).body(pais);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaisResponse> buscarPorId(
            @Parameter(description = "identificar id do pais ", example = "1")
            @PathVariable Long id
    )   {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaisResponse> atualizar(
            @Parameter(description = "identificador id do pais", example = "1")
            @PathVariable Long id,
            @Valid @RequestBody PaisUpdateRequest request
    ){
        return  ResponseEntity.ok(service.atualizar(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(
            @Parameter(description = "identificador id do pais", example = "1")
            @PathVariable Long id
    ){
        service.remover(id);
        return ResponseEntity.noContent().build();
    }


    @PatchMapping("/{id}")
    public ResponseEntity<PaisResponse> atualizarParcialmente(
            @Parameter(description = "identificador id do pais", example = "1")
            @PathVariable Long id,
            @RequestBody PaisPatchRequest request
    ){
        return  ResponseEntity.ok(service.atualizarParcialmente(id, request));
    }
}
