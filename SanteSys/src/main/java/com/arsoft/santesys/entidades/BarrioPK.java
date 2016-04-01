package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the barrios database table.
 * 
 */
@Embeddable
public class BarrioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="codigo_barrio")
	private Integer codigoBarrio;

	@Column(name="codigo_ciudad", insertable=false, updatable=false)
	private String codigoCiudad;

	@Column(name="codigo_departamento", insertable=false, updatable=false)
	private String codigoDepartamento;

	@Column(name="codigo_pais", insertable=false, updatable=false)
	private Integer codigoPais;

	public BarrioPK() {
	}
	public Integer getCodigoBarrio() {
		return this.codigoBarrio;
	}
	public void setCodigoBarrio(Integer codigoBarrio) {
		this.codigoBarrio = codigoBarrio;
	}
	public String getCodigoCiudad() {
		return this.codigoCiudad;
	}
	public void setCodigoCiudad(String codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
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
		if (!(other instanceof BarrioPK)) {
			return false;
		}
		BarrioPK castOther = (BarrioPK)other;
		return 
			this.codigoBarrio.equals(castOther.codigoBarrio)
			&& this.codigoCiudad.equals(castOther.codigoCiudad)
			&& this.codigoDepartamento.equals(castOther.codigoDepartamento)
			&& this.codigoPais.equals(castOther.codigoPais);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codigoBarrio.hashCode();
		hash = hash * prime + this.codigoCiudad.hashCode();
		hash = hash * prime + this.codigoDepartamento.hashCode();
		hash = hash * prime + this.codigoPais.hashCode();
		
		return hash;
	}
}