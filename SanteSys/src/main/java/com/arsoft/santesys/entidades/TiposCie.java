package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tipos_cie database table.
 * 
 */
@Entity
@Table(name="tipos_cie")
@NamedQuery(name="TiposCie.findAll", query="SELECT t FROM TiposCie t")
public class TiposCie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	@Column(name="codigo_real")
	private String codigoReal;

	@Temporal(TemporalType.DATE)
	@Column(name="inicio_vigencia")
	private Date inicioVigencia;

	//bi-directional many-to-one association to Diagnostico
	@OneToMany(mappedBy="tiposCie")
	@JsonIgnore
	private List<Diagnostico> diagnosticos;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	@JsonIgnore
	private Institucione institucione;

	public TiposCie() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCodigoReal() {
		return this.codigoReal;
	}

	public void setCodigoReal(String codigoReal) {
		this.codigoReal = codigoReal;
	}

	public Date getInicioVigencia() {
		return this.inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public List<Diagnostico> getDiagnosticos() {
		return this.diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	public Diagnostico addDiagnostico(Diagnostico diagnostico) {
		getDiagnosticos().add(diagnostico);
		diagnostico.setTiposCie(this);

		return diagnostico;
	}

	public Diagnostico removeDiagnostico(Diagnostico diagnostico) {
		getDiagnosticos().remove(diagnostico);
		diagnostico.setTiposCie(null);

		return diagnostico;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}