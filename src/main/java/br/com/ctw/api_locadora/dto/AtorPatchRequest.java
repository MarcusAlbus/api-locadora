package br.com.ctw.api_locadora.dto;

import java.sql.Timestamp;

public record AtorPatchRequest(String primeiroNome,
                                          String ultimoNome,
                                          Timestamp ultimaAtualizacao){
}
