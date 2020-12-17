package com.gmdevs.backendweb.controller;

import com.gmdevs.backendweb.domain.entity.Noticia;
import com.gmdevs.backendweb.domain.entity.Reunion;
import com.gmdevs.backendweb.service.NoticiaService;
import com.gmdevs.backendweb.service.ReunionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ReunionService reunionService;

    @Autowired
    private NoticiaService noticiaService;

    @RequestMapping("")
    public String getListaReuniones(Model model){
        List<Reunion> listaReuniones = reunionService.getReuniones();
        List<Noticia> listaNoticias = noticiaService.getNoticias();
        model.addAttribute("noticias", listaNoticias);
        model.addAttribute("reuniones", listaReuniones);
        return "index";
    }

}
