package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the diagnosticos database table.
 * 
 */
@Entity
@Table(name="diagnosticos")
@NamedQuery(name="Diagnostico.findAll", query="SELECT d FROM Diagnostico d")
public class Diagnostico implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DiagnosticoPK id;

	private String activo;

	@Column(name="edad_final")
	private BigDecimal edadFinal;

	@Column(name="edad_inicial")
	private BigDecimal edadInicial;

	@Column(name="es_muerte")
	private String esMuerte;

	@Column(name="es_odontologico")
	private String esOdontologico;

	@Column(name="es_principal")
	private String esPrincipal;

	private String nombre;

	//bi-directional many-to-one association to Sexo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sexo", insertable=false, updatable=false)
	private Sexo sexoBean;

	//bi-directional many-to-one association to TiposCie
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_cie", insertable=false, updatable=false)
	private TiposCie tiposCie;

	public Diagnostico() {
	}

	public DiagnosticoPK getId() {
		return this.id;
	}

	public void setId(DiagnosticoPK id) {
		this.id = id;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public BigDecimal getEdadFinal() {
		return this.edadFinal;
	}

	public void setEdadFinal(BigDecimal edadFinal) {
		this.edadFinal = edadFinal;
	}

	public BigDecimal getEdadInicial() {
		return this.edadInicial;
	}

	public void setEdadInicial(BigDecimal edadInicial) {
		this.edadInicial = edadInicial;
	}

	public String getEsMuerte() {
		return this.esMuerte;
	}

	public void setEsMuerte(String esMuerte) {
		this.esMuerte = esMuerte;
	}

	public String getEsOdontologico() {
		return this.esOdontologico;
	}

	public void setEsOdontologico(String esOdontologico) {
		this.esOdontologico = esOdontologico;
	}

	public String getEsPrincipal() {
		return this.esPrincipal;
	}

	public void setEsPrincipal(String esPrincipal) {
		this.esPrincipal = esPrincipal;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sexo getSexoBean() {
		return this.sexoBean;
	}

	public void setSexoBean(Sexo sexoBean) {
		this.sexoBean = sexoBean;
	}

	public TiposCie getTiposCie() {
		return this.tiposCie;
	}

	public void setTiposCie(TiposCie tiposCie) {
		this.tiposCie = tiposCie;
	}

}