package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "pais")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paisId;

    @Column(nullable = false, length = 100)
    private String pais;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
