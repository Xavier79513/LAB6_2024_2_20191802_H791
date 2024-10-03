package com.example.lab6_20191802.Controller;


import com.example.lab6_20191802.Entitys.Artistas;
import com.example.lab6_20191802.Repository.ArtistasRepository;
import com.example.lab6_20191802.Repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Artistas")
public class ArtistasController {

    @Autowired
    private EventosRepository eventosRepository;

    @Autowired
    private ArtistasRepository artistasRepository;

    @GetMapping("/lista2")
    public String listaArtista(Model model) {
        List<Artistas> listarArtistas = artistasRepository.findAll();
        model.addAttribute("listarArtistas", listarArtistas);
        return "Artistas/index";
    }
}