package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the mot_cierre_apertura_ingresos database table.
 * 
 */
@Embeddable
public class MotCierreAperturaIngresoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer codigo;

	@Column(insertable=false, updatable=false)
	private Integer institucion;

	public MotCierreAperturaIngresoPK() {
	}
	public Integer getCodigo() {
		return this.codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getInstitucion() {
		return this.institucion;
	}
	public void setInstitucion(Integer institucion) {
		this.institucion = institucion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MotCierreAperturaIngresoPK)) {
			return false;
		}
		MotCierreAperturaIngresoPK castOther = (MotCierreAperturaIngresoPK)other;
		return 
			this.codigo.equals(castOther.codigo)
			&& this.institucion.equals(castOther.institucion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codigo.hashCode();
		hash = hash * prime + this.institucion.hashCode();
		
		return hash;
	}
}