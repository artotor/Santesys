package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the departamentos database table.
 * 
 */
@Entity
@Table(name="departamentos")
@NamedQuery(name="Departamento.findAll", query="SELECT d FROM Departamento d")
public class Departamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DepartamentoPK id;

	private String descripcion;

	//bi-directional many-to-one association to Ciudade
	@OneToMany(mappedBy="departamento")
	@JsonIgnore
	private List<Ciudade> ciudades;

	//bi-directional many-to-one association to Pais
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codigo_pais", insertable=false, updatable=false)
	@JsonIgnore
	private Pais pais;

	public Departamento() {
	}

	public DepartamentoPK getId() {
		return this.id;
	}

	public void setId(DepartamentoPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Ciudade> getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(List<Ciudade> ciudades) {
		this.ciudades = ciudades;
	}

	public Ciudade addCiudade(Ciudade ciudade) {
		getCiudades().add(ciudade);
		ciudade.setDepartamento(this);

		return ciudade;
	}

	public Ciudade removeCiudade(Ciudade ciudade) {
		getCiudades().remove(ciudade);
		ciudade.setDepartamento(null);

		return ciudade;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}