package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grupos_servicios database table.
 * 
 */
@Entity
@Table(name="grupos_servicios")
@NamedQuery(name="GruposServicio.findAll", query="SELECT g FROM GruposServicio g")
public class GruposServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_grupos_servicio", sequenceName="seq_grupos_servicio",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_grupos_servicio")
	private Integer codigo;

	private String acronimo;

	private String activo;

	private String descripcion;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion")
	private Institucione institucione;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="gruposServicio")
	private List<Servicio> servicios;

	public GruposServicio() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAcronimo() {
		return this.acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setGruposServicio(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setGruposServicio(null);

		return servicio;
	}

}