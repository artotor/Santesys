package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the menu database table.
 * 
 */
@Entity
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	private String activo;

	private String label;

	private String nombre;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion", insertable=false, updatable=false)
	private Institucione institucione;

	//bi-directional many-to-one association to OpcionesMenu
	@OneToMany(mappedBy="menu")
	private List<OpcionesMenu> opcionesMenus;

	public Menu() {
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

	public Institucione getInstitucione() {
		return this.institucione;
	}

	public void setInstitucione(Institucione institucione) {
		this.institucione = institucione;
	}

	public List<OpcionesMenu> getOpcionesMenus() {
		return this.opcionesMenus;
	}

	public void setOpcionesMenus(List<OpcionesMenu> opcionesMenus) {
		this.opcionesMenus = opcionesMenus;
	}

	public OpcionesMenu addOpcionesMenus(OpcionesMenu opcionesMenus) {
		getOpcionesMenus().add(opcionesMenus);
		opcionesMenus.setMenu(this);

		return opcionesMenus;
	}

	public OpcionesMenu removeOpcionesMenus(OpcionesMenu opcionesMenus) {
		getOpcionesMenus().remove(opcionesMenus);
		opcionesMenus.setMenu(null);

		return opcionesMenus;
	}

}