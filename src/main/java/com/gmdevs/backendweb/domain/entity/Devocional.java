package com.gmdevs.backendweb.domain.entity;

public class Devocional {

    private Long id;
    private String title;
    private String description;
    private Usuario usuario;

    public Devocional() {
    }

    public Devocional(Long id, String title, String description, Usuario usuario) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
