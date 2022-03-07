package com.prueba.tecnica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.entity.Artistas;

@Repository
public interface IArtistaRepo extends JpaRepository<Artistas, Integer>  {

}
