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
public class DtoExcecionesAgenda {
	
	private Integer codigo;

	private String descripcion;
	
	private Date fecha;
	
	private DtoCentroAtencion centroAtencion;

	private String activo;
	
	/**
	 * 
	 * @param codigo
	 */
	public DtoExcecionesAgenda(Integer codigo) 
	{
		this.codigo = codigo;
		this.descripcion = "";
		this.fecha = new Date();
		this.centroAtencion = new DtoCentroAtencion();
		this.activo=ConstantesBD.acronimoSi;
	}
	
	

	






	/**
	 * 
	 */
	public DtoExcecionesAgenda() 
	{
		this.codigo = ConstantesBD.codigoNuncaValido;
		this.descripcion = "";
		this.fecha = new Date();
		this.centroAtencion = new DtoCentroAtencion();
		this.activo=ConstantesBD.acronimoSi;
	}



	public String getActivo() {
		return activo;
	}





	public void setActivo(String activo) {
		this.activo = activo;
	}


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


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public DtoCentroAtencion getCentroAtencion() {
		return centroAtencion;
	}


	public void setCentroAtencion(DtoCentroAtencion centroAtencion) {
		this.centroAtencion = centroAtencion;
	}
	
	
	
	


}
