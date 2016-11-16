package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

public class DtoFuncionalidades 
{
	private Integer codigo;

	private String accion;

	private String activo;

	private String descripcion;

	private String label;

	private String nombre;
	
	private Integer codigoInstitucion;
	
	/**
	 * 
	 */
	public DtoFuncionalidades()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.accion="";
		this.activo=ConstantesBD.acronimoSi;
		this.descripcion="";
		this.label="";
		this.nombre="";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}
	
	

}
