/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoConsultorios 
{
	private String activo;

	private Integer codigo;
	
	private String codigoConsultorio;

	private String descripcion;
	
	private DtoTipoConsultorio tipoConsultorio;

	private DtoCentroAtencion centroAtencion;
	
	public DtoConsultorios()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.descripcion="";
		this.codigoConsultorio="";
		this.centroAtencion=new DtoCentroAtencion();
		this.tipoConsultorio=new DtoTipoConsultorio();
	}

	public DtoTipoConsultorio getTipoConsultorio() {
		return tipoConsultorio;
	}

	public void setTipoConsultorio(DtoTipoConsultorio tipoConsultorio) {
		this.tipoConsultorio = tipoConsultorio;
	}

	public String getCodigoConsultorio() {
		return codigoConsultorio;
	}

	public void setCodigoConsultorio(String codigoConsultorio) {
		this.codigoConsultorio = codigoConsultorio;
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

	public DtoCentroAtencion getCentroAtencion() {
		return centroAtencion;
	}

	public void setCentroAtencion(DtoCentroAtencion centroAtencion) {
		this.centroAtencion = centroAtencion;
	}

	

	
}
