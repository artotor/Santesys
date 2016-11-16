/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import java.util.Date;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoTipoCie {
	
	private Integer codigo;
	
	private String codigoReal;
	
	private Date inicioVigencia;
	
	private Integer codigoInstitucion;
	
	public DtoTipoCie()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.codigoReal="";
		this.inicioVigencia=null;
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCodigoReal() {
		return codigoReal;
	}

	public void setCodigoReal(String codigoReal) {
		this.codigoReal = codigoReal;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}
	
	

}
