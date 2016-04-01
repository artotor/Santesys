package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the profesionales_salud database table.
 * 
 */
@Entity
@Table(name="profesionales_salud")
@NamedQuery(name="ProfesionalesSalud.findAll", query="SELECT p FROM ProfesionalesSalud p")
public class ProfesionalesSalud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vinculacion")
	private Date fechaVinculacion;

	@Column(name="registro_medico")
	private String registroMedico;

	//bi-directional many-to-many association to Especialidade
	@ManyToMany
	@JoinTable(
		name="especialidades_profesional"
		, joinColumns={
			@JoinColumn(name="profesional", insertable=false, updatable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="especialidad", insertable=false, updatable=false)
			}
		)
	private List<Especialidade> especialidades;

	//bi-directional many-to-one association to Ciudade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="ciudad_registro", referencedColumnName="codigo_ciudad", insertable=false, updatable=false),
		@JoinColumn(name="departamento_registro", referencedColumnName="codigo_departamento", insertable=false, updatable=false),
		@JoinColumn(name="pais_registro", referencedColumnName="codigo_pais", insertable=false, updatable=false)
		})
	private Ciudade ciudade;

	//bi-directional many-to-one association to OcupacionesMedica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ocupacion_medica", insertable=false, updatable=false)
	private OcupacionesMedica ocupacionesMedica;

	//bi-directional one-to-one association to Persona
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codigo", insertable=false, updatable=false)
	private Persona persona;

	//bi-directional many-to-one association to TiposVinculacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_vinculacion", insertable=false, updatable=false)
	private TiposVinculacion tiposVinculacion;

	public ProfesionalesSalud() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getFechaVinculacion() {
		return this.fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public String getRegistroMedico() {
		return this.registroMedico;
	}

	public void setRegistroMedico(String registroMedico) {
		this.registroMedico = registroMedico;
	}

	public List<Especialidade> getEspecialidades() {
		return this.especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public Ciudade getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudade ciudade) {
		this.ciudade = ciudade;
	}

	public OcupacionesMedica getOcupacionesMedica() {
		return this.ocupacionesMedica;
	}

	public void setOcupacionesMedica(OcupacionesMedica ocupacionesMedica) {
		this.ocupacionesMedica = ocupacionesMedica;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public TiposVinculacion getTiposVinculacion() {
		return this.tiposVinculacion;
	}

	public void setTiposVinculacion(TiposVinculacion tiposVinculacion) {
		this.tiposVinculacion = tiposVinculacion;
	}

}