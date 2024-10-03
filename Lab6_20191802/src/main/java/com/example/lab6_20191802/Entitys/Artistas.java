package com.example.lab6_20191802.Entitys;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "artistas")
public class Artistas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer artistaId;

    @Column(name = "nombre", length = 100)
    private String nombreArtista;

    @Column(name = "genero", length = 50)
    private String generoArtista;

    @Column(name = "telefono", length = 9)
    private String telefonoArtista;

    @OneToMany(mappedBy = "artistas",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<EveArti> eveArtis = new LinkedHashSet<>();
}
