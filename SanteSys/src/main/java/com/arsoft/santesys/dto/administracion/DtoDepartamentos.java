package com.arsoft.santesys.dto.administracion;


public class DtoDepartamentos 
{
	
	private String codigo;
	
	private String descripcion;
	
	private DtoPaises pais;

	
	
	public DtoDepartamentos() 
	{
		this.codigo = "";
		this.descripcion = "";
		this.pais = new DtoPaises();
	}
	

	/**
	 * 
	 */
	public DtoDepartamentos(String codigo,Integer codigoPais) 
	{
		this.codigo = codigo;
		this.descripcion = "";
		this.pais = new DtoPaises(codigoPais);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public DtoPaises getPais() {
		return pais;
	}

	public void setPais(DtoPaises pais) {
		this.pais = pais;
	}
	
	
	

}
