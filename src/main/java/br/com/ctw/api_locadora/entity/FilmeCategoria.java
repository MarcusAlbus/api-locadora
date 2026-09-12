/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "filme_categoria")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class FilmeCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmeId;

    @Column
    private Long categoriaId;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
*/