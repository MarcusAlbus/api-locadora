/*package br.com.ctw.api_locadora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.Year;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "filme")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder


public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmeId;

    @Column(nullable = false, length = 70)
    private String titulo;

    @Column(nullable = false, length = 255)
    private String descricao;

    @Column(nullable = false)
    private Year anoLancamento;

    @Column
    private Long idiomaId;

    @Column
    private Long idiomaOriginalId;

    @Column(nullable = false)
    private Integer duracaoLocacao;

    @Column(nullable = false)
    private Double precoLocacao;

    @Column(nullable = false)
    private Integer duracaoFilme;

    @Column(nullable = false)
    private Double custoSubstituicao;

    @Column(nullable = false)
    private ClasificacaoEnum classificacao;

    @Column(nullable = false)
    private Set recursosEspeciais;

    @Column(nullable = false)
    private Timestamp ultimaAtualizacao;

}
*/