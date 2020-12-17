package com.gmdevs.backendweb.domain.entity;

import java.util.List;

public class Reunion {

    private long id;
    private String title;
    private Fecha fecha;
    private String description;
    private List<Actividad> activities;


    public Reunion() {
    }

    public Reunion(long id, String title, Fecha fecha, String description, List<Actividad> activities) {
        this.id = id;
        this.title = title;
        this.fecha = fecha;
        this.description = description;
        this.activities = activities;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public List<Actividad> getActivities() {
        return activities;
    }

    public void setActivities(List<Actividad> activities) {
        this.activities = activities;
    }
}
