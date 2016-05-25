package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the especialidades database table.
 * 
 */
@Entity
@Table(name="especialidades")
@NamedQuery(name="Especialidade.findAll", query="SELECT e FROM Especialidade e")
public class Especialidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String nombre;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	//bi-directional many-to-many association to ProfesionalesSalud
	@ManyToMany(mappedBy="especialidades")
	@JsonIgnore
	private List<ProfesionalesSalud> profesionalesSaluds;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="especialidade")
	@JsonIgnore
	private List<Servicio> servicios;

	//bi-directional many-to-one association to UnidadesConsulta
	@OneToMany(mappedBy="especialidade")
	@JsonIgnore
	private List<UnidadesConsulta> unidadesConsultas;

	public Especialidade() {
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

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

	public List<ProfesionalesSalud> getProfesionalesSaluds() {
		return this.profesionalesSaluds;
	}

	public void setProfesionalesSaluds(List<ProfesionalesSalud> profesionalesSaluds) {
		this.profesionalesSaluds = profesionalesSaluds;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setEspecialidade(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setEspecialidade(null);

		return servicio;
	}

	public List<UnidadesConsulta> getUnidadesConsultas() {
		return this.unidadesConsultas;
	}

	public void setUnidadesConsultas(List<UnidadesConsulta> unidadesConsultas) {
		this.unidadesConsultas = unidadesConsultas;
	}

	public UnidadesConsulta addUnidadesConsulta(UnidadesConsulta unidadesConsulta) {
		getUnidadesConsultas().add(unidadesConsulta);
		unidadesConsulta.setEspecialidade(this);

		return unidadesConsulta;
	}

	public UnidadesConsulta removeUnidadesConsulta(UnidadesConsulta unidadesConsulta) {
		getUnidadesConsultas().remove(unidadesConsulta);
		unidadesConsulta.setEspecialidade(null);

		return unidadesConsulta;
	}

}