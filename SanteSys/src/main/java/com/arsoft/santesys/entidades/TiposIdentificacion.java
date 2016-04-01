package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the tipos_identificacion database table.
 * 
 */
@Entity
@Table(name="tipos_identificacion")
@NamedQuery(name="TiposIdentificacion.findAll", query="SELECT t FROM TiposIdentificacion t")
public class TiposIdentificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String acronimo;

	private String nombre;

	//bi-directional many-to-one association to Institucione
	@OneToMany(mappedBy="tiposIdentificacion")
	@JsonIgnore
	private List<Institucione> instituciones;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="tiposIdentificacion")
	@JsonIgnore
	private List<Persona> personas;

	public TiposIdentificacion() {
	}

	public String getAcronimo() {
		return this.acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Institucione> getInstituciones() {
		return this.instituciones;
	}

	public void setInstituciones(List<Institucione> instituciones) {
		this.instituciones = instituciones;
	}

	public Institucione addInstitucione(Institucione institucione) {
		getInstituciones().add(institucione);
		institucione.setTiposIdentificacion(this);

		return institucione;
	}

	public Institucione removeInstitucione(Institucione institucione) {
		getInstituciones().remove(institucione);
		institucione.setTiposIdentificacion(null);

		return institucione;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setTiposIdentificacion(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setTiposIdentificacion(null);

		return persona;
	}

}