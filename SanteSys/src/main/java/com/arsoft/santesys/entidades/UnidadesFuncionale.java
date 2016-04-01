package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the unidades_funcionales database table.
 * 
 */
@Entity
@Table(name="unidades_funcionales")
@NamedQuery(name="UnidadesFuncionale.findAll", query="SELECT u FROM UnidadesFuncionale u")
public class UnidadesFuncionale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String acronimo;

	private String activo;

	private String descripcion;

	//bi-directional many-to-one association to CentrosCosto
	@OneToMany(mappedBy="unidadesFuncionale")
	private List<CentrosCosto> centrosCostos;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	private Institucione institucione;

	public UnidadesFuncionale() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAcronimo() {
		return this.acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
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

	public List<CentrosCosto> getCentrosCostos() {
		return this.centrosCostos;
	}

	public void setCentrosCostos(List<CentrosCosto> centrosCostos) {
		this.centrosCostos = centrosCostos;
	}

	public CentrosCosto addCentrosCosto(CentrosCosto centrosCosto) {
		getCentrosCostos().add(centrosCosto);
		centrosCosto.setUnidadesFuncionale(this);

		return centrosCosto;
	}

	public CentrosCosto removeCentrosCosto(CentrosCosto centrosCosto) {
		getCentrosCostos().remove(centrosCosto);
		centrosCosto.setUnidadesFuncionale(null);

		return centrosCosto;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}