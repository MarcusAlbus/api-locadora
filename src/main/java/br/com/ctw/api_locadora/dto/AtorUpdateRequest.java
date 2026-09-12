package br.com.ctw.api_locadora.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

public record AtorUpdateRequest(
@NotBlank(message = "o primeiro nome nao pode ser vazio")
@Size(min = 3, max = 100 ,message = "nome deve ter entre 3 e 100 carcterres")
String primeiroNome,

@NotBlank (message = "o ultimo nome nao pode ser vazio")
@Size (min = 3, max = 100 ,message = "nome deve ter entre 3 e 100 carcterres")
String ultimoNome,

Timestamp ultimaAtualizacao

){}
