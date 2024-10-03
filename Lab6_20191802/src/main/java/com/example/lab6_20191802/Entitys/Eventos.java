package com.example.lab6_20191802.Entitys;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventoId;
    @Column(name = "nombre", length = 100)
    private String nombreEvento;
    @Column(name = "fecha")
    private LocalDate fechaEvento;
    @Column(name = "asistentesEsperados")
    private Integer asistentesEsperados;

    @OneToMany(mappedBy = "eventos",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<EveArti> eveArtis = new LinkedHashSet<>();

}
