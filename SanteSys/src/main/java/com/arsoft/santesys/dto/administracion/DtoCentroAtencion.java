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
public class DtoCentroAtencion 
{
	
	private Integer codigo;

	private String activo;

	private String codigoCentro;

	private String descripcion;

	private String direccion;

	private String telefono;
	
	/**
	 * 
	 */
	private Integer codigoInstitucion;
	
	/**
	 * 
	 */
	private DtoCiudades ciudad;
	

	/**
	 * 
	 */
	public DtoCentroAtencion() 
	{
		this.codigo = ConstantesBD.codigoNuncaValido;
		this.activo = ConstantesBD.acronimoSi;
		this.codigoCentro = "";
		this.descripcion = "";
		this.direccion = "";
		this.telefono = "";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
		this.ciudad=new DtoCiudades();
	}
	
	/**
	 * 
	 */
	public DtoCentroAtencion(Integer codigo) 
	{
		this.codigo = codigo;
		this.activo = ConstantesBD.acronimoSi;
		this.codigoCentro = "";
		this.descripcion = "";
		this.direccion = "";
		this.telefono = "";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
		this.ciudad=new DtoCiudades();
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

	public String getCodigoCentro() {
		return codigoCentro;
	}

	public void setCodigoCentro(String codigoCentro) {
		this.codigoCentro = codigoCentro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}

	public DtoCiudades getCiudad() {
		return ciudad;
	}

	public void setCiudad(DtoCiudades ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	

}
