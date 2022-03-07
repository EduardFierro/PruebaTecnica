package com.prueba.tecnica.service.imp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.tecnica.entity.Artistas;
import com.prueba.tecnica.entity.Obras;
import com.prueba.tecnica.repo.IObrasRepo;
@SpringBootTest
class ObraServiceImpTest {
	
	@Autowired
	ObraServiceImp service;
	
	@Spy
	IObrasRepo repo;
	
	@Test
	public void crearObraTest() throws Exception {
		
		Artistas artista = new Artistas();
		artista.setArtista_id(10);
		Obras obra = new Obras();
		obra.setObra_id(1);
		obra.setNombre("Dulces");
		obra.setPais("Colombia");
		obra.setArtistas(artista);
		
		doReturn(obra).when(repo).save(obra);
		
		
		assertEquals(obra, service.guardar(obra));
	}

}
