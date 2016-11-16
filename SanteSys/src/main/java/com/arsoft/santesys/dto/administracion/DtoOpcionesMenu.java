/**
 * 
 */
package com.arsoft.santesys.dto.administracion;

import java.util.ArrayList;

import com.arsoft.santesys.utilidades.ConstantesBD;

/**
 * @author artotor
 *
 */
public class DtoOpcionesMenu 
{
	private Integer codigo;

	private String activo;

	private String label;

	private String nombre;

	private String visible;

	private Integer codigoMenu;
	
	private ArrayList<DtoFuncionalidades> funcionalidades;
	
	public DtoOpcionesMenu()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.activo=ConstantesBD.acronimoSi;
		this.label="";
		this.nombre="";
		this.visible=ConstantesBD.acronimoSi;
		this.codigoMenu=ConstantesBD.codigoNuncaValido;
		this.funcionalidades=new ArrayList<DtoFuncionalidades>();
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public Integer getCodigoMenu() {
		return codigoMenu;
	}

	public void setCodigoMenu(Integer codigoMenu) {
		this.codigoMenu = codigoMenu;
	}

	public ArrayList<DtoFuncionalidades> getFuncionalidades() {
		return funcionalidades;
	}

	public void setFuncionalidades(ArrayList<DtoFuncionalidades> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}
	
	
	

}
