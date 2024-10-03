package com.example.lab6_20191802.Repository;

import com.example.lab6_20191802.Entitys.EveArti;
import com.example.lab6_20191802.Entitys.Eventos;
import com.example.lab6_20191802.Entitys.EventosArtistas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EveArtiRepository extends JpaRepository<EveArti, EventosArtistas> {

}
