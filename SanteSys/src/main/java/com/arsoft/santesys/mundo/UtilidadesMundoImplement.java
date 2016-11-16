package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoBarrio;
import com.arsoft.santesys.dto.administracion.DtoCiudades;
import com.arsoft.santesys.dto.administracion.DtoDepartamentos;
import com.arsoft.santesys.dto.administracion.DtoDiasSemana;
import com.arsoft.santesys.dto.administracion.DtoEstadoCivil;
import com.arsoft.santesys.dto.administracion.DtoIntegridadDominio;
import com.arsoft.santesys.dto.administracion.DtoOcupacionProfesional;
import com.arsoft.santesys.dto.administracion.DtoPaises;
import com.arsoft.santesys.dto.administracion.DtoSexo;
import com.arsoft.santesys.dto.administracion.DtoTipoCie;
import com.arsoft.santesys.dto.administracion.DtoTipoConsultorio;
import com.arsoft.santesys.dto.administracion.DtoTipoIdentificacion;
import com.arsoft.santesys.dto.administracion.DtoTipoServicio;
import com.arsoft.santesys.dto.administracion.DtoTipoVinculacion;
import com.arsoft.santesys.dto.administracion.DtoTiposArea;
import com.arsoft.santesys.entidades.Barrio;
import com.arsoft.santesys.entidades.Ciudade;
import com.arsoft.santesys.entidades.Departamento;
import com.arsoft.santesys.entidades.DiasSemana;
import com.arsoft.santesys.entidades.Especialidade;
import com.arsoft.santesys.entidades.EstadosCivile;
import com.arsoft.santesys.entidades.IntegridadDominio;
import com.arsoft.santesys.entidades.OcupacionesProfesionale;
import com.arsoft.santesys.entidades.Pais;
import com.arsoft.santesys.entidades.Sexo;
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
	public ArrayList<DtoPaises> listadoPaises() 
	{
		ArrayList<DtoPaises> paises=new ArrayList<DtoPaises>();
		PaisRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getPaisRepository();
		Iterator<Pais> it=jpa.findAll().iterator();
		while(it.hasNext())
		{
			paises.add(UtilidadesJPA.cargarPaisEntityToDto((Pais)it.next()));
		}
		return paises;
	}

	/**
	 * 
	 * @param codigoPais
	 * @param codigoDepto
	 * @return
	 */
	@Override
	public ArrayList<DtoDepartamentos> listadoDepartamentos(Integer codigoPais) {
		ArrayList<DtoDepartamentos> departamentos=new ArrayList<DtoDepartamentos>();
		DepartamentoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getDepartamentoRepository();
		Iterator<Departamento> it=jpa.findByPaisCodigo(codigoPais).iterator();
		while(it.hasNext())
		{
			departamentos.add(UtilidadesJPA.cargarDepartamentoEntityToDto(it.next()));
		}
		return departamentos;
	}

	@Override
	public ArrayList<DtoCiudades> listadoTodosCiudadesXPaisDepartamento(Integer codigoPais,String codigoDepartamento) 
	{
		ArrayList<DtoCiudades> ciudades=new ArrayList<DtoCiudades>();
		CiudadeRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCiudadRepository();
		Iterator<Ciudade> it=jpa.findByIdCodigoPaisAndIdCodigoDepartamento(codigoPais, codigoDepartamento).iterator();
		while(it.hasNext())
		{
			ciudades.add(UtilidadesJPA.cargarCiudadEntityToDto(it.next()));
		}
		return ciudades;
	}

	@Override
	public ArrayList<DtoCiudades> listadoCiudadesXPais(Integer codigoPais) {
		ArrayList<DtoCiudades> ciudades=new ArrayList<DtoCiudades>();
		CiudadeRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCiudadRepository();
		Iterator <Ciudade> it=jpa.findByIdCodigoPais(codigoPais).iterator();
		while(it.hasNext())
		{
			ciudades.add(UtilidadesJPA.cargarCiudadEntityToDto(it.next()));
		}
		return ciudades;
	}

	@Override
	public ArrayList<DtoBarrio> listadoBarriosXCiudad(Integer codigoPais, String codigoDepartamento, String codigoCiudad) {
		ArrayList<DtoBarrio> barrios=new ArrayList<DtoBarrio>();
		BarrioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getBarrioRepository();
		Iterator<Barrio> it=jpa.findByidCodigoPaisAndIdCodigoDepartamentoAndIdCodigoCiudad(codigoPais, codigoDepartamento, codigoCiudad).iterator();
		while(it.hasNext())
		{
			barrios.add(UtilidadesJPA.cargarBarrioEntityToDto(it.next()));
		}		
		return barrios;
	}

	@Override
	public ArrayList<DtoTipoIdentificacion> listadotiposIdentificacion() 
	{
		ArrayList<DtoTipoIdentificacion> dto=new ArrayList<DtoTipoIdentificacion>();
		TiposIdentificacionRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposIDRepository();
		Iterator<TiposIdentificacion> it=jpa.findAll().iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarTiposIdentificacionEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoTiposArea> listadoTiposAreaInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoTiposArea> tiposArea=new ArrayList<DtoTiposArea>();
		tiposArea=UtilidadesJPA.cargarListadoTiposAreaEntityToDto((UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposAreaRespository()).findByInstitucioneCodigo(codigoInstitucion));
		return tiposArea;
	}

	@Override
	public ArrayList<DtoEstadoCivil> listadoEstadosCivilesInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoEstadoCivil> dto=new ArrayList<DtoEstadoCivil>();
		Iterator<EstadosCivile> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getEstadosCivilesRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarEstadosCivilesEntityToDto(it.next()));
		}
		return dto;		
	}

	@Override
	public ArrayList<DtoTipoVinculacion> listadoTiposVinculacionInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoTipoVinculacion> dto=new ArrayList<DtoTipoVinculacion>();
		Iterator<TiposVinculacion> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposVinculacionRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarTipoVinculacionEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoTipoConsultorio> listadoTiposConsultorioInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoTipoConsultorio> dto=new ArrayList<DtoTipoConsultorio>();
		Iterator<TiposConsultorio> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposConsultorioRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarTipoConsultorioEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoDiasSemana> listadoDiasSemanaInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoDiasSemana> dto=new ArrayList<DtoDiasSemana>();
		Iterator<DiasSemana> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getDiasSemanaRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarDiasSemanaEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoTipoServicio> listadoTiposServicioInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoTipoServicio> dto=new ArrayList<DtoTipoServicio>();
		Iterator<TiposServicio> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposServicioRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarTipoServicioEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoSexo> listadoSexoInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoSexo> dto=new ArrayList<DtoSexo>();
		Iterator<Sexo> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getSexoRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarSexoEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoIntegridadDominio> listadoIntegridadDominioInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoIntegridadDominio> dto=new ArrayList<DtoIntegridadDominio>();
		Iterator<IntegridadDominio> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getIntegridadDominioRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarIntegridadDominioEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoTipoCie> listadoTiposCieInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoTipoCie> dto=new ArrayList<DtoTipoCie>();
		Iterator<TiposCie> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getTiposCieRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarTipoCieEntityToDto(it.next()));
		}
		return dto;
	}

	@Override
	public ArrayList<DtoOcupacionProfesional> listadoOcupacionesProfesionalInstitucion(Integer codigoInstitucion) {
		ArrayList<DtoOcupacionProfesional> dto=new ArrayList<DtoOcupacionProfesional>();
		Iterator<OcupacionesProfesionale> it=(UtilidadesJPA.obtenerRegistrationBean(appContext).getOcupacionesProfesionalRespository()).findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			dto.add(UtilidadesJPA.cargarOcupacionProfesionalEntityToDto(it.next()));
		}
		return dto;
	}

	
}
