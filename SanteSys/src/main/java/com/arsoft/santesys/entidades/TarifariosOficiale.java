package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tarifarios_oficiales database table.
 * 
 */
@Entity
@Table(name="tarifarios_oficiales")
@NamedQuery(name="TarifariosOficiale.findAll", query="SELECT t FROM TarifariosOficiale t")
public class TarifariosOficiale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_tarifarios_oficiales", sequenceName="seq_tarifarios_oficiales",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_tarifarios_oficiales")
	private Integer codigo;

	private String activo;

	@Column(name="es_tarifario")
	private String esTarifario;

	private String nombre;

	//bi-directional many-to-one association to ReferenciasServicio
	@OneToMany(mappedBy="tarifariosOficiale")
	private List<ReferenciasServicio> referenciasServicios;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion")
	private Institucione institucione;

	public TarifariosOficiale() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getEsTarifario() {
		return this.esTarifario;
	}

	public void setEsTarifario(String esTarifario) {
		this.esTarifario = esTarifario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ReferenciasServicio> getReferenciasServicios() {
		return this.referenciasServicios;
	}

	public void setReferenciasServicios(List<ReferenciasServicio> referenciasServicios) {
		this.referenciasServicios = referenciasServicios;
	}

	public ReferenciasServicio addReferenciasServicio(ReferenciasServicio referenciasServicio) {
		getReferenciasServicios().add(referenciasServicio);
		referenciasServicio.setTarifariosOficiale(this);

		return referenciasServicio;
	}

	public ReferenciasServicio removeReferenciasServicio(ReferenciasServicio referenciasServicio) {
		getReferenciasServicios().remove(referenciasServicio);
		referenciasServicio.setTarifariosOficiale(null);

		return referenciasServicio;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

}