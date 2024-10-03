package com.example.lab6_20191802.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Setter
@Getter
@Embeddable
public class EventosArtistas implements Serializable{

    @Column(name = "eventoId", nullable = false)
    private Integer eventoId;

    @Column(name = "artistaId", nullable = false)
    private Integer artistaId;

}
