package com.example.lab6_20191802.Controller;

import com.example.lab6_20191802.Entitys.Eventos;
import com.example.lab6_20191802.Repository.ArtistasRepository;
import com.example.lab6_20191802.Repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Eventos")
public class EventosController {
    @Autowired
    private EventosRepository eventosRepository;

    @Autowired
    private ArtistasRepository artistasRepository;

    @GetMapping("/lista")
    public String listaEventos(Model model) {
        List<Eventos> listarEventos = eventosRepository.findAll();

        model.addAttribute("listarEventos", listarEventos);
        return "Eventos/index";
    }
}
