package br.com.ctw.api_locadora.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AtorCreateRequest {
    @Schema(
            description = "Nome do Ator",
            example = "Notebook Dell"
    )
    @NotBlank(message = "o nome é obrigatório")
    @Size(min=3, max= 100, message = "o nome deve possuir entre 3 e 100 caracteres")

}
