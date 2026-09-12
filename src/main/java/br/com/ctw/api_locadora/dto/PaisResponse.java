package br.com.ctw.api_locadora.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.sql.Timestamp;

public record PaisResponse (


        @Schema(description= "Identificador unico do pais", example = "1")
        Long id,

        @Schema(description = "O nome do pais", example = "Brasil")
        String pais,

        @Schema(description =  "Ultima atualização", example = "2026-12-02 04:04:04")
        Timestamp ultimaAtualizacao

){
}
