package com.gmdevs.backendweb.controller;

import com.gmdevs.backendweb.domain.entity.Evento;
import com.gmdevs.backendweb.domain.entity.Noticia;
import com.gmdevs.backendweb.domain.entity.Reunion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/eventos")
public class EventosController {



    @RequestMapping("")
    public String getListaEventos(Model model){
        //List<Evento> listaEventos = reunionService.getReuniones();
        //model.addAttribute("eventos", listaEventos);
        return "/sections/eventos-lista";
    }
}
