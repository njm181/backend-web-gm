package com.gmdevs.backendweb.service;

import com.gmdevs.backendweb.domain.entity.Actividad;
import com.gmdevs.backendweb.domain.entity.Fecha;
import com.gmdevs.backendweb.domain.entity.Reunion;
import com.gmdevs.backendweb.domain.util.Dia;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReunionService {


    public List<Reunion> getReuniones(){
        List<Reunion> listaReuniones = new ArrayList<>();
        List<Actividad> listaActividades = new ArrayList<>();

        listaActividades.add(new Actividad("Titulo actividad 1 hardcord", "Subtitulo actividad 1"));
        listaActividades.add(new Actividad("Titulo actividad 2 hardcord", "Subtitulo actividad 2"));
        Reunion reunion = new Reunion();
        reunion.setId(1L);
        reunion.setTitle("Nuevo Joven Hardcord");
        reunion.setFecha(new Fecha(Dia.VIERNES, "21:30"));
        reunion.setDescription("Encuentro de jovenes de entre 20 y 30 años");
        reunion.setActivities(listaActividades);
        listaReuniones.add(reunion);

        reunion = new Reunion();
        listaActividades = new ArrayList<>();
        listaActividades.add(new Actividad("Titulo actividad 1 hardcord", "Subtitulo actividad 1"));
        listaActividades.add(new Actividad("Titulo actividad 2 hardcord", "Subtitulo actividad 2"));
        reunion.setId(2L);
        reunion.setTitle("Enap Hardocord");
        reunion.setFecha(new Fecha(Dia.SABADO, "18:30"));
        reunion.setDescription("Encuentro de adolescentes de entre 16 y 19 años");
        reunion.setActivities(listaActividades);
        listaReuniones.add(reunion);

        reunion = new Reunion();
        listaActividades = new ArrayList<>();
        listaActividades.add(new Actividad("Titulo actividad 1 hardcord", "Subtitulo actividad 1"));
        reunion.setId(3L);
        reunion.setTitle("Principal Hardocord");
        reunion.setFecha(new Fecha(Dia.DOMINGO, "21:00"));
        reunion.setDescription("Encuentro principal de la Iglesia abierto a todo el público.");
        reunion.setActivities(listaActividades);
        listaReuniones.add(reunion);

        return listaReuniones;

    }

}
