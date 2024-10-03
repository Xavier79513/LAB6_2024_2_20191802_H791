package com.example.lab6_20191802.Repository;

import com.example.lab6_20191802.Entitys.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventosRepository extends JpaRepository<Eventos, Integer> {

}
