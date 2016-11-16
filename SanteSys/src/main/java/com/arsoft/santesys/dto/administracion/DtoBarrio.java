/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoBarrio 
{
	private Integer codigoBarrio;
	
	private String descripcionBarrio;
	
	private DtoCiudades ciudad;
	
	public DtoBarrio()
	{
		this.codigoBarrio=ConstantesBD.codigoNuncaValido;
		this.descripcionBarrio="";
		this.ciudad=new DtoCiudades();
	}

	public Integer getCodigoBarrio() {
		return codigoBarrio;
	}

	public void setCodigoBarrio(Integer codigoBarrio) {
		this.codigoBarrio = codigoBarrio;
	}

	public String getDescripcionBarrio() {
		return descripcionBarrio;
	}

	public void setDescripcionBarrio(String descripcionBarrio) {
		this.descripcionBarrio = descripcionBarrio;
	}

	public DtoCiudades getCiudad() {
		return ciudad;
	}

	public void setCiudad(DtoCiudades ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
