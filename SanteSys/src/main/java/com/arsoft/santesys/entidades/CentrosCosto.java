package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the centros_costo database table.
 * 
 */
@Entity
@Table(name="centros_costo")
@NamedQuery(name="CentrosCosto.findAll", query="SELECT c FROM CentrosCosto c")
public class CentrosCosto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String activo;

	@Column(name="manejo_camas")
	private String manejoCamas;

	private String nombre;

	//bi-directional many-to-many association to UnidadesConsulta
	@ManyToMany(mappedBy="centrosCostos")
	private List<UnidadesConsulta> unidadesConsultas;

	//bi-directional many-to-one association to CentrosAtencion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="centro_atencion", insertable=false, updatable=false)
	private CentrosAtencion centrosAtencion;

	//bi-directional many-to-one association to TiposArea
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_area", insertable=false, updatable=false)
	private TiposArea tiposArea;

	//bi-directional many-to-one association to UnidadesFuncionale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="unidad_funcional", insertable=false, updatable=false)
	private UnidadesFuncionale unidadesFuncionale;

	//bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy="centrosCostos")
	private List<Usuario> usuarios;

	public CentrosCosto() {
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

	public String getManejoCamas() {
		return this.manejoCamas;
	}

	public void setManejoCamas(String manejoCamas) {
		this.manejoCamas = manejoCamas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<UnidadesConsulta> getUnidadesConsultas() {
		return this.unidadesConsultas;
	}

	public void setUnidadesConsultas(List<UnidadesConsulta> unidadesConsultas) {
		this.unidadesConsultas = unidadesConsultas;
	}

	public CentrosAtencion getCentrosAtencion() {
		return this.centrosAtencion;
	}

	public void setCentrosAtencion(CentrosAtencion centrosAtencion) {
		this.centrosAtencion = centrosAtencion;
	}

	public TiposArea getTiposArea() {
		return this.tiposArea;
	}

	public void setTiposArea(TiposArea tiposArea) {
		this.tiposArea = tiposArea;
	}

	public UnidadesFuncionale getUnidadesFuncionale() {
		return this.unidadesFuncionale;
	}

	public void setUnidadesFuncionale(UnidadesFuncionale unidadesFuncionale) {
		this.unidadesFuncionale = unidadesFuncionale;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}