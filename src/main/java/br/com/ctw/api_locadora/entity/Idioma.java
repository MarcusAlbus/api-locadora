/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "idioma")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idiomaId;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;
}
*/