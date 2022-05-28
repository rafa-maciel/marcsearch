package me.bob.com.marcsearch.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class    Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
}
