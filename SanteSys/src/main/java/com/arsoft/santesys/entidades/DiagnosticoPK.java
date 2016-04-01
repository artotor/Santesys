package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the diagnosticos database table.
 * 
 */
@Embeddable
public class DiagnosticoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String acronimo;

	@Column(name="tipo_cie", insertable=false, updatable=false)
	private Integer tipoCie;

	public DiagnosticoPK() {
	}
	public String getAcronimo() {
		return this.acronimo;
	}
	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}
	public Integer getTipoCie() {
		return this.tipoCie;
	}
	public void setTipoCie(Integer tipoCie) {
		this.tipoCie = tipoCie;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DiagnosticoPK)) {
			return false;
		}
		DiagnosticoPK castOther = (DiagnosticoPK)other;
		return 
			this.acronimo.equals(castOther.acronimo)
			&& this.tipoCie.equals(castOther.tipoCie);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.acronimo.hashCode();
		hash = hash * prime + this.tipoCie.hashCode();
		
		return hash;
	}
}