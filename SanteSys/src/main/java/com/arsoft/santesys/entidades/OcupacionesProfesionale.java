package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the ocupaciones_profesionales database table.
 * 
 */
@Entity
@Table(name="ocupaciones_profesionales")
@NamedQuery(name="OcupacionesProfesionale.findAll", query="SELECT o FROM OcupacionesProfesionale o")
public class OcupacionesProfesionale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String descripcion;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="ocupacionesProfesionale")
	@JsonIgnore
	private List<Persona> personas;

	public OcupacionesProfesionale() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		persona.setOcupacionesProfesionale(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setOcupacionesProfesionale(null);

		return persona;
	}

}