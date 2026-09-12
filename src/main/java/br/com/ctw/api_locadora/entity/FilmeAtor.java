/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "filme_ator")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class FilmeAtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atorId;

    @Column
    private Long filmeId;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;

}
*/