/**
 * 
 */
package com.arsoft.santesys.utilidades;

/**
 * @author artotor
 *
 */
public class ObjetoRetornoDto {
	
	private boolean resultadoCorrecto;
	
	private Object resultado;
	
	private String mensaje;

	
	
	
	public ObjetoRetornoDto() {
		super();
		this.resultadoCorrecto=true;
		this.resultado=new Object();
		this.mensaje="";
	}

	public boolean isResultadoCorrecto() {
		return resultadoCorrecto;
	}

	public void setResultadoCorrecto(boolean resultadoCorrecto) {
		this.resultadoCorrecto = resultadoCorrecto;
	}

	public Object getResultado() {
		return resultado;
	}

	public void setResultado(Object resultado) {
		this.resultado = resultado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	
}
