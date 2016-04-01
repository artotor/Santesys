package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mot_cierre_apertura_ingresos database table.
 * 
 */
@Entity
@Table(name="mot_cierre_apertura_ingresos")
@NamedQuery(name="MotCierreAperturaIngreso.findAll", query="SELECT m FROM MotCierreAperturaIngreso m")
public class MotCierreAperturaIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MotCierreAperturaIngresoPK id;

	private String activo;

	private String descripcion;

	private String tipo;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	private Institucione institucione;

	public MotCierreAperturaIngreso() {
	}

	public MotCierreAperturaIngresoPK getId() {
		return this.id;
	}

	public void setId(MotCierreAperturaIngresoPK id) {
		this.id = id;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}