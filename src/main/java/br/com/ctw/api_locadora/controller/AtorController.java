/*package br.com.ctw.api_locadora.controller;

import br.com.ctw.api_locadora.service.AtorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "ator",
        description = "Operações relacionadas ao gerenciamento de atores"
)
@RestController
@RequestMapping("/api/v1/atores")

public class AtorController {
    private final AtorService service;

    public AtorController(AtorService service){
        this.service = service;
    }

    @Operation(
            summary = "Lista de produtos",
            description = "Retorna todos os produtos cadastrados"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Produtos retornados com sucesso"
    )

}
