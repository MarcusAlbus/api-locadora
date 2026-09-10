package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "endereco")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enderecoId;

    @Column(nullable = false, length = 100)
    private String endereco;

    @Column(nullable = false, length = 100)
    private String endereco2;

    @Column(nullable = false, length = 70)
    private String bairro;

    @Column
    private Long cidadeId;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false, length = 17)
    private String telefone;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
