package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the naturalezas_servicio database table.
 * 
 */
@Entity
@Table(name="naturalezas_servicio")
@NamedQuery(name="NaturalezasServicio.findAll", query="SELECT n FROM NaturalezasServicio n")
public class NaturalezasServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String acronimo;

	private String descripcion;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion")
	private Institucione institucione;

	public NaturalezasServicio() {
	}

	public String getAcronimo() {
		return this.acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
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

}