package com.caionunes.arquiteturaspring.todos;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class TodoService {


    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository repository, TodoValidator validator, MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
        String status = todo.getConluido() == Boolean.TRUE ? "Concluido" : "Não concluido";
        mailSender.enviar("Todo " + todo.getDescricao() + " foi atualizado para " + status + "!");
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }

}
