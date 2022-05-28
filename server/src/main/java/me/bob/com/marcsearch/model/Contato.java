package me.bob.com.marcsearch.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Contato {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroCelular;
    private String numeroTelefone;
    private String email;
}
