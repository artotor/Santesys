package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import javax.annotation.ManagedBean;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.entidades.Barrio;
import com.arsoft.santesys.entidades.Ciudade;
import com.arsoft.santesys.entidades.Departamento;
import com.arsoft.santesys.entidades.DiasSemana;
import com.arsoft.santesys.entidades.EstadosCivile;
import com.arsoft.santesys.entidades.IntegridadDominio;
import com.arsoft.santesys.entidades.OcupacionesProfesionale;
import com.arsoft.santesys.entidades.Pais;
import com.arsoft.santesys.entidades.Sexo;
import com.arsoft.santesys.entidades.TiposArea;
import com.arsoft.santesys.entidades.TiposCie;
import com.arsoft.santesys.entidades.TiposConsultorio;
import com.arsoft.santesys.entidades.TiposIdentificacion;
import com.arsoft.santesys.entidades.TiposServicio;
import com.arsoft.santesys.entidades.TiposVinculacion;
import com.arsoft.santesys.repositorios.BarrioRepositoryInterface;
import com.arsoft.santesys.repositorios.CiudadeRepositoryInterface;
import com.arsoft.santesys.repositorios.DepartamentoRepositoryInterface;
import com.arsoft.santesys.repositorios.PaisRepositoryInterface;
import com.arsoft.santesys.repositorios.TiposIdentificacionRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;




@ManagedBean
public class UtilidadesMundoImplement implements UtilidadesMundoInterface
{
	
	protected static Logger logger = Logger.getLogger("UtilidadesMundoImplement");
	
	@Autowired
	private ApplicationContext appContext;
	
	
	
	/**
	 * 
	 * @param codigoPais
	 * @param codigoDepto
	 * @return
	 */
	public ArrayList<Pais> listadoPaises() 
	{
		ArrayList<Pais> paises=new ArrayList<Pais>();
		PaisRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getPaisRepository();
		paises=jpa.findAll();
		return paises;
	}

	/**
	 * 
	 * @param codigoPais
	 * @param codigoDepto
	 * @return
	 */
	@Override
	public ArrayList<Departamento> listadoDepartamentos(Integer codigoPais) {
		ArrayList<Departamento> departamentos=new ArrayList<Departamento>();
		DepartamentoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getDepartamentoRepository();
		departamentos=jpa.findByPaisCodigo(codigoPais);
		return departamentos;
	}

	@Override
	public ArrayList<Ciudade> listadoTodosCiudadesXPaisDepartamento(Integer codigoPais,String codigoDepartamento) 
	{
		ArrayList<Ciudade> ciudades=new ArrayList<Ciudade>();

		CiudadeRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCiudadRepository();
		ciudades=jpa.findByIdCodigoPaisAndIdCodigoDepartamento(codigoPais, codigoDepartamento);
		return ciudades;
	}

	@Override
	public ArrayList<Ciudade> listadoCiudadesXPais(Integer codigoPais) {
		ArrayList<Ciudade> ciudades=new ArrayList<Ciudade>();

		CiudadeRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCiudadRepository();
		ciudades=jpa.findByIdCodigoPais(codigoPais);
		return ciudades;
	}

	@Override
	public ArrayList<Barrio> listadoBarriosXCiudad(Integer codigoPais, String codigoDepartamento, String codigoCiudad) {
		ArrayList<Barrio> barrios=new ArrayList<Barrio>();
		BarrioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getBarrioRepository();
		barrios=jpa.findByidCodigoPaisAndIdCodigoDepartamentoAndIdCodigoCiudad(codigoPais, codigoDepartamento, codigoCiudad);
		return barrios;
	}

	@Override
	public ArrayList<TiposIdentificacion> listadotiposIdentificacion() 
	{
		ArrayList<TiposIdentificacion> tipoID=new ArrayList<TiposIdentificacion>();
		TiposIdentificacionRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposIDRepository();
		tipoID=jpa.findAll();
		return tipoID;
	}

	@Override
	public ArrayList<TiposArea> listadoTiposAreaInstitucion(Integer codigoInstitucion) {
		ArrayList<TiposArea> tiposArea=new ArrayList<TiposArea>();
		tiposArea=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposAreaRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return tiposArea;
	}

	@Override
	public ArrayList<EstadosCivile> listadoEstadosCivilesInstitucion(Integer codigoInstitucion) {
		ArrayList<EstadosCivile> objeto=new ArrayList<EstadosCivile>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getEstadosCivilesRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<TiposVinculacion> listadoTiposVinculacionInstitucion(Integer codigoInstitucion) {
		ArrayList<TiposVinculacion> objeto=new ArrayList<TiposVinculacion>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposVinculacionRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<TiposConsultorio> listadoTiposConsultorioInstitucion(Integer codigoInstitucion) {
		ArrayList<TiposConsultorio> objeto=new ArrayList<TiposConsultorio>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposConsultorioRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<DiasSemana> listadoDiasSemanaInstitucion(Integer codigoInstitucion) {
		ArrayList<DiasSemana> objeto=new ArrayList<DiasSemana>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getDiasSemanaRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<TiposServicio> listadoTiposServicioInstitucion(Integer codigoInstitucion) {
		ArrayList<TiposServicio> objeto=new ArrayList<TiposServicio>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposServicioRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<Sexo> listadoSexoInstitucion(Integer codigoInstitucion) {
		ArrayList<Sexo> objeto=new ArrayList<Sexo>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getSexoRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<IntegridadDominio> listadoIntegridadDominioInstitucion(Integer codigoInstitucion) {
		ArrayList<IntegridadDominio> objeto=new ArrayList<IntegridadDominio>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getIntegridadDominioRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<TiposCie> listadoTiposCieInstitucion(Integer codigoInstitucion) {
		ArrayList<TiposCie> objeto=new ArrayList<TiposCie>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposCieRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	@Override
	public ArrayList<OcupacionesProfesionale> listadoOcupacionesProfesionalInstitucion(Integer codigoInstitucion) {
		ArrayList<OcupacionesProfesionale> objeto=new ArrayList<OcupacionesProfesionale>();
		objeto=(UtilidadesJPA.obtenerRegistrationBean(appContext).getOcupacionesProfesionalRespository()).findByInstitucioneCodigo(codigoInstitucion);
		return objeto;
	}

	
}
