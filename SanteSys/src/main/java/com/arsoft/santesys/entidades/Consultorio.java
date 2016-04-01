package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the consultorios database table.
 * 
 */
@Entity
@Table(name="consultorios")
@NamedQuery(name="Consultorio.findAll", query="SELECT c FROM Consultorio c")
public class Consultorio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String activo;

	@Column(name="codigo_consultorio")
	private String codigoConsultorio;

	private String descripcion;

	//bi-directional many-to-one association to CentrosAtencion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="centro_atencion", insertable=false, updatable=false)
	private CentrosAtencion centrosAtencion;

	//bi-directional many-to-one association to TiposConsultorio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_consultorio", insertable=false, updatable=false)
	private TiposConsultorio tiposConsultorio;

	public Consultorio() {
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

	public String getCodigoConsultorio() {
		return this.codigoConsultorio;
	}

	public void setCodigoConsultorio(String codigoConsultorio) {
		this.codigoConsultorio = codigoConsultorio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CentrosAtencion getCentrosAtencion() {
		return this.centrosAtencion;
	}

	public void setCentrosAtencion(CentrosAtencion centrosAtencion) {
		this.centrosAtencion = centrosAtencion;
	}

	public TiposConsultorio getTiposConsultorio() {
		return this.tiposConsultorio;
	}

	public void setTiposConsultorio(TiposConsultorio tiposConsultorio) {
		this.tiposConsultorio = tiposConsultorio;
	}

}