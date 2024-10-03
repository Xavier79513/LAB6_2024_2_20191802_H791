package com.example.lab6_20191802.Entitys;


import jakarta.persistence.*;

@Entity
@Table(name = "eventos_artistas")
public class EveArti {
    @EmbeddedId
    private EventosArtistas eventosArtistas;

    @MapsId("eventoId")
    @ManyToOne
    @JoinColumn(name = "eventoId")
    private Eventos eventos;

    @MapsId("artistaId")
    @ManyToOne
    @JoinColumn(name = "artistaId")
    private Artistas artistas;

}
