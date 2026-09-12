/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "loja")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lojaId;

    @Column
    private Long gerenteId;

    @Column
    private Long enderecoId;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;

}
*/