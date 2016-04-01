package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the servicios database table.
 * 
 */
@Entity
@Table(name="servicios")
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String activo;

	private String espos;

	@Column(name="naturaleza_servicio")
	private String naturalezaServicio;

	//bi-directional many-to-one association to ReferenciasServicio
	@OneToMany(mappedBy="servicioBean")
	private List<ReferenciasServicio> referenciasServicios;

	//bi-directional many-to-one association to Especialidade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="especialidad", insertable=false, updatable=false)
	private Especialidade especialidade;

	//bi-directional many-to-one association to GruposServicio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="grupo_servicio", insertable=false, updatable=false)
	private GruposServicio gruposServicio;

	//bi-directional many-to-one association to Sexo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sexo", insertable=false, updatable=false)
	private Sexo sexoBean;

	//bi-directional many-to-one association to TiposServicio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_servicio", insertable=false, updatable=false)
	private TiposServicio tiposServicio;

	//bi-directional many-to-many association to UnidadesConsulta
	@ManyToMany
	@JoinTable(
		name="servicios_unidades_consulta"
		, joinColumns={
			@JoinColumn(name="codigo_servicio", insertable=false, updatable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="unidad_consulta", insertable=false, updatable=false)
			}
		)
	private List<UnidadesConsulta> unidadesConsultas;

	public Servicio() {
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

	public String getEspos() {
		return this.espos;
	}

	public void setEspos(String espos) {
		this.espos = espos;
	}

	public String getNaturalezaServicio() {
		return this.naturalezaServicio;
	}

	public void setNaturalezaServicio(String naturalezaServicio) {
		this.naturalezaServicio = naturalezaServicio;
	}

	public List<ReferenciasServicio> getReferenciasServicios() {
		return this.referenciasServicios;
	}

	public void setReferenciasServicios(List<ReferenciasServicio> referenciasServicios) {
		this.referenciasServicios = referenciasServicios;
	}

	public ReferenciasServicio addReferenciasServicio(ReferenciasServicio referenciasServicio) {
		getReferenciasServicios().add(referenciasServicio);
		referenciasServicio.setServicioBean(this);

		return referenciasServicio;
	}

	public ReferenciasServicio removeReferenciasServicio(ReferenciasServicio referenciasServicio) {
		getReferenciasServicios().remove(referenciasServicio);
		referenciasServicio.setServicioBean(null);

		return referenciasServicio;
	}

	public Especialidade getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public GruposServicio getGruposServicio() {
		return this.gruposServicio;
	}

	public void setGruposServicio(GruposServicio gruposServicio) {
		this.gruposServicio = gruposServicio;
	}

	public Sexo getSexoBean() {
		return this.sexoBean;
	}

	public void setSexoBean(Sexo sexoBean) {
		this.sexoBean = sexoBean;
	}

	public TiposServicio getTiposServicio() {
		return this.tiposServicio;
	}

	public void setTiposServicio(TiposServicio tiposServicio) {
		this.tiposServicio = tiposServicio;
	}

	public List<UnidadesConsulta> getUnidadesConsultas() {
		return this.unidadesConsultas;
	}

	public void setUnidadesConsultas(List<UnidadesConsulta> unidadesConsultas) {
		this.unidadesConsultas = unidadesConsultas;
	}

}