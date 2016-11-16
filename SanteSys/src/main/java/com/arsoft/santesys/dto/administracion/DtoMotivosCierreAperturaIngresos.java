package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

public class DtoMotivosCierreAperturaIngresos {

	private Integer codigo;
	
	private String activo;

	private String descripcion;

	private String tipo;
	
	private Integer codigoInstitucion;
	
	public DtoMotivosCierreAperturaIngresos()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.activo=ConstantesBD.acronimoSi;
		this.descripcion="";
		this.tipo=ConstantesBD.acronimoApertura;
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
	}

	
	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}


	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
