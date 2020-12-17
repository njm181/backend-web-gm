package com.gmdevs.backendweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    @RequestMapping("")
    public String getRegistro(Model model){
        //List<Evento> listaEventos = reunionService.getReuniones();
        //model.addAttribute("eventos", listaEventos);
        return "/sections/reservar-lugar";
    }

}
