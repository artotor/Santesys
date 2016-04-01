package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the instituciones database table.
 * 
 */
@Entity
@Table(name="instituciones")
@NamedQuery(name="Institucione.findAll", query="SELECT i FROM Institucione i")
public class Institucione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	@Column(name="cod_min_salud")
	private String codMinSalud;

	@Column(name="codigo_act_econo")
	private String codigoActEcono;

	@Column(name="desc_act_econo")
	private String descActEcono;

	@Column(name="digito_verificacion")
	private Integer digitoVerificacion;

	private String direccion;

	@Column(name="encabezado_factura")
	private String encabezadoFactura;

	private String logo;

	@Column(name="numero_identificacion")
	private String numeroIdentificacion;

	@Column(name="pie_his_cli_impr")
	private String pieHisCliImpr;

	@Column(name="piepagina_factura")
	private String piepaginaFactura;

	@Column(name="prefijo_facturacion")
	private String prefijoFacturacion;

	@Column(name="razon_social")
	private String razonSocial;

	private String resolucion;

	@Column(name="rgo_fin_fact")
	private Integer rgoFinFact;

	@Column(name="rgo_inic_fact")
	private Integer rgoInicFact;

	private String telefono;

	@Column(name="tipo_institucion")
	private String tipoInstitucion;

	//bi-directional many-to-one association to CentrosAtencion
	@OneToMany(mappedBy="institucione")
	private List<CentrosAtencion> centrosAtencions;

	//bi-directional many-to-one association to DiasSemana
	@OneToMany(mappedBy="institucione")
	private List<DiasSemana> diasSemanas;

	//bi-directional many-to-one association to Especialidade
	@OneToMany(mappedBy="institucione")
	private List<Especialidade> especialidades;

	//bi-directional many-to-one association to EstadosCivile
	@OneToMany(mappedBy="institucione")
	private List<EstadosCivile> estadosCiviles;

	//bi-directional many-to-one association to Funcionalidade
	@OneToMany(mappedBy="institucione")
	private List<Funcionalidade> funcionalidades;

	//bi-directional many-to-one association to GruposServicio
	@OneToMany(mappedBy="institucione")
	private List<GruposServicio> gruposServicios;

	//bi-directional many-to-one association to Ciudade
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_ciudad", referencedColumnName="codigo_ciudad", insertable=false, updatable=false),
		@JoinColumn(name="codigo_departamento", referencedColumnName="codigo_departamento", insertable=false, updatable=false),
		@JoinColumn(name="codigo_pais", referencedColumnName="codigo_pais", insertable=false, updatable=false)
		})
	private Ciudade ciudade;

	//bi-directional many-to-one association to TiposIdentificacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_identificacion", insertable=false, updatable=false)
	private TiposIdentificacion tiposIdentificacion;

	//bi-directional many-to-one association to IntegridadDominio
	@OneToMany(mappedBy="institucione")
	private List<IntegridadDominio> integridadDominios;

	//bi-directional many-to-one association to Menu
	@OneToMany(mappedBy="institucione")
	private List<Menu> menus;

	//bi-directional many-to-one association to MotCierreAperturaIngreso
	@OneToMany(mappedBy="institucione")
	private List<MotCierreAperturaIngreso> motCierreAperturaIngresos;

	//bi-directional many-to-one association to NaturalezasServicio
	@OneToMany(mappedBy="institucione")
	private List<NaturalezasServicio> naturalezasServicios;

	//bi-directional many-to-one association to OcupacionesMedica
	@OneToMany(mappedBy="institucione")
	private List<OcupacionesMedica> ocupacionesMedicas;

	//bi-directional many-to-one association to OcupacionesProfesionale
	@OneToMany(mappedBy="institucione")
	private List<OcupacionesProfesionale> ocupacionesProfesionales;

	//bi-directional many-to-one association to Perfile
	@OneToMany(mappedBy="institucione")
	private List<Perfile> perfiles;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="institucione")
	private List<Persona> personas;

	//bi-directional many-to-one association to Sexo
	@OneToMany(mappedBy="institucione")
	private List<Sexo> sexos;

	//bi-directional many-to-one association to TarifariosOficiale
	@OneToMany(mappedBy="institucione")
	private List<TarifariosOficiale> tarifariosOficiales;

	//bi-directional many-to-one association to TiposArea
	@OneToMany(mappedBy="institucione")
	private List<TiposArea> tiposAreas;

	//bi-directional many-to-one association to TiposCie
	@OneToMany(mappedBy="institucione")
	private List<TiposCie> tiposCies;

	//bi-directional many-to-one association to TiposConsultorio
	@OneToMany(mappedBy="institucione")
	private List<TiposConsultorio> tiposConsultorios;

	//bi-directional many-to-one association to TiposServicio
	@OneToMany(mappedBy="institucione")
	private List<TiposServicio> tiposServicios;

	//bi-directional many-to-one association to TiposVinculacion
	@OneToMany(mappedBy="institucione")
	private List<TiposVinculacion> tiposVinculacions;

	//bi-directional many-to-one association to UnidadesFuncionale
	@OneToMany(mappedBy="institucione")
	private List<UnidadesFuncionale> unidadesFuncionales;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="institucione")
	private List<Usuario> usuarios;

	//bi-directional many-to-one association to ViasIngreso
	@OneToMany(mappedBy="institucione")
	private List<ViasIngreso> viasIngresos;

	public Institucione() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCodMinSalud() {
		return this.codMinSalud;
	}

	public void setCodMinSalud(String codMinSalud) {
		this.codMinSalud = codMinSalud;
	}

	public String getCodigoActEcono() {
		return this.codigoActEcono;
	}

	public void setCodigoActEcono(String codigoActEcono) {
		this.codigoActEcono = codigoActEcono;
	}

	public String getDescActEcono() {
		return this.descActEcono;
	}

	public void setDescActEcono(String descActEcono) {
		this.descActEcono = descActEcono;
	}

	public Integer getDigitoVerificacion() {
		return this.digitoVerificacion;
	}

	public void setDigitoVerificacion(Integer digitoVerificacion) {
		this.digitoVerificacion = digitoVerificacion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEncabezadoFactura() {
		return this.encabezadoFactura;
	}

	public void setEncabezadoFactura(String encabezadoFactura) {
		this.encabezadoFactura = encabezadoFactura;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getNumeroIdentificacion() {
		return this.numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getPieHisCliImpr() {
		return this.pieHisCliImpr;
	}

	public void setPieHisCliImpr(String pieHisCliImpr) {
		this.pieHisCliImpr = pieHisCliImpr;
	}

	public String getPiepaginaFactura() {
		return this.piepaginaFactura;
	}

	public void setPiepaginaFactura(String piepaginaFactura) {
		this.piepaginaFactura = piepaginaFactura;
	}

	public String getPrefijoFacturacion() {
		return this.prefijoFacturacion;
	}

	public void setPrefijoFacturacion(String prefijoFacturacion) {
		this.prefijoFacturacion = prefijoFacturacion;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public Integer getRgoFinFact() {
		return this.rgoFinFact;
	}

	public void setRgoFinFact(Integer rgoFinFact) {
		this.rgoFinFact = rgoFinFact;
	}

	public Integer getRgoInicFact() {
		return this.rgoInicFact;
	}

	public void setRgoInicFact(Integer rgoInicFact) {
		this.rgoInicFact = rgoInicFact;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoInstitucion() {
		return this.tipoInstitucion;
	}

	public void setTipoInstitucion(String tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}

	public List<CentrosAtencion> getCentrosAtencions() {
		return this.centrosAtencions;
	}

	public void setCentrosAtencions(List<CentrosAtencion> centrosAtencions) {
		this.centrosAtencions = centrosAtencions;
	}

	public CentrosAtencion addCentrosAtencion(CentrosAtencion centrosAtencion) {
		getCentrosAtencions().add(centrosAtencion);
		centrosAtencion.setInstitucione(this);

		return centrosAtencion;
	}

	public CentrosAtencion removeCentrosAtencion(CentrosAtencion centrosAtencion) {
		getCentrosAtencions().remove(centrosAtencion);
		centrosAtencion.setInstitucione(null);

		return centrosAtencion;
	}

	public List<DiasSemana> getDiasSemanas() {
		return this.diasSemanas;
	}

	public void setDiasSemanas(List<DiasSemana> diasSemanas) {
		this.diasSemanas = diasSemanas;
	}

	public DiasSemana addDiasSemana(DiasSemana diasSemana) {
		getDiasSemanas().add(diasSemana);
		diasSemana.setInstitucione(this);

		return diasSemana;
	}

	public DiasSemana removeDiasSemana(DiasSemana diasSemana) {
		getDiasSemanas().remove(diasSemana);
		diasSemana.setInstitucione(null);

		return diasSemana;
	}

	public List<Especialidade> getEspecialidades() {
		return this.especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public Especialidade addEspecialidade(Especialidade especialidade) {
		getEspecialidades().add(especialidade);
		especialidade.setInstitucione(this);

		return especialidade;
	}

	public Especialidade removeEspecialidade(Especialidade especialidade) {
		getEspecialidades().remove(especialidade);
		especialidade.setInstitucione(null);

		return especialidade;
	}

	public List<EstadosCivile> getEstadosCiviles() {
		return this.estadosCiviles;
	}

	public void setEstadosCiviles(List<EstadosCivile> estadosCiviles) {
		this.estadosCiviles = estadosCiviles;
	}

	public EstadosCivile addEstadosCivile(EstadosCivile estadosCivile) {
		getEstadosCiviles().add(estadosCivile);
		estadosCivile.setInstitucione(this);

		return estadosCivile;
	}

	public EstadosCivile removeEstadosCivile(EstadosCivile estadosCivile) {
		getEstadosCiviles().remove(estadosCivile);
		estadosCivile.setInstitucione(null);

		return estadosCivile;
	}

	public List<Funcionalidade> getFuncionalidades() {
		return this.funcionalidades;
	}

	public void setFuncionalidades(List<Funcionalidade> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}

	public Funcionalidade addFuncionalidade(Funcionalidade funcionalidade) {
		getFuncionalidades().add(funcionalidade);
		funcionalidade.setInstitucione(this);

		return funcionalidade;
	}

	public Funcionalidade removeFuncionalidade(Funcionalidade funcionalidade) {
		getFuncionalidades().remove(funcionalidade);
		funcionalidade.setInstitucione(null);

		return funcionalidade;
	}

	public List<GruposServicio> getGruposServicios() {
		return this.gruposServicios;
	}

	public void setGruposServicios(List<GruposServicio> gruposServicios) {
		this.gruposServicios = gruposServicios;
	}

	public GruposServicio addGruposServicio(GruposServicio gruposServicio) {
		getGruposServicios().add(gruposServicio);
		gruposServicio.setInstitucione(this);

		return gruposServicio;
	}

	public GruposServicio removeGruposServicio(GruposServicio gruposServicio) {
		getGruposServicios().remove(gruposServicio);
		gruposServicio.setInstitucione(null);

		return gruposServicio;
	}

	public Ciudade getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudade ciudade) {
		this.ciudade = ciudade;
	}

	public TiposIdentificacion getTiposIdentificacion() {
		return this.tiposIdentificacion;
	}

	public void setTiposIdentificacion(TiposIdentificacion tiposIdentificacion) {
		this.tiposIdentificacion = tiposIdentificacion;
	}

	public List<IntegridadDominio> getIntegridadDominios() {
		return this.integridadDominios;
	}

	public void setIntegridadDominios(List<IntegridadDominio> integridadDominios) {
		this.integridadDominios = integridadDominios;
	}

	public IntegridadDominio addIntegridadDominio(IntegridadDominio integridadDominio) {
		getIntegridadDominios().add(integridadDominio);
		integridadDominio.setInstitucione(this);

		return integridadDominio;
	}

	public IntegridadDominio removeIntegridadDominio(IntegridadDominio integridadDominio) {
		getIntegridadDominios().remove(integridadDominio);
		integridadDominio.setInstitucione(null);

		return integridadDominio;
	}

	public List<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Menu addMenus(Menu menus) {
		getMenus().add(menus);
		menus.setInstitucione(this);

		return menus;
	}

	public Menu removeMenus(Menu menus) {
		getMenus().remove(menus);
		menus.setInstitucione(null);

		return menus;
	}

	public List<MotCierreAperturaIngreso> getMotCierreAperturaIngresos() {
		return this.motCierreAperturaIngresos;
	}

	public void setMotCierreAperturaIngresos(List<MotCierreAperturaIngreso> motCierreAperturaIngresos) {
		this.motCierreAperturaIngresos = motCierreAperturaIngresos;
	}

	public MotCierreAperturaIngreso addMotCierreAperturaIngreso(MotCierreAperturaIngreso motCierreAperturaIngreso) {
		getMotCierreAperturaIngresos().add(motCierreAperturaIngreso);
		motCierreAperturaIngreso.setInstitucione(this);

		return motCierreAperturaIngreso;
	}

	public MotCierreAperturaIngreso removeMotCierreAperturaIngreso(MotCierreAperturaIngreso motCierreAperturaIngreso) {
		getMotCierreAperturaIngresos().remove(motCierreAperturaIngreso);
		motCierreAperturaIngreso.setInstitucione(null);

		return motCierreAperturaIngreso;
	}

	public List<NaturalezasServicio> getNaturalezasServicios() {
		return this.naturalezasServicios;
	}

	public void setNaturalezasServicios(List<NaturalezasServicio> naturalezasServicios) {
		this.naturalezasServicios = naturalezasServicios;
	}

	public NaturalezasServicio addNaturalezasServicio(NaturalezasServicio naturalezasServicio) {
		getNaturalezasServicios().add(naturalezasServicio);
		naturalezasServicio.setInstitucione(this);

		return naturalezasServicio;
	}

	public NaturalezasServicio removeNaturalezasServicio(NaturalezasServicio naturalezasServicio) {
		getNaturalezasServicios().remove(naturalezasServicio);
		naturalezasServicio.setInstitucione(null);

		return naturalezasServicio;
	}

	public List<OcupacionesMedica> getOcupacionesMedicas() {
		return this.ocupacionesMedicas;
	}

	public void setOcupacionesMedicas(List<OcupacionesMedica> ocupacionesMedicas) {
		this.ocupacionesMedicas = ocupacionesMedicas;
	}

	public OcupacionesMedica addOcupacionesMedica(OcupacionesMedica ocupacionesMedica) {
		getOcupacionesMedicas().add(ocupacionesMedica);
		ocupacionesMedica.setInstitucione(this);

		return ocupacionesMedica;
	}

	public OcupacionesMedica removeOcupacionesMedica(OcupacionesMedica ocupacionesMedica) {
		getOcupacionesMedicas().remove(ocupacionesMedica);
		ocupacionesMedica.setInstitucione(null);

		return ocupacionesMedica;
	}

	public List<OcupacionesProfesionale> getOcupacionesProfesionales() {
		return this.ocupacionesProfesionales;
	}

	public void setOcupacionesProfesionales(List<OcupacionesProfesionale> ocupacionesProfesionales) {
		this.ocupacionesProfesionales = ocupacionesProfesionales;
	}

	public OcupacionesProfesionale addOcupacionesProfesionale(OcupacionesProfesionale ocupacionesProfesionale) {
		getOcupacionesProfesionales().add(ocupacionesProfesionale);
		ocupacionesProfesionale.setInstitucione(this);

		return ocupacionesProfesionale;
	}

	public OcupacionesProfesionale removeOcupacionesProfesionale(OcupacionesProfesionale ocupacionesProfesionale) {
		getOcupacionesProfesionales().remove(ocupacionesProfesionale);
		ocupacionesProfesionale.setInstitucione(null);

		return ocupacionesProfesionale;
	}

	public List<Perfile> getPerfiles() {
		return this.perfiles;
	}

	public void setPerfiles(List<Perfile> perfiles) {
		this.perfiles = perfiles;
	}

	public Perfile addPerfile(Perfile perfile) {
		getPerfiles().add(perfile);
		perfile.setInstitucione(this);

		return perfile;
	}

	public Perfile removePerfile(Perfile perfile) {
		getPerfiles().remove(perfile);
		perfile.setInstitucione(null);

		return perfile;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setInstitucione(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setInstitucione(null);

		return persona;
	}

	public List<Sexo> getSexos() {
		return this.sexos;
	}

	public void setSexos(List<Sexo> sexos) {
		this.sexos = sexos;
	}

	public Sexo addSexo(Sexo sexo) {
		getSexos().add(sexo);
		sexo.setInstitucione(this);

		return sexo;
	}

	public Sexo removeSexo(Sexo sexo) {
		getSexos().remove(sexo);
		sexo.setInstitucione(null);

		return sexo;
	}

	public List<TarifariosOficiale> getTarifariosOficiales() {
		return this.tarifariosOficiales;
	}

	public void setTarifariosOficiales(List<TarifariosOficiale> tarifariosOficiales) {
		this.tarifariosOficiales = tarifariosOficiales;
	}

	public TarifariosOficiale addTarifariosOficiale(TarifariosOficiale tarifariosOficiale) {
		getTarifariosOficiales().add(tarifariosOficiale);
		tarifariosOficiale.setInstitucione(this);

		return tarifariosOficiale;
	}

	public TarifariosOficiale removeTarifariosOficiale(TarifariosOficiale tarifariosOficiale) {
		getTarifariosOficiales().remove(tarifariosOficiale);
		tarifariosOficiale.setInstitucione(null);

		return tarifariosOficiale;
	}

	public List<TiposArea> getTiposAreas() {
		return this.tiposAreas;
	}

	public void setTiposAreas(List<TiposArea> tiposAreas) {
		this.tiposAreas = tiposAreas;
	}

	public TiposArea addTiposArea(TiposArea tiposArea) {
		getTiposAreas().add(tiposArea);
		tiposArea.setInstitucione(this);

		return tiposArea;
	}

	public TiposArea removeTiposArea(TiposArea tiposArea) {
		getTiposAreas().remove(tiposArea);
		tiposArea.setInstitucione(null);

		return tiposArea;
	}

	public List<TiposCie> getTiposCies() {
		return this.tiposCies;
	}

	public void setTiposCies(List<TiposCie> tiposCies) {
		this.tiposCies = tiposCies;
	}

	public TiposCie addTiposCy(TiposCie tiposCy) {
		getTiposCies().add(tiposCy);
		tiposCy.setInstitucione(this);

		return tiposCy;
	}

	public TiposCie removeTiposCy(TiposCie tiposCy) {
		getTiposCies().remove(tiposCy);
		tiposCy.setInstitucione(null);

		return tiposCy;
	}

	public List<TiposConsultorio> getTiposConsultorios() {
		return this.tiposConsultorios;
	}

	public void setTiposConsultorios(List<TiposConsultorio> tiposConsultorios) {
		this.tiposConsultorios = tiposConsultorios;
	}

	public TiposConsultorio addTiposConsultorio(TiposConsultorio tiposConsultorio) {
		getTiposConsultorios().add(tiposConsultorio);
		tiposConsultorio.setInstitucione(this);

		return tiposConsultorio;
	}

	public TiposConsultorio removeTiposConsultorio(TiposConsultorio tiposConsultorio) {
		getTiposConsultorios().remove(tiposConsultorio);
		tiposConsultorio.setInstitucione(null);

		return tiposConsultorio;
	}

	public List<TiposServicio> getTiposServicios() {
		return this.tiposServicios;
	}

	public void setTiposServicios(List<TiposServicio> tiposServicios) {
		this.tiposServicios = tiposServicios;
	}

	public TiposServicio addTiposServicio(TiposServicio tiposServicio) {
		getTiposServicios().add(tiposServicio);
		tiposServicio.setInstitucione(this);

		return tiposServicio;
	}

	public TiposServicio removeTiposServicio(TiposServicio tiposServicio) {
		getTiposServicios().remove(tiposServicio);
		tiposServicio.setInstitucione(null);

		return tiposServicio;
	}

	public List<TiposVinculacion> getTiposVinculacions() {
		return this.tiposVinculacions;
	}

	public void setTiposVinculacions(List<TiposVinculacion> tiposVinculacions) {
		this.tiposVinculacions = tiposVinculacions;
	}

	public TiposVinculacion addTiposVinculacion(TiposVinculacion tiposVinculacion) {
		getTiposVinculacions().add(tiposVinculacion);
		tiposVinculacion.setInstitucione(this);

		return tiposVinculacion;
	}

	public TiposVinculacion removeTiposVinculacion(TiposVinculacion tiposVinculacion) {
		getTiposVinculacions().remove(tiposVinculacion);
		tiposVinculacion.setInstitucione(null);

		return tiposVinculacion;
	}

	public List<UnidadesFuncionale> getUnidadesFuncionales() {
		return this.unidadesFuncionales;
	}

	public void setUnidadesFuncionales(List<UnidadesFuncionale> unidadesFuncionales) {
		this.unidadesFuncionales = unidadesFuncionales;
	}

	public UnidadesFuncionale addUnidadesFuncionale(UnidadesFuncionale unidadesFuncionale) {
		getUnidadesFuncionales().add(unidadesFuncionale);
		unidadesFuncionale.setInstitucione(this);

		return unidadesFuncionale;
	}

	public UnidadesFuncionale removeUnidadesFuncionale(UnidadesFuncionale unidadesFuncionale) {
		getUnidadesFuncionales().remove(unidadesFuncionale);
		unidadesFuncionale.setInstitucione(null);

		return unidadesFuncionale;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setInstitucione(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setInstitucione(null);

		return usuario;
	}

	public List<ViasIngreso> getViasIngresos() {
		return this.viasIngresos;
	}

	public void setViasIngresos(List<ViasIngreso> viasIngresos) {
		this.viasIngresos = viasIngresos;
	}

	public ViasIngreso addViasIngreso(ViasIngreso viasIngreso) {
		getViasIngresos().add(viasIngreso);
		viasIngreso.setInstitucione(this);

		return viasIngreso;
	}

	public ViasIngreso removeViasIngreso(ViasIngreso viasIngreso) {
		getViasIngresos().remove(viasIngreso);
		viasIngreso.setInstitucione(null);

		return viasIngreso;
	}

}