package me.bob.com.marcsearch.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Marcenaria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "contato_id")
    private Contato contato;

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "endereco_id")
    private Endereco endereco;

    private String descricao;

}
