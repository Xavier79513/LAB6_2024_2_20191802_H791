package com.example.lab6_20191802.Repository;


import com.example.lab6_20191802.Entitys.Artistas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistasRepository extends JpaRepository<Artistas, Integer> {

}
