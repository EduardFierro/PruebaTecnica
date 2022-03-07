package com.prueba.tecnica.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "obras")
public class Obras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer obra_id;

	@Column(name = "nombre", length = 30, nullable = true)
	private String nombre;
	
	@Column(name = "pais", length = 30, nullable = true)
	private String pais;
	
	@ManyToOne
	@JoinColumn(name = "artista_id", nullable = true, foreignKey = @ForeignKey(name = "artista_id"))
	private Artistas artistas;
	
	@ManyToMany
	@JoinTable(name="museo_obra", joinColumns = { @JoinColumn(name="obra_id")},
			inverseJoinColumns = {@JoinColumn(name="museo_id")})
	public List<Museos> museos;
	
	public Obras() {
	}
	
	public void addMuseo(Museos museo) {
		if(this.museos==null) {
			this.museos= new ArrayList<>();
		}
		this.museos.add(museo);
	}

	public Obras(Integer obra_id, String nombre, String pais, Artistas artistas) {
		super();
		this.obra_id = obra_id;
		this.nombre = nombre;
		this.pais = pais;
		this.artistas = artistas;
	}

	
	public List<Museos> getMuseos() {
		return museos;
	}

	public void setMuseos(List<Museos> museos) {
		this.museos = museos;
	}

	public Integer getObra_id() {
		return obra_id;
	}

	public void setObra_id(Integer obra_id) {
		this.obra_id = obra_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Artistas getArtistas() {
		return artistas;
	}

	public void setArtistas(Artistas artistas) {
		this.artistas = artistas;
	}

	
	
	
	

}
