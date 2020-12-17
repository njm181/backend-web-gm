package com.gmdevs.backendweb.backendweb.service;

;
import com.gmdevs.backendweb.domain.entity.Noticia;
import com.gmdevs.backendweb.domain.entity.Usuario;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NoticiaServiceTest {

    @Test
    public void getNoticias(){
        List<Noticia> listaNoticias = new ArrayList<>();

        Noticia noticia = new Noticia();
        noticia.setId(1L);
        noticia.setUsuario(new Usuario(1L, "Eddie Brock"));
        noticia.setDate("6 de Abril, 2020");
        noticia.setTitle("Devocional diario");
        noticia.setDuration(4);
        noticia.setDescription("Un pequeño devocional sobre Noe");
        noticia.setUrl("https://www.google.com");
        listaNoticias.add(noticia);

        noticia = new Noticia();
        noticia.setId(2L);
        noticia.setUsuario(new Usuario(2L,"Tony Stark"));
        noticia.setDate("20 de Agosto, 2020");
        noticia.setTitle("Plan de estudio sobre la Fe");
        noticia.setDuration(30);
        noticia.setDescription("Un plan de estudio sobre la Fe de Israel");
        noticia.setUrl("https://www.google.com");
        listaNoticias.add(noticia);

        noticia = new Noticia();
        noticia.setId(3L);
        noticia.setUsuario(new Usuario(3L,"Peter Parker"));
        noticia.setDate("15 de Septiembre, 2020");
        noticia.setTitle("Picnic de verano en Nuevo Joven");
        noticia.setDuration(5);
        noticia.setDescription("Primer picnic del año en Parque Sarmiento");
        noticia.setUrl("https://www.google.com");
        listaNoticias.add(noticia);

        assertEquals(3, listaNoticias.size());
        assertEquals(2, listaNoticias.get(1).getId());

    }

}