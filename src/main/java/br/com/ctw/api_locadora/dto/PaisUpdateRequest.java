package br.com.ctw.api_locadora.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

public record PaisUpdateRequest(
        @NotBlank(message = "o nome nao pode ser vazio")
        @Size(min = 3, max = 100 ,message = "nome deve ter entre 3 e 50 carcterres")
        String pais,

        Timestamp ultimaAtualizacao) {

}
