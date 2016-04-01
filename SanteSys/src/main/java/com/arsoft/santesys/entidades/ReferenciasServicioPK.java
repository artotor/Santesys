package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the referencias_servicio database table.
 * 
 */
@Embeddable
public class ReferenciasServicioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer servicio;

	@Column(name="tipo_tarifario", insertable=false, updatable=false)
	private Integer tipoTarifario;

	public ReferenciasServicioPK() {
	}
	public Integer getServicio() {
		return this.servicio;
	}
	public void setServicio(Integer servicio) {
		this.servicio = servicio;
	}
	public Integer getTipoTarifario() {
		return this.tipoTarifario;
	}
	public void setTipoTarifario(Integer tipoTarifario) {
		this.tipoTarifario = tipoTarifario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReferenciasServicioPK)) {
			return false;
		}
		ReferenciasServicioPK castOther = (ReferenciasServicioPK)other;
		return 
			this.servicio.equals(castOther.servicio)
			&& this.tipoTarifario.equals(castOther.tipoTarifario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.servicio.hashCode();
		hash = hash * prime + this.tipoTarifario.hashCode();
		
		return hash;
	}
}