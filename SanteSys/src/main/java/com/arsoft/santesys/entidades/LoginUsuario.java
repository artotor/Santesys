package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the login_usuarios database table.
 * 
 */
@Entity
@Table(name="login_usuarios")
@NamedQuery(name="LoginUsuario.findAll", query="SELECT l FROM LoginUsuario l")
public class LoginUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String activo;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_login")
	private Date fechaLogin;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_logout")
	private Date fechaLogout;

	@Column(name="hora_login")
	private String horaLogin;

	@Column(name="hora_logout")
	private String horaLogout;

	@Column(name="id_session")
	private String idSession;

	private String login;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="usuario", insertable=false, updatable=false)
	private Usuario usuarioBean;

	public LoginUsuario() {
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

	public Date getFechaLogin() {
		return this.fechaLogin;
	}

	public void setFechaLogin(Date fechaLogin) {
		this.fechaLogin = fechaLogin;
	}

	public Date getFechaLogout() {
		return this.fechaLogout;
	}

	public void setFechaLogout(Date fechaLogout) {
		this.fechaLogout = fechaLogout;
	}

	public String getHoraLogin() {
		return this.horaLogin;
	}

	public void setHoraLogin(String horaLogin) {
		this.horaLogin = horaLogin;
	}

	public String getHoraLogout() {
		return this.horaLogout;
	}

	public void setHoraLogout(String horaLogout) {
		this.horaLogout = horaLogout;
	}

	public String getIdSession() {
		return this.idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

}