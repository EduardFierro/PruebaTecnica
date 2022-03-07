package com.prueba.tecnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.entity.Artistas;
import com.prueba.tecnica.exception.ModelNotFoundException;
import com.prueba.tecnica.service.IArtistaService;





@RestController
@RequestMapping("/artista")
@CrossOrigin
public class ArtistasController {
	
	@Autowired
	private IArtistaService service;
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardar (@Validated @RequestBody Artistas artistas) throws Exception {
		service.guardar(artistas);
		return new ResponseEntity<Artistas>(artistas, HttpStatus.CREATED);
		
			
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<Object>eliminar(@PathVariable int id) throws ModelNotFoundException{
		service.eliminar(id);
		return new ResponseEntity<Object>("", HttpStatus.NO_CONTENT);
		

	}

}
