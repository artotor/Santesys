package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the tipos_vinculacion database table.
 * 
 */
@Entity
@Table(name="tipos_vinculacion")
@NamedQuery(name="TiposVinculacion.findAll", query="SELECT t FROM TiposVinculacion t")
public class TiposVinculacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String nombre;

	//bi-directional many-to-one association to ProfesionalesSalud
	@OneToMany(mappedBy="tiposVinculacion")
	@JsonIgnore
	private List<ProfesionalesSalud> profesionalesSaluds;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	public TiposVinculacion() {
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

	public List<ProfesionalesSalud> getProfesionalesSaluds() {
		return this.profesionalesSaluds;
	}

	public void setProfesionalesSaluds(List<ProfesionalesSalud> profesionalesSaluds) {
		this.profesionalesSaluds = profesionalesSaluds;
	}

	public ProfesionalesSalud addProfesionalesSalud(ProfesionalesSalud profesionalesSalud) {
		getProfesionalesSaluds().add(profesionalesSalud);
		profesionalesSalud.setTiposVinculacion(this);

		return profesionalesSalud;
	}

	public ProfesionalesSalud removeProfesionalesSalud(ProfesionalesSalud profesionalesSalud) {
		getProfesionalesSaluds().remove(profesionalesSalud);
		profesionalesSalud.setTiposVinculacion(null);

		return profesionalesSalud;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}