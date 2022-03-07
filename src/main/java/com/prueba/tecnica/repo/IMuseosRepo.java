package com.prueba.tecnica.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.entity.Museos;



@Repository
public interface IMuseosRepo extends JpaRepository<Museos, Integer> {
	
	@Query(value="Select * from museos where museos.ciudad=?1 and (museos.nombre LIKE 'L%' or museos.nombre LIKE 'l%' )", nativeQuery = true)
	public List<Museos>museosporciudad(@Param("ciudad") String ciudad);

}
