package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the opciones_menu database table.
 * 
 */
@Entity
@Table(name="opciones_menu")
@NamedQuery(name="OpcionesMenu.findAll", query="SELECT o FROM OpcionesMenu o")
public class OpcionesMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String activo;

	private String label;

	private String nombre;

	private String visible;

	//bi-directional many-to-many association to Funcionalidade
	@ManyToMany
	@JoinTable(
		name="funcionalidades_menu"
		, joinColumns={
			@JoinColumn(name="opcion_menu")
			}
		, inverseJoinColumns={
			@JoinColumn(name="funcionalidad")
			}
		)
	private List<Funcionalidade> funcionalidades;

	//bi-directional many-to-one association to Menu
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="menu_padre")
	private Menu menu;

	public OpcionesMenu() {
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

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVisible() {
		return this.visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public List<Funcionalidade> getFuncionalidades() {
		return this.funcionalidades;
	}

	public void setFuncionalidades(List<Funcionalidade> funcionalidades) {
		this.funcionalidades = funcionalidades;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}