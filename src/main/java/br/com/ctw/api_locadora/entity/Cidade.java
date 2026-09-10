package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "cidade")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cidadeId;

    @Column(nullable = false, length = 70)
    private String cidade;

    @Column
    private Long paisId;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
