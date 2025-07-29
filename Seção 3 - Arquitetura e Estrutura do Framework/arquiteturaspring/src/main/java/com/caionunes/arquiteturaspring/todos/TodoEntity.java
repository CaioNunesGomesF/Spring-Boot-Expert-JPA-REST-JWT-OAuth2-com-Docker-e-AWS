package com.caionunes.arquiteturaspring.todos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "fl_conluido")
    private Boolean conluido;

    public TodoEntity(Integer id, String descricao, Boolean conluido) {
        this.id = id;
        this.descricao = descricao;
        this.conluido = conluido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConluido() {
        return conluido;
    }

    public void setConluido(Boolean conluido) {
        this.conluido = conluido;
    }
}
