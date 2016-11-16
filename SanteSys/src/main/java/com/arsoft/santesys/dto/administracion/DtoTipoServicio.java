/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoTipoServicio 
{
	/**
	 * 
	 */
	private String acronimo;

	/**
	 * 
	 */
	private String descripcion;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	private Integer codigoInstitucion;
	
	
	public DtoTipoServicio()
	{
		this.acronimo="";
		this.descripcion="";
		this.nombre="";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
	}


	public String getAcronimo() {
		return acronimo;
	}


	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
