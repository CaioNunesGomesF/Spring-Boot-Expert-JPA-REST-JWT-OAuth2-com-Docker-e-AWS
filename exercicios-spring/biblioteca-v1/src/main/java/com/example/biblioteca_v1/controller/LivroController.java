package com.example.biblioteca_v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca_v1.Model.Livro;
import com.example.biblioteca_v1.repository.LivroRepository;



@RestController
@RequestMapping("livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro) {
        System.out.println("Recebido: " + livro.getNome());

        return this.livroRepository.save(livro);  
    }

    @PostMapping
    public List<Livro> adicionarLivros(@RequestBody List<Livro> livro) {
        System.out.println("Recebida uma lista de livros. ");

        return this.livroRepository.saveAll(livro);
    }

    @GetMapping
    public List<Livro> listarTodosLivros() {
        return livroRepository.findAll();
    }

    @GetMapping("{id}")
    public Livro obterLivro(@PathVariable("id") Integer id){
        return livroRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletarLivro(@PathVariable("id") Integer id){
        livroRepository.deleteById(id);
    }
    
    

}
