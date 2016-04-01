package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the ciudades database table.
 * 
 */
@Entity
@Table(name="ciudades")
@NamedQuery(name="Ciudade.findAll", query="SELECT c FROM Ciudade c")
public class Ciudade implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CiudadePK id;

	private String descripcion;

	//bi-directional many-to-one association to Barrio
	@OneToMany(mappedBy="ciudade")
	@JsonIgnore
	private List<Barrio> barrios;

	//bi-directional many-to-one association to CentrosAtencion
	@OneToMany(mappedBy="ciudade")
	@JsonIgnore
	private List<CentrosAtencion> centrosAtencions;

	//bi-directional many-to-one association to Departamento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_departamento", referencedColumnName="codigo_departamento", insertable=false, updatable=false),
		@JoinColumn(name="codigo_pais", referencedColumnName="codigo_pais", insertable=false, updatable=false)
		})
	@JsonIgnore
	private Departamento departamento;

	//bi-directional many-to-one association to Institucione
	@OneToMany(mappedBy="ciudade")
	@JsonIgnore
	private List<Institucione> instituciones;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="ciudade1")
	@JsonIgnore
	private List<Persona> personas1;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="ciudade2")
	@JsonIgnore
	private List<Persona> personas2;

	//bi-directional many-to-one association to ProfesionalesSalud
	@OneToMany(mappedBy="ciudade")
	@JsonIgnore
	private List<ProfesionalesSalud> profesionalesSaluds;

	public Ciudade() {
	}

	public CiudadePK getId() {
		return this.id;
	}

	public void setId(CiudadePK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Barrio> getBarrios() {
		return this.barrios;
	}

	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}

	public Barrio addBarrio(Barrio barrio) {
		getBarrios().add(barrio);
		barrio.setCiudade(this);

		return barrio;
	}

	public Barrio removeBarrio(Barrio barrio) {
		getBarrios().remove(barrio);
		barrio.setCiudade(null);

		return barrio;
	}

	public List<CentrosAtencion> getCentrosAtencions() {
		return this.centrosAtencions;
	}

	public void setCentrosAtencions(List<CentrosAtencion> centrosAtencions) {
		this.centrosAtencions = centrosAtencions;
	}

	public CentrosAtencion addCentrosAtencion(CentrosAtencion centrosAtencion) {
		getCentrosAtencions().add(centrosAtencion);
		centrosAtencion.setCiudade(this);

		return centrosAtencion;
	}

	public CentrosAtencion removeCentrosAtencion(CentrosAtencion centrosAtencion) {
		getCentrosAtencions().remove(centrosAtencion);
		centrosAtencion.setCiudade(null);

		return centrosAtencion;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Institucione> getInstituciones() {
		return this.instituciones;
	}

	public void setInstituciones(List<Institucione> instituciones) {
		this.instituciones = instituciones;
	}

	public Institucione addInstitucione(Institucione institucione) {
		getInstituciones().add(institucione);
		institucione.setCiudade(this);

		return institucione;
	}

	public Institucione removeInstitucione(Institucione institucione) {
		getInstituciones().remove(institucione);
		institucione.setCiudade(null);

		return institucione;
	}

	public List<Persona> getPersonas1() {
		return this.personas1;
	}

	public void setPersonas1(List<Persona> personas1) {
		this.personas1 = personas1;
	}

	public Persona addPersonas1(Persona personas1) {
		getPersonas1().add(personas1);
		personas1.setCiudade1(this);

		return personas1;
	}

	public Persona removePersonas1(Persona personas1) {
		getPersonas1().remove(personas1);
		personas1.setCiudade1(null);

		return personas1;
	}

	public List<Persona> getPersonas2() {
		return this.personas2;
	}

	public void setPersonas2(List<Persona> personas2) {
		this.personas2 = personas2;
	}

	public Persona addPersonas2(Persona personas2) {
		getPersonas2().add(personas2);
		personas2.setCiudade2(this);

		return personas2;
	}

	public Persona removePersonas2(Persona personas2) {
		getPersonas2().remove(personas2);
		personas2.setCiudade2(null);

		return personas2;
	}

	public List<ProfesionalesSalud> getProfesionalesSaluds() {
		return this.profesionalesSaluds;
	}

	public void setProfesionalesSaluds(List<ProfesionalesSalud> profesionalesSaluds) {
		this.profesionalesSaluds = profesionalesSaluds;
	}

	public ProfesionalesSalud addProfesionalesSalud(ProfesionalesSalud profesionalesSalud) {
		getProfesionalesSaluds().add(profesionalesSalud);
		profesionalesSalud.setCiudade(this);

		return profesionalesSalud;
	}

	public ProfesionalesSalud removeProfesionalesSalud(ProfesionalesSalud profesionalesSalud) {
		getProfesionalesSaluds().remove(profesionalesSalud);
		profesionalesSalud.setCiudade(null);

		return profesionalesSalud;
	}

}