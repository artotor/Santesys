package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the unidades_consulta database table.
 * 
 */
@Entity
@Table(name="unidades_consulta")
@NamedQuery(name="UnidadesConsulta.findAll", query="SELECT u FROM UnidadesConsulta u")
public class UnidadesConsulta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_unidad_consulta", sequenceName="seq_unidad_consulta",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_unidad_consulta")
	private Integer codigo;

	private String activo;

	private String descripcion;

	//bi-directional many-to-many association to CentrosCosto
	@ManyToMany
	@JoinTable(
		name="cen_costo_x_un_consulta"
		, joinColumns={
			@JoinColumn(name="unidad_consulta", insertable=false, updatable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="centro_costo", insertable=false, updatable=false)
			}
		)
	private List<CentrosCosto> centrosCostos;

	//bi-directional many-to-many association to Servicio
	@ManyToMany(mappedBy="unidadesConsultas")
	private List<Servicio> servicios;

	//bi-directional many-to-one association to Especialidade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="especialidad", insertable=false, updatable=false)
	private Especialidade especialidade;

	public UnidadesConsulta() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Especialidade getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}