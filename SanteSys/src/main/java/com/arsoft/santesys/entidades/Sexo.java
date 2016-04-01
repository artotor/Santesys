package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the sexo database table.
 * 
 */
@Entity
@NamedQuery(name="Sexo.findAll", query="SELECT s FROM Sexo s")
public class Sexo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String nombre;

	//bi-directional many-to-one association to Diagnostico
	@OneToMany(mappedBy="sexoBean")
	@JsonIgnore
	private List<Diagnostico> diagnosticos;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="sexoBean")
	@JsonIgnore
	private List<Persona> personas;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="sexoBean")
	@JsonIgnore
	private List<Servicio> servicios;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	public Sexo() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Diagnostico> getDiagnosticos() {
		return this.diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	public Diagnostico addDiagnostico(Diagnostico diagnostico) {
		getDiagnosticos().add(diagnostico);
		diagnostico.setSexoBean(this);

		return diagnostico;
	}

	public Diagnostico removeDiagnostico(Diagnostico diagnostico) {
		getDiagnosticos().remove(diagnostico);
		diagnostico.setSexoBean(null);

		return diagnostico;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setSexoBean(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setSexoBean(null);

		return persona;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setSexoBean(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setSexoBean(null);

		return servicio;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}