package com.gmdevs.backendweb.domain.entity;

import java.util.Date;
import java.util.List;

public class Evento {

    private Long id;
    private String title;
    private String description;
    private Date date;
    private List<Actividad> actividadesList;

    public Evento(Long id, String title, String description, Date date, List<Actividad> actividadesList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.actividadesList = actividadesList;
    }

    public Evento() {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Actividad> getActividadesList() {
        return actividadesList;
    }

    public void setActividadesList(List<Actividad> actividadesList) {
        this.actividadesList = actividadesList;
    }
}
