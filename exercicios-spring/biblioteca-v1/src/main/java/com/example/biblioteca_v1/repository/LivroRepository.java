package com.example.biblioteca_v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca_v1.Model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

    
    
}
