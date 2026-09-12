package br.com.ctw.api_locadora.dto;

import java.sql.Timestamp;

public record PaisPatchRequest(String pais, Timestamp ultimaAtualizacao) {
}
