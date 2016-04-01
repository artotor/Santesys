package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the estados_civiles database table.
 * 
 */
@Entity
@Table(name="estados_civiles")
@NamedQuery(name="EstadosCivile.findAll", query="SELECT e FROM EstadosCivile e")
public class EstadosCivile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String acronimo;

	private String nombre;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="estadosCivile")
	@JsonIgnore
	private List<Persona> personas;

	public EstadosCivile() {
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

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setEstadosCivile(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setEstadosCivile(null);

		return persona;
	}

}