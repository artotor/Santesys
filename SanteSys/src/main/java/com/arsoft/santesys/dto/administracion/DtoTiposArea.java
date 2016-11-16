/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoTiposArea {

private Integer codigo;
	
	private String nombre;
	
	private Integer codigoInstitucion;
	
	public DtoTiposArea()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.nombre="";
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

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}

	
	

}
