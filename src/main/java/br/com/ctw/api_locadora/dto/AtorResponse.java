package br.com.ctw.api_locadora.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.sql.Timestamp;

@Schema(description = "dados de um ator retornados pela api")

public record AtorResponse(

        @Schema(description= "Identificador unico do ator", example = "1")
        Long id,

        @Schema(description = "Primeiro nome do ator", example = "Mateus")
        String primeiroNome,

        @Schema(description = "Ultimo nome do ator", example = "Estevo")
        String ultimoNome,

        @Schema(description =  "Ultima atualização", example = "2026-12-02 04:04:04")
        Timestamp ultimaAtualizacao
) {
}


