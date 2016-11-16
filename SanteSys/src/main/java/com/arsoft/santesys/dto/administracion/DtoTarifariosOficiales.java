/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import javax.persistence.Column;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoTarifariosOficiales 
{
	private Integer codigo;

	private String activo;

	private String esTarifario;

	private String nombre;
	
	private Integer codigoInstitucion;
	
	public DtoTarifariosOficiales()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.activo=ConstantesBD.acronimoSi;
		this.esTarifario=ConstantesBD.acronimoSi;
		this.nombre="";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
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

	public String getEsTarifario() {
		return esTarifario;
	}

	public void setEsTarifario(String esTarifario) {
		this.esTarifario = esTarifario;
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
