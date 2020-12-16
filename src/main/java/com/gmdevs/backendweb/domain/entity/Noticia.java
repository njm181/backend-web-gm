package com.gmdevs.backendweb.domain.entity;

public class Noticia {
    private long id;
    private Usuario usuario;
    private String date;
    private String title;
    private int duration;
    private String description;
    private String url;

    public Noticia() {
    }

    public Noticia(long id, Usuario usuario, String date, String title, int duration, String description, String url) {
        this.id = id;
        this.usuario = usuario;
        this.date = date;
        this.title = title;
        this.duration = duration;
        this.description = description;
        this.url = url;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
