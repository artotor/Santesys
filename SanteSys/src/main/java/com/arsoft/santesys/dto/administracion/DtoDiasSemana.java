/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoDiasSemana {

	public DtoDiasSemana()
	{
		
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.descripcion="";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
	}

	private Integer codigo;
	
	private String descripcion;
	
	private Integer codigoInstitucion;
	
	
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

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}
	

}
