/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoCentroCosto {

	private Integer codigo;

	private String activo;

	private String manejoCamas;

	private String nombre;

	private DtoCentroAtencion centrosAtencion;

	private DtoTiposArea tiposArea;

	private DtoUnidadesFuncionales unidadesFuncionale;

	
	
	
	public DtoCentroCosto() 
	{
		this.codigo = ConstantesBD.codigoNuncaValido;
		this.activo = ConstantesBD.acronimoSi;
		this.manejoCamas = ConstantesBD.acronimoSi;
		this.nombre = "";
		this.centrosAtencion = new DtoCentroAtencion();
		this.tiposArea = new DtoTiposArea();
		this.unidadesFuncionale = new DtoUnidadesFuncionales();
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

	public String getManejoCamas() {
		return manejoCamas;
	}

	public void setManejoCamas(String manejoCamas) {
		this.manejoCamas = manejoCamas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DtoCentroAtencion getCentrosAtencion() {
		return centrosAtencion;
	}

	public void setCentrosAtencion(DtoCentroAtencion centrosAtencion) {
		this.centrosAtencion = centrosAtencion;
	}

	public DtoTiposArea getTiposArea() {
		return tiposArea;
	}

	public void setTiposArea(DtoTiposArea tiposArea) {
		this.tiposArea = tiposArea;
	}

	public DtoUnidadesFuncionales getUnidadesFuncionale() {
		return unidadesFuncionale;
	}

	public void setUnidadesFuncionale(DtoUnidadesFuncionales unidadesFuncionale) {
		this.unidadesFuncionale = unidadesFuncionale;
	}

	
	

}
