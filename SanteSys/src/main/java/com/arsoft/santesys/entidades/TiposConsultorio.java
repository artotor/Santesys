package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the tipos_consultorio database table.
 * 
 */
@Entity
@Table(name="tipos_consultorio")
@NamedQuery(name="TiposConsultorio.findAll", query="SELECT t FROM TiposConsultorio t")
public class TiposConsultorio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String nombre;

	//bi-directional many-to-one association to Consultorio
	@OneToMany(mappedBy="tiposConsultorio")
	@JsonIgnore
	private List<Consultorio> consultorios;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	public TiposConsultorio() {
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

	public List<Consultorio> getConsultorios() {
		return this.consultorios;
	}

	public void setConsultorios(List<Consultorio> consultorios) {
		this.consultorios = consultorios;
	}

	public Consultorio addConsultorio(Consultorio consultorio) {
		getConsultorios().add(consultorio);
		consultorio.setTiposConsultorio(this);

		return consultorio;
	}

	public Consultorio removeConsultorio(Consultorio consultorio) {
		getConsultorios().remove(consultorio);
		consultorio.setTiposConsultorio(null);

		return consultorio;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}