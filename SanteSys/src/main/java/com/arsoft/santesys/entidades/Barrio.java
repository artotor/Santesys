package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the barrios database table.
 * 
 */
@Entity
@Table(name="barrios")
@NamedQuery(name="Barrio.findAll", query="SELECT b FROM Barrio b")
public class Barrio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BarrioPK id;

	@Column(name="descripcion_barrio")
	private String descripcionBarrio;

	//bi-directional many-to-one association to Ciudade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_ciudad", referencedColumnName="codigo_ciudad", insertable=false, updatable=false),
		@JoinColumn(name="codigo_departamento", referencedColumnName="codigo_departamento", insertable=false, updatable=false),
		@JoinColumn(name="codigo_pais", referencedColumnName="codigo_pais", insertable=false, updatable=false)
		})
	@JsonIgnore
	private Ciudade ciudade;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="barrio")
	@JsonIgnore
	private List<Persona> personas;

	public Barrio() {
	}

	public BarrioPK getId() {
		return this.id;
	}

	public void setId(BarrioPK id) {
		this.id = id;
	}

	public String getDescripcionBarrio() {
		return this.descripcionBarrio;
	}

	public void setDescripcionBarrio(String descripcionBarrio) {
		this.descripcionBarrio = descripcionBarrio;
	}

	public Ciudade getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudade ciudade) {
		this.ciudade = ciudade;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setBarrio(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setBarrio(null);

		return persona;
	}

}