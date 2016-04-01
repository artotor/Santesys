package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the tipos_area database table.
 * 
 */
@Entity
@Table(name="tipos_area")
@NamedQuery(name="TiposArea.findAll", query="SELECT t FROM TiposArea t")
public class TiposArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String nombre;

	//bi-directional many-to-one association to CentrosCosto
	@OneToMany(mappedBy="tiposArea")
	@JsonIgnore
	private List<CentrosCosto> centrosCostos;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	public TiposArea() {
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

	public List<CentrosCosto> getCentrosCostos() {
		return this.centrosCostos;
	}

	public void setCentrosCostos(List<CentrosCosto> centrosCostos) {
		this.centrosCostos = centrosCostos;
	}

	public CentrosCosto addCentrosCosto(CentrosCosto centrosCosto) {
		getCentrosCostos().add(centrosCosto);
		centrosCosto.setTiposArea(this);

		return centrosCosto;
	}

	public CentrosCosto removeCentrosCosto(CentrosCosto centrosCosto) {
		getCentrosCostos().remove(centrosCosto);
		centrosCosto.setTiposArea(null);

		return centrosCosto;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}