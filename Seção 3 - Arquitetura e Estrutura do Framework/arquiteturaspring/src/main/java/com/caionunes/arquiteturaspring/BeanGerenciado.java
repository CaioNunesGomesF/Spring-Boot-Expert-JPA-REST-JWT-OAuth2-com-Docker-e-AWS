package com.caionunes.arquiteturaspring;

import com.caionunes.arquiteturaspring.todos.TodoEntity;
import com.caionunes.arquiteturaspring.todos.TodoValidator;
import org.hibernate.annotations.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Singleton
@Component
@Scope("Singleton")
@Scope("request")
@Scope("session")
@Scope("application")
public class BeanGerenciado {


    @Autowired
    private TodoValidator validator;

    @Autowired
    public BeanGerenciado(TodoValidator validator){
        this.validator = validator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }


}
