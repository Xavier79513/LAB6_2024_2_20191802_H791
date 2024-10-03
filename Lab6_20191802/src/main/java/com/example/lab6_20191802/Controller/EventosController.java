package com.example.lab6_20191802.Controller;

import com.example.lab6_20191802.Entitys.Eventos;
import com.example.lab6_20191802.Repository.ArtistasRepository;
import com.example.lab6_20191802.Repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/edit")
    public String editEventos(@RequestParam("id") int id, Model model) {
        Optional<Eventos> optionalEventos = eventosRepository.findById(id);
        if (optionalEventos.isPresent()) {
            Eventos eventos = optionalEventos.get();
            model.addAttribute("eventos", eventos);
            model.addAttribute("artistas", artistasRepository.findAll());
            return "Eventos/edit";
        } else {
            return "redirect:/Eventos/lista";
        }
    }
    @GetMapping("/save")
    public String saveEventos(Eventos eventos) {
        eventosRepository.save(eventos);
        return "redirect:/Eventos/lista";
    }
}
