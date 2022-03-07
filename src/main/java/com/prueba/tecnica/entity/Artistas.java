package com.prueba.tecnica.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "artistas")
public class Artistas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer artista_id;

	@Column(name = "tipo_ide", length = 5, nullable = true)
	private String tipoIde;

	@Column(name = "numeroIde", length = 30, nullable = true)
	private String numeroIde;

	@Column(name = "nombres", length = 30, nullable = true)
	private String nombres;

	@Column(name = "apellidos", length = 30, nullable = true)
	private String apellidos;
	
	@OneToMany(mappedBy ="artistas", cascade=CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Obras> obras ;

	public Artistas() {

	}

	
	
	
	public Artistas(Integer artista_id, String tipoIde, String numeroIde, String nombres, String apellidos,
			List<Obras> obras) {
		super();
		this.artista_id = artista_id;
		this.tipoIde = tipoIde;
		this.numeroIde = numeroIde;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.obras = obras;
	}




	public List<Obras> getObras() {
		return obras;
	}

	public void setObras(List<Obras> obras) {
		this.obras = obras;
	}

	public Integer getArtista_id() {
		return artista_id;
	}

	public void setArtista_id(Integer artista_id) {
		this.artista_id = artista_id;
	}

	public String getTipoIde() {
		return tipoIde;
	}

	public void setTipoIde(String tipoIde) {
		this.tipoIde = tipoIde;
	}

	public String getNumeroIde() {
		return numeroIde;
	}

	public void setNumeroIde(String numeroIde) {
		this.numeroIde = numeroIde;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
