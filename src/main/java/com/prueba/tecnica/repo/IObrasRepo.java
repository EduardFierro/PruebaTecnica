package com.prueba.tecnica.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.prueba.tecnica.entity.Obras;

@Repository
public interface IObrasRepo extends JpaRepository<Obras, Integer>{

	@Query(value="Select obras.obra_id, obras.nombre, obras.artista_id, obras.pais from obras join museo_obra on obras.obra_id=museo_obra.obra_id join museos on museos.museo_id = museo_obra.museo_id where museos.pais ilike 'Colombia' and obras.artista_id=?1", nativeQuery = true)
	public List<Obras>obrasporartistaencolombia(@Param("artista_id") int artista_id);
}
