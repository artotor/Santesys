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
	@SequenceGenerator(name="seq_excep_agenda", sequenceName="seq_excep_agenda",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_excep_agenda")
	private Integer codigo;

	private String descripcion;

	private String activo;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to CentrosAtencion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="centro_atencion")
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
	
	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}


}