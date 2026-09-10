package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "ator")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder


public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atorId;

    @Column(nullable = false, length = 15)
    private String primeiroNome;

    @Column(nullable = false, length = 15)
    private String ultimoNome;

    @Column
    private Timestamp ultimaAtualizacao;

}
