package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the departamentos database table.
 * 
 */
@Embeddable
public class DepartamentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="codigo_departamento")
	private String codigoDepartamento;

	@Column(name="codigo_pais", insertable=false, updatable=false)
	private Integer codigoPais;

	public DepartamentoPK() {
	}
	public String getCodigoDepartamento() {
		return this.codigoDepartamento;
	}
	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}
	public Integer getCodigoPais() {
		return this.codigoPais;
	}
	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DepartamentoPK)) {
			return false;
		}
		DepartamentoPK castOther = (DepartamentoPK)other;
		return 
			this.codigoDepartamento.equals(castOther.codigoDepartamento)
			&& this.codigoPais.equals(castOther.codigoPais);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codigoDepartamento.hashCode();
		hash = hash * prime + this.codigoPais.hashCode();
		
		return hash;
	}
}