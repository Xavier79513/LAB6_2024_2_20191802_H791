package com.example.lab6_20191802.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Pagina")
public class HomeController {
    @GetMapping("/pagina")
    public String viewloguin(){return "/Pagina/index";}
}