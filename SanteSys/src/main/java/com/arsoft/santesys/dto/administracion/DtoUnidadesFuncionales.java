package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

public class DtoUnidadesFuncionales 
{

	/**
	 * 
	 */
	private Integer codigo;

	/**
	 * 
	 */
	private String acronimo;

	/**
	 * 
	 */
	private String activo;

	/**
	 * 
	 */
	private String descripcion;
	
	/**
	 * 
	 */
	private Integer codigoInstitucion;
	
	/**
	 * 
	 */
	public DtoUnidadesFuncionales()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.acronimo="";
		this.activo=ConstantesBD.acronimoSi;
		this.descripcion="";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAcronimo() {
		return acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
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

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}
	
	
	
}

