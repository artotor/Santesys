package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String activo;

	private String login;

	private String password;

	//bi-directional many-to-one association to LoginUsuario
	@OneToMany(mappedBy="usuarioBean")
	private List<LoginUsuario> loginUsuarios;

	//bi-directional many-to-one association to LoginUsuariosActivo
	@OneToMany(mappedBy="usuarioBean")
	private List<LoginUsuariosActivo> loginUsuariosActivos;

	//bi-directional many-to-many association to Perfile
	@ManyToMany(mappedBy="usuarios")
	private List<Perfile> perfiles;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	private Institucione institucione;

	//bi-directional one-to-one association to Persona
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codigo", insertable=false, updatable=false)
	private Persona persona;

	//bi-directional many-to-many association to CentrosCosto
	@ManyToMany
	@JoinTable(
		name="usuarios_centros_costo"
		, joinColumns={
			@JoinColumn(name="usuario", insertable=false, updatable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="centro_costo", insertable=false, updatable=false)
			}
		)
	private List<CentrosCosto> centrosCostos;

	public Usuario() {
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

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<LoginUsuario> getLoginUsuarios() {
		return this.loginUsuarios;
	}

	public void setLoginUsuarios(List<LoginUsuario> loginUsuarios) {
		this.loginUsuarios = loginUsuarios;
	}

	public LoginUsuario addLoginUsuario(LoginUsuario loginUsuario) {
		getLoginUsuarios().add(loginUsuario);
		loginUsuario.setUsuarioBean(this);

		return loginUsuario;
	}

	public LoginUsuario removeLoginUsuario(LoginUsuario loginUsuario) {
		getLoginUsuarios().remove(loginUsuario);
		loginUsuario.setUsuarioBean(null);

		return loginUsuario;
	}

	public List<LoginUsuariosActivo> getLoginUsuariosActivos() {
		return this.loginUsuariosActivos;
	}

	public void setLoginUsuariosActivos(List<LoginUsuariosActivo> loginUsuariosActivos) {
		this.loginUsuariosActivos = loginUsuariosActivos;
	}

	public LoginUsuariosActivo addLoginUsuariosActivo(LoginUsuariosActivo loginUsuariosActivo) {
		getLoginUsuariosActivos().add(loginUsuariosActivo);
		loginUsuariosActivo.setUsuarioBean(this);

		return loginUsuariosActivo;
	}

	public LoginUsuariosActivo removeLoginUsuariosActivo(LoginUsuariosActivo loginUsuariosActivo) {
		getLoginUsuariosActivos().remove(loginUsuariosActivo);
		loginUsuariosActivo.setUsuarioBean(null);

		return loginUsuariosActivo;
	}

	public List<Perfile> getPerfiles() {
		return this.perfiles;
	}

	public void setPerfiles(List<Perfile> perfiles) {
		this.perfiles = perfiles;
	}

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<CentrosCosto> getCentrosCostos() {
		return this.centrosCostos;
	}

	public void setCentrosCostos(List<CentrosCosto> centrosCostos) {
		this.centrosCostos = centrosCostos;
	}

}