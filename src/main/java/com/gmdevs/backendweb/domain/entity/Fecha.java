package com.gmdevs.backendweb.domain.entity;

import com.gmdevs.backendweb.domain.util.Dia;

public class Fecha {
    private Dia dia;
    private String hora;

    public Fecha(Dia dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
