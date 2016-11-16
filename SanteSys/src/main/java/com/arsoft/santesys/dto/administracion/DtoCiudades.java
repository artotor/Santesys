package com.arsoft.santesys.dto.administracion;

public class DtoCiudades 
{
	
	
	private String codigo;
	
	private String descripcion;
	
	private DtoDepartamentos departamento;

	
	
	public DtoCiudades() {
		
		this.codigo = "";
		this.descripcion = "";
		this.departamento = new DtoDepartamentos();
	}
	
	public DtoCiudades(String codigoCiudad,String codigoDepartamento, Integer codigoPais) {
		
		this.codigo = codigoCiudad;
		this.departamento=new DtoDepartamentos(codigoDepartamento,codigoPais);
		this.descripcion = "";
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

	public DtoDepartamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DtoDepartamentos departamento) {
		this.departamento = departamento;
	}
	
	

}
