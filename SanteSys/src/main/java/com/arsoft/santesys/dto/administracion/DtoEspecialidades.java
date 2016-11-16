/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoEspecialidades 
{
	
	/**
	 * 
	 */
	private Integer codigo;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	private String activo;

	
	/**
	 * 
	 */
	private Integer codigoInstitucion;

	public DtoEspecialidades()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.nombre="";
		this.activo=ConstantesBD.acronimoSi;
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}
	
	
	

}
