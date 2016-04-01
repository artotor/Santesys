package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vias_ingreso database table.
 * 
 */
@Entity
@Table(name="vias_ingreso")
@NamedQuery(name="ViasIngreso.findAll", query="SELECT v FROM ViasIngreso v")
public class ViasIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String identificador;

	private String nombre;

	@Column(name="req_resp_paciente")
	private String reqRespPaciente;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	private Institucione institucione;

	public ViasIngreso() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReqRespPaciente() {
		return this.reqRespPaciente;
	}

	public void setReqRespPaciente(String reqRespPaciente) {
		this.reqRespPaciente = reqRespPaciente;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}