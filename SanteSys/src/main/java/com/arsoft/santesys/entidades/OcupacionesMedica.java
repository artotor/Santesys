package com.arsoft.santesys.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ocupaciones_medicas database table.
 * 
 */
@Entity
@Table(name="ocupaciones_medicas")
@NamedQuery(name="OcupacionesMedica.findAll", query="SELECT o FROM OcupacionesMedica o")
public class OcupacionesMedica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_ocupacion_med", sequenceName="seq_ocupacion_med",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_ocupacion_med")
	private Integer codigo;

	private String nombre;

	//bi-directional many-to-one association to Institucione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="institucion")
	private Institucione institucione;

	//bi-directional many-to-one association to ProfesionalesSalud
	@OneToMany(mappedBy="ocupacionesMedica")
	private List<ProfesionalesSalud> profesionalesSaluds;

	public OcupacionesMedica() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public List<ProfesionalesSalud> getProfesionalesSaluds() {
		return this.profesionalesSaluds;
	}

	public void setProfesionalesSaluds(List<ProfesionalesSalud> profesionalesSaluds) {
		this.profesionalesSaluds = profesionalesSaluds;
	}

	public ProfesionalesSalud addProfesionalesSalud(ProfesionalesSalud profesionalesSalud) {
		getProfesionalesSaluds().add(profesionalesSalud);
		profesionalesSalud.setOcupacionesMedica(this);

		return profesionalesSalud;
	}

	public ProfesionalesSalud removeProfesionalesSalud(ProfesionalesSalud profesionalesSalud) {
		getProfesionalesSaluds().remove(profesionalesSalud);
		profesionalesSalud.setOcupacionesMedica(null);

		return profesionalesSalud;
	}

}