package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the login_usuarios_activos database table.
 * 
 */
@Entity
@Table(name="login_usuarios_activos")
@NamedQuery(name="LoginUsuariosActivo.findAll", query="SELECT l FROM LoginUsuariosActivo l")
public class LoginUsuariosActivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_login")
	private Date fechaLogin;

	@Column(name="hora_login")
	private String horaLogin;

	@Column(name="id_session")
	private String idSession;

	private String login;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="usuario", insertable=false, updatable=false)
	private Usuario usuarioBean;

	public LoginUsuariosActivo() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getFechaLogin() {
		return this.fechaLogin;
	}

	public void setFechaLogin(Date fechaLogin) {
		this.fechaLogin = fechaLogin;
	}

	public String getHoraLogin() {
		return this.horaLogin;
	}

	public void setHoraLogin(String horaLogin) {
		this.horaLogin = horaLogin;
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