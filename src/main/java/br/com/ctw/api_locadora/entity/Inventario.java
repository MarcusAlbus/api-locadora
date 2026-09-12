/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "inventario")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventarioId;

    @Column
    private Long filmeId;

    @Column
    private Long lojaId;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
*/