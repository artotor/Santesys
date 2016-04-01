package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the excepciones_agenda database table.
 * 
 */
@Entity
@Table(name="excepciones_agenda")
@NamedQuery(name="ExcepcionesAgenda.findAll", query="SELECT e FROM ExcepcionesAgenda e")
public class ExcepcionesAgenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to CentrosAtencion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="centro_atencion", insertable=false, updatable=false)
	private CentrosAtencion centrosAtencion;

	public ExcepcionesAgenda() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public CentrosAtencion getCentrosAtencion() {
		return this.centrosAtencion;
	}

	public void setCentrosAtencion(CentrosAtencion centrosAtencion) {
		this.centrosAtencion = centrosAtencion;
	}

}