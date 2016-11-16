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
public class DtoMenu 
{
	private Integer codigo;

	private String activo;

	private String label;

	private String nombre;
	
	public Integer codigoInstitucion;
	
	public ArrayList<DtoOpcionesMenu> opcionesMenu;
	
	public DtoMenu()
	{
		this.codigo=ConstantesBD.codigoNuncaValido;
		this.activo=ConstantesBD.acronimoSi;
		this.label="";
		this.nombre="";
		this.codigoInstitucion=ConstantesBD.codigoNuncaValido;
		this.opcionesMenu=new ArrayList<DtoOpcionesMenu>();
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

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}

	public ArrayList<DtoOpcionesMenu> getOpcionesMenu() {
		return opcionesMenu;
	}

	public void setOpcionesMenu(ArrayList<DtoOpcionesMenu> opcionesMenu) {
		this.opcionesMenu = opcionesMenu;
	}
	
	
	

}
