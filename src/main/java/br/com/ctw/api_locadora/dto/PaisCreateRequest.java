package br.com.ctw.api_locadora.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

public record PaisCreateRequest(
        @NotBlank(message = "o nome do pais nao pode ser vazio")
        @Size( min = 3, max = 50)
        String pais,

        Timestamp ultimaAtualizacao
) {
}
