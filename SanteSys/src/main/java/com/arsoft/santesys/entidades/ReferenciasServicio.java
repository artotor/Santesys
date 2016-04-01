package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the referencias_servicio database table.
 * 
 */
@Entity
@Table(name="referencias_servicio")
@NamedQuery(name="ReferenciasServicio.findAll", query="SELECT r FROM ReferenciasServicio r")
public class ReferenciasServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReferenciasServicioPK id;

	@Column(name="codigo_propietario")
	private String codigoPropietario;

	private String descripcion;

	//bi-directional many-to-one association to Servicio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="servicio", insertable=false, updatable=false)
	private Servicio servicioBean;

	//bi-directional many-to-one association to TarifariosOficiale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_tarifario", insertable=false, updatable=false)
	private TarifariosOficiale tarifariosOficiale;

	public ReferenciasServicio() {
	}

	public ReferenciasServicioPK getId() {
		return this.id;
	}

	public void setId(ReferenciasServicioPK id) {
		this.id = id;
	}

	public String getCodigoPropietario() {
		return this.codigoPropietario;
	}

	public void setCodigoPropietario(String codigoPropietario) {
		this.codigoPropietario = codigoPropietario;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Servicio getServicioBean() {
		return this.servicioBean;
	}

	public void setServicioBean(Servicio servicioBean) {
		this.servicioBean = servicioBean;
	}

	public TarifariosOficiale getTarifariosOficiale() {
		return this.tarifariosOficiale;
	}

	public void setTarifariosOficiale(TarifariosOficiale tarifariosOficiale) {
		this.tarifariosOficiale = tarifariosOficiale;
	}

}