package com.example.biblioteca_v1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Livro {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(GenerationType.AUTO)
    private Integer id_livro;
    
    @Column(name = "name")
    private String nome;

    @Column(name = "autor")
    private String autor;

    @Column(name = "valor")
    private Double valor;

}
