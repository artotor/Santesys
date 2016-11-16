/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

/**
 * @author artotor
 *
 */
public class DtoTipoIdentificacion 
{
	private String acronimo;
	
	private String descripcion;
	
	public DtoTipoIdentificacion()
	{
		this.acronimo="";
		this.descripcion="";
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
	
	

}
