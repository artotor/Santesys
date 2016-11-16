package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

public class DtoPaises {
	
	private Integer codigo;
	
	private String descripcion;

	
	
	
	public DtoPaises() {
		this.codigo = ConstantesBD.codigoNuncaValido;
		this.descripcion = "";
	}
	
	public DtoPaises(Integer codigo) {
		this.codigo = codigo;
		this.descripcion = "";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
