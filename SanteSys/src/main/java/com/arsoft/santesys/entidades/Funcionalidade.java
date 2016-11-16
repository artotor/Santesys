package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the funcionalidades database table.
 * 
 */
@Entity
@Table(name="funcionalidades")
@NamedQuery(name="Funcionalidade.findAll", query="SELECT f FROM Funcionalidade f")
public class Funcionalidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_funcionalidades", sequenceName="seq_funcionalidades",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_funcionalidades")
	private Integer codigo;

	private String accion;

	private String activo;

	private String descripcion;

	private String label;

	private String nombre;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion")
	@JsonIgnore
	private Institucione institucione;

	//bi-directional many-to-many association to OpcionesMenu
	@ManyToMany(mappedBy="funcionalidades")
	@JsonIgnore
	private List<OpcionesMenu> opcionesMenus;

	//bi-directional many-to-many association to Perfile
	@ManyToMany
	@JoinTable(
		name="funcionalidades_perfiles"
		, joinColumns={
			@JoinColumn(name="codigo_funcionalidad" )
			}
		, inverseJoinColumns={
			@JoinColumn(name="codigo_perfil")
			}
		)
	private List<Perfile> perfiles;

	public Funcionalidade() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
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

	public List<Perfile> getPerfiles() {
		return this.perfiles;
	}

	public void setPerfiles(List<Perfile> perfiles) {
		this.perfiles = perfiles;
	}

}