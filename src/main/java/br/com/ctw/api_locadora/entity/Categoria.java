/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "categoria")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoriaId;

    @Column(nullable = false, length = 35)
    private String nome;

    @Column
    private Timestamp ultimaAtualizacao;

}
*/