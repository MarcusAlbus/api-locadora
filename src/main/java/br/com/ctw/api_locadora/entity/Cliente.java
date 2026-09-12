/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;

    @Column
    private Long lojaId;

    @Column(nullable = false, length = 15)
    private String primeiroNome;

    @Column(nullable = false, length = 15)
    private String ultimoNome;

    @Column(nullable = false, length = 80)
    private String email;

    @Column
    private Long enderecoId;

    @Column(nullable = false)
    private Integer ativo;

    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
*/