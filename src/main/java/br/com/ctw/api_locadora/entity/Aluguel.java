package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "aluguel")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder


public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aluguelId;

    @Column(nullable = false)
    private Date dataAluguel;

    @Column(nullable = false)
    private Long inventarioId;

    @Column(nullable = false)
    private Long clienteId;

    @Column(nullable = false)
    private Date dataDevolucao;

    @Column(nullable = false)
    private Long funcionarioId;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;

}
