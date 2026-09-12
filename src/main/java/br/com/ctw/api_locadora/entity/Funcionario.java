/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "funcionario")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long funcionarioId;

    @Column(nullable = false, length = 15)
    private String primeiroNome;

    @Column(nullable = false, length = 15)
    private String ultimoNome;

    @Column
    private Long enderecoId;

    @Column(nullable = false, length = 70)
    private String email;

    @Column
    private Long lojaId;

    @Column(nullable = false)
    private Integer aitvo;

    @Column(nullable = false, length = 70)
    private String usuario;

    @Column(nullable = false, length = 60)
    private String senha;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
*/