package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the centros_atencion database table.
 * 
 */
@Entity
@Table(name="centros_atencion")
@NamedQuery(name="CentrosAtencion.findAll", query="SELECT c FROM CentrosAtencion c")
public class CentrosAtencion implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@SequenceGenerator(name="seq_centros_aten", sequenceName="seq_centros_aten",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_centros_aten")
	private Integer codigo;

	private String activo;

	@Column(name="codigo_centro")
	private String codigoCentro;

	private String descripcion;

	private String direccion;

	private String telefono;

	//bi-directional many-to-one association to Ciudade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_ciudad", referencedColumnName="codigo_ciudad"),
		@JoinColumn(name="codigo_departamento", referencedColumnName="codigo_departamento"),
		@JoinColumn(name="codigo_pais", referencedColumnName="codigo_pais")
		})
	private Ciudade ciudade;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion")
	private Institucione institucione;

	//bi-directional many-to-one association to CentrosCosto
	@OneToMany(mappedBy="centrosAtencion")
	private List<CentrosCosto> centrosCostos;

	//bi-directional many-to-one association to Consultorio
	@OneToMany(mappedBy="centrosAtencion")
	private List<Consultorio> consultorios;

	//bi-directional many-to-one association to ExcepcionesAgenda
	@OneToMany(mappedBy="centrosAtencion")
	private List<ExcepcionesAgenda> excepcionesAgendas;

	public CentrosAtencion() {
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

	public String getCodigoCentro() {
		return this.codigoCentro;
	}

	public void setCodigoCentro(String codigoCentro) {
		this.codigoCentro = codigoCentro;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Ciudade getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudade ciudade) {
		this.ciudade = ciudade;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

	public List<CentrosCosto> getCentrosCostos() {
		return this.centrosCostos;
	}

	public void setCentrosCostos(List<CentrosCosto> centrosCostos) {
		this.centrosCostos = centrosCostos;
	}

	public CentrosCosto addCentrosCosto(CentrosCosto centrosCosto) {
		getCentrosCostos().add(centrosCosto);
		centrosCosto.setCentrosAtencion(this);

		return centrosCosto;
	}

	public CentrosCosto removeCentrosCosto(CentrosCosto centrosCosto) {
		getCentrosCostos().remove(centrosCosto);
		centrosCosto.setCentrosAtencion(null);

		return centrosCosto;
	}

	public List<Consultorio> getConsultorios() {
		return this.consultorios;
	}

	public void setConsultorios(List<Consultorio> consultorios) {
		this.consultorios = consultorios;
	}

	public Consultorio addConsultorio(Consultorio consultorio) {
		getConsultorios().add(consultorio);
		consultorio.setCentrosAtencion(this);

		return consultorio;
	}

	public Consultorio removeConsultorio(Consultorio consultorio) {
		getConsultorios().remove(consultorio);
		consultorio.setCentrosAtencion(null);

		return consultorio;
	}

	public List<ExcepcionesAgenda> getExcepcionesAgendas() {
		return this.excepcionesAgendas;
	}

	public void setExcepcionesAgendas(List<ExcepcionesAgenda> excepcionesAgendas) {
		this.excepcionesAgendas = excepcionesAgendas;
	}

	public ExcepcionesAgenda addExcepcionesAgenda(ExcepcionesAgenda excepcionesAgenda) {
		getExcepcionesAgendas().add(excepcionesAgenda);
		excepcionesAgenda.setCentrosAtencion(this);

		return excepcionesAgenda;
	}

	public ExcepcionesAgenda removeExcepcionesAgenda(ExcepcionesAgenda excepcionesAgenda) {
		getExcepcionesAgendas().remove(excepcionesAgenda);
		excepcionesAgenda.setCentrosAtencion(null);

		return excepcionesAgenda;
	}

}