package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "pagamento")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagamentoId;

    @Column
    private Long clienteId;

    @Column
    private Long funcionarioId;

    @Column
    private Long aluguelId;

    @Column(nullable = false)
    private Double valor;

    @Column
    private LocalDateTime dataPagamento;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;

}
