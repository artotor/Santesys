package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	@Column(name="correo_electronico")
	private String correoElectronico;

	@Column(name="direccion_residencia")
	private String direccionResidencia;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	private String foto;

	@Column(name="numero_identificacion")
	private String numeroIdentificacion;

	@Column(name="primer_apellido")
	private String primerApellido;

	@Column(name="primer_nombre")
	private String primerNombre;

	@Column(name="rh_tipo_sangre")
	private String rhTipoSangre;

	@Column(name="segundo_apellido")
	private String segundoApellido;

	@Column(name="segundo_nombre")
	private String segundoNombre;

	@Column(name="telefono_1")
	private String telefono1;

	@Column(name="telefono_2")
	private String telefono2;

	@Column(name="tipo_sangre")
	private String tipoSangre;

	//bi-directional many-to-one association to Barrio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="barrio_residencia", referencedColumnName="codigo_barrio", insertable=false, updatable=false),
		@JoinColumn(name="ciudad_residencia", referencedColumnName="codigo_ciudad", insertable=false, updatable=false),
		@JoinColumn(name="departamento_residencia", referencedColumnName="codigo_departamento", insertable=false, updatable=false),
		@JoinColumn(name="pais_residencia", referencedColumnName="codigo_pais", insertable=false, updatable=false)
		})
	private Barrio barrio;

	//bi-directional many-to-one association to Ciudade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="ciudad_expedicion_id", referencedColumnName="codigo_ciudad", insertable=false, updatable=false),
		@JoinColumn(name="departamento_expedicion_id", referencedColumnName="codigo_departamento", insertable=false, updatable=false),
		@JoinColumn(name="pais_expedicion_id", referencedColumnName="codigo_pais", insertable=false, updatable=false)
		})
	private Ciudade ciudade1;

	//bi-directional many-to-one association to Ciudade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="ciudad_nacimiento", referencedColumnName="codigo_ciudad", insertable=false, updatable=false),
		@JoinColumn(name="departamento_nacimiento", referencedColumnName="codigo_departamento", insertable=false, updatable=false),
		@JoinColumn(name="pais_nacimiento", referencedColumnName="codigo_pais", insertable=false, updatable=false)
		})
	private Ciudade ciudade2;

	//bi-directional many-to-one association to EstadosCivile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="estado_civil", insertable=false, updatable=false)
	private EstadosCivile estadosCivile;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institución", insertable=false, updatable=false)
	private Institucione institucione;

	//bi-directional many-to-one association to OcupacionesProfesionale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ocupacion", insertable=false, updatable=false)
	private OcupacionesProfesionale ocupacionesProfesionale;

	//bi-directional many-to-one association to Sexo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sexo", insertable=false, updatable=false)
	private Sexo sexoBean;

	//bi-directional many-to-one association to TiposIdentificacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_identificacion", insertable=false, updatable=false)
	private TiposIdentificacion tiposIdentificacion;

	//bi-directional one-to-one association to ProfesionalesSalud
	@OneToOne(mappedBy="persona", fetch=FetchType.LAZY)
	private ProfesionalesSalud profesionalesSalud;

	//bi-directional one-to-one association to Usuario
	@OneToOne(mappedBy="persona", fetch=FetchType.LAZY)
	private Usuario usuario;

	public Persona() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDireccionResidencia() {
		return this.direccionResidencia;
	}

	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNumeroIdentificacion() {
		return this.numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getRhTipoSangre() {
		return this.rhTipoSangre;
	}

	public void setRhTipoSangre(String rhTipoSangre) {
		this.rhTipoSangre = rhTipoSangre;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return this.telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public String getTipoSangre() {
		return this.tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public Barrio getBarrio() {
		return this.barrio;
	}

	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}

	public Ciudade getCiudade1() {
		return this.ciudade1;
	}

	public void setCiudade1(Ciudade ciudade1) {
		this.ciudade1 = ciudade1;
	}

	public Ciudade getCiudade2() {
		return this.ciudade2;
	}

	public void setCiudade2(Ciudade ciudade2) {
		this.ciudade2 = ciudade2;
	}

	public EstadosCivile getEstadosCivile() {
		return this.estadosCivile;
	}

	public void setEstadosCivile(EstadosCivile estadosCivile) {
		this.estadosCivile = estadosCivile;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

	public OcupacionesProfesionale getOcupacionesProfesionale() {
		return this.ocupacionesProfesionale;
	}

	public void setOcupacionesProfesionale(OcupacionesProfesionale ocupacionesProfesionale) {
		this.ocupacionesProfesionale = ocupacionesProfesionale;
	}

	public Sexo getSexoBean() {
		return this.sexoBean;
	}

	public void setSexoBean(Sexo sexoBean) {
		this.sexoBean = sexoBean;
	}

	public TiposIdentificacion getTiposIdentificacion() {
		return this.tiposIdentificacion;
	}

	public void setTiposIdentificacion(TiposIdentificacion tiposIdentificacion) {
		this.tiposIdentificacion = tiposIdentificacion;
	}

	public ProfesionalesSalud getProfesionalesSalud() {
		return this.profesionalesSalud;
	}

	public void setProfesionalesSalud(ProfesionalesSalud profesionalesSalud) {
		this.profesionalesSalud = profesionalesSalud;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}