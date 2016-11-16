package com.arsoft.santesys.dto.administracion;


import com.arsoft.santesys.utilidades.ConstantesBD;

public class DtoViasIngreso 
{

	private Integer codigo;

	private String identificador;

	private String nombre;

	private String reqRespPaciente;
	
	private Integer codigoInstitucion;
	
	private Integer viaIngresoFija;

	public DtoViasIngreso() 
	{
		this.codigo = ConstantesBD.codigoNuncaValido;
		this.identificador = "";
		this.nombre = "";
		this.reqRespPaciente = ConstantesBD.acronimoNo;
		this.codigoInstitucion = ConstantesBD.codigoNuncaValido;
		this.viaIngresoFija=ConstantesBD.codigoNuncaValido;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReqRespPaciente() {
		return reqRespPaciente;
	}

	public void setReqRespPaciente(String reqRespPaciente) {
		this.reqRespPaciente = reqRespPaciente;
	}

	public Integer getCodigoInstitucion() {
		return codigoInstitucion;
	}

	public void setCodigoInstitucion(Integer codigoInstitucion) {
		this.codigoInstitucion = codigoInstitucion;
	}

	public Integer getViaIngresoFija() {
		return viaIngresoFija;
	}

	public void setViaIngresoFija(Integer viaIngresoFija) {
		this.viaIngresoFija = viaIngresoFija;
	}
	
	
	
	
	
}
