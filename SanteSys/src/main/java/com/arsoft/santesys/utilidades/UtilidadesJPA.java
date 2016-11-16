package com.arsoft.santesys.utilidades;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.bean.RegistrationBean;
import com.arsoft.santesys.dto.administracion.DtoBarrio;
import com.arsoft.santesys.dto.administracion.DtoCentroAtencion;
import com.arsoft.santesys.dto.administracion.DtoCentroCosto;
import com.arsoft.santesys.dto.administracion.DtoCiudades;
import com.arsoft.santesys.dto.administracion.DtoConsultorios;
import com.arsoft.santesys.dto.administracion.DtoDepartamentos;
import com.arsoft.santesys.dto.administracion.DtoDiasSemana;
import com.arsoft.santesys.dto.administracion.DtoEspecialidades;
import com.arsoft.santesys.dto.administracion.DtoEstadoCivil;
import com.arsoft.santesys.dto.administracion.DtoExcecionesAgenda;
import com.arsoft.santesys.dto.administracion.DtoFuncionalidades;
import com.arsoft.santesys.dto.administracion.DtoGruposServicios;
import com.arsoft.santesys.dto.administracion.DtoInstituciones;
import com.arsoft.santesys.dto.administracion.DtoIntegridadDominio;
import com.arsoft.santesys.dto.administracion.DtoMotivosCierreAperturaIngresos;
import com.arsoft.santesys.dto.administracion.DtoNaturalezaServicio;
import com.arsoft.santesys.dto.administracion.DtoOcupacionProfesional;
import com.arsoft.santesys.dto.administracion.DtoOcupacionesMedicas;
import com.arsoft.santesys.dto.administracion.DtoPaises;
import com.arsoft.santesys.dto.administracion.DtoSexo;
import com.arsoft.santesys.dto.administracion.DtoTarifariosOficiales;
import com.arsoft.santesys.dto.administracion.DtoTipoCie;
import com.arsoft.santesys.dto.administracion.DtoTipoConsultorio;
import com.arsoft.santesys.dto.administracion.DtoTipoIdentificacion;
import com.arsoft.santesys.dto.administracion.DtoTipoServicio;
import com.arsoft.santesys.dto.administracion.DtoTipoVinculacion;
import com.arsoft.santesys.dto.administracion.DtoTiposArea;
import com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales;
import com.arsoft.santesys.dto.administracion.DtoViasIngreso;
import com.arsoft.santesys.entidades.Barrio;
import com.arsoft.santesys.entidades.CentrosAtencion;
import com.arsoft.santesys.entidades.CentrosCosto;
import com.arsoft.santesys.entidades.Ciudade;
import com.arsoft.santesys.entidades.CiudadePK;
import com.arsoft.santesys.entidades.Consultorio;
import com.arsoft.santesys.entidades.Departamento;
import com.arsoft.santesys.entidades.DiasSemana;
import com.arsoft.santesys.entidades.Especialidade;
import com.arsoft.santesys.entidades.EstadosCivile;
import com.arsoft.santesys.entidades.ExcepcionesAgenda;
import com.arsoft.santesys.entidades.Funcionalidade;
import com.arsoft.santesys.entidades.GruposServicio;
import com.arsoft.santesys.entidades.Institucione;
import com.arsoft.santesys.entidades.IntegridadDominio;
import com.arsoft.santesys.entidades.MotCierreAperturaIngreso;
import com.arsoft.santesys.entidades.NaturalezasServicio;
import com.arsoft.santesys.entidades.OcupacionesMedica;
import com.arsoft.santesys.entidades.OcupacionesProfesionale;
import com.arsoft.santesys.entidades.Pais;
import com.arsoft.santesys.entidades.Sexo;
import com.arsoft.santesys.entidades.TarifariosOficiale;
import com.arsoft.santesys.entidades.TiposArea;
import com.arsoft.santesys.entidades.TiposCie;
import com.arsoft.santesys.entidades.TiposConsultorio;
import com.arsoft.santesys.entidades.TiposIdentificacion;
import com.arsoft.santesys.entidades.TiposServicio;
import com.arsoft.santesys.entidades.TiposVinculacion;
import com.arsoft.santesys.entidades.UnidadesFuncionale;
import com.arsoft.santesys.entidades.ViasIngreso;




public class UtilidadesJPA 
{
	
	/**
	 * Metodo que retorna la clase RegistrationBean
	 * @param appContext
	 * @return
	 */
	public static RegistrationBean obtenerRegistrationBean(ApplicationContext appContext)
	{
		return (RegistrationBean) appContext.getBean("registrationBean");
	}
	
	/**
	 * 
	 * @param entity
	 * @return
	 */
	public static DtoInstituciones cargarInstEntEntityToDto(Institucione entity)
	{
		DtoInstituciones dto=new DtoInstituciones();
		if(entity!=null)
		{
			dto.setCodigo(entity.getCodigo());
			dto.setTipoIdentificacion(entity.getTiposIdentificacion().getAcronimo());
			dto.setNumeroIdentificacion(entity.getNumeroIdentificacion());
			dto.setRazonSocial(entity.getRazonSocial());
			dto.setTipoInstitucion(entity.getTipoInstitucion());
			dto.setCiudad(cargarCiudadEntityToDto(entity.getCiudade()));
			dto.setTelefono(entity.getTelefono());
			dto.setDireccion(entity.getDireccion());
			dto.setCodigoActEcono(entity.getCodigoActEcono());
			dto.setCodMinSalud(entity.getCodMinSalud());
			dto.setDigitoVerificacion(entity.getDigitoVerificacion());
			dto.setResolucion(entity.getResolucion());
			dto.setPrefijoFacturacion(entity.getPrefijoFacturacion());
			dto.setRgoFinFact(entity.getRgoFinFact());
			dto.setRgoInicFact(entity.getRgoInicFact());
			dto.setEncabezadoFactura(entity.getEncabezadoFactura());
			dto.setPiepaginaFactura(entity.getPiepaginaFactura());
			dto.setLogo(entity.getLogo());
			dto.setPieHisCliImpr(entity.getPieHisCliImpr());
		}
		return dto;
	}
	
	
	/**
	 * 
	 * @param entity
	 * @return
	 */
	public static Institucione cargarInstDtoToEntity(DtoInstituciones dto)
	{
		Institucione e=new Institucione();
		e.setCodigo(dto.getCodigo());
		TiposIdentificacion tipoID=new TiposIdentificacion();
		tipoID.setAcronimo(dto.getTipoIdentificacion());
		e.setTiposIdentificacion(tipoID);
		e.setNumeroIdentificacion(dto.getNumeroIdentificacion());
		e.setRazonSocial(dto.getRazonSocial());
		e.setTipoInstitucion(dto.getTipoInstitucion());
		e.setCiudade(cargarCiudadDtoToEntity(dto.getCiudad()));
		e.setTelefono(dto.getTelefono());
		e.setDireccion(dto.getDireccion());
		e.setCodigoActEcono(dto.getCodigoActEcono());
		e.setCodMinSalud(dto.getCodMinSalud());
		e.setDigitoVerificacion(dto.getDigitoVerificacion());
		e.setResolucion(dto.getResolucion());
		e.setPrefijoFacturacion(dto.getPrefijoFacturacion());
		e.setRgoFinFact(dto.getRgoFinFact());
		e.setRgoInicFact(dto.getRgoInicFact());
		e.setEncabezadoFactura(dto.getEncabezadoFactura());
		e.setPiepaginaFactura(dto.getPiepaginaFactura());
		e.setLogo(dto.getLogo());
		e.setPieHisCliImpr(dto.getPieHisCliImpr());
		return e;
	}

	/**
	 * 
	 * @param ciudad
	 * @return
	 */
	private static Ciudade cargarCiudadDtoToEntity(DtoCiudades ciudad) 
	{
		Ciudade e=new Ciudade();
		CiudadePK ePK=new CiudadePK();
		ePK.setCodigoCiudad(ciudad.getCodigo());
		ePK.setCodigoDepartamento(ciudad.getDepartamento().getCodigo());
		ePK.setCodigoPais(ciudad.getDepartamento().getPais().getCodigo());
		e.setId(ePK);
		e.setDescripcion(ciudad.getDescripcion());
		return e;
	}
	
	
	

	/**
	 * 
	 * @param e
	 * @return
	 */
	public static DtoCiudades cargarCiudadEntityToDto(Ciudade e) 
	{
		DtoCiudades ciudad=new DtoCiudades();
		if(e!=null)
		{
			ciudad.setCodigo(e.getId().getCodigoCiudad());
			ciudad.setDescripcion(e.getDescripcion());
			ciudad.setDepartamento(cargarDepartamentoEntityToDto(e.getDepartamento()));
		}
		return ciudad;
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public static DtoCiudades cargarCiudadEntityToDtoBasico(Ciudade e) 
	{
		if(e!=null)
		{
			DtoCiudades ciudad=new DtoCiudades(e.getId().getCodigoCiudad(),e.getId().getCodigoDepartamento(),e.getId().getCodigoPais());
			return ciudad;
		}
		return new DtoCiudades();
	}
	
	/**
	 * 
	 * @param departamento
	 * @return
	 */
	public static DtoDepartamentos cargarDepartamentoEntityToDto(Departamento d) 
	{
		DtoDepartamentos departamento=new DtoDepartamentos();
		if(d!=null)
		{
			departamento.setCodigo(d.getId().getCodigoDepartamento());
			departamento.setDescripcion(d.getDescripcion());
			departamento.setPais(cargarPaisEntityToDto(d.getPais()));
		}
		return departamento;
	}

	/**
	 * 
	 * @param pais
	 * @return
	 */
	public static DtoPaises cargarPaisEntityToDto(Pais p) 
	{
		DtoPaises pais=new DtoPaises();
		if(p!=null)
		{
			pais.setCodigo(p.getCodigo());
			pais.setDescripcion(p.getDescripcion());
		}
		return pais;
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public static DtoUnidadesFuncionales cargarUnidadFuncionalEntityToDto(UnidadesFuncionale e) 
	{
		DtoUnidadesFuncionales dto=new DtoUnidadesFuncionales();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setActivo(e.getActivo());
			dto.setAcronimo(e.getAcronimo());
			dto.setDescripcion(e.getDescripcion());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
		}
		return dto;
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 */
	public static UnidadesFuncionale cargarUnidadFuncionalDtoToEntity(DtoUnidadesFuncionales dto)
	{
		UnidadesFuncionale e=new UnidadesFuncionale();
		e.setAcronimo(dto.getAcronimo());
		e.setActivo(dto.getActivo());
		e.setDescripcion(dto.getDescripcion());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}
	

	public static DtoEspecialidades cargarEspecialidadEntityToDto(Especialidade e) 
	{

		DtoEspecialidades dto=new DtoEspecialidades();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setActivo(e.getActivo());
			dto.setNombre(e.getNombre());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
		}
		return dto;
	}

	
	/**
	 * 
	 * @param dto
	 * @return
	 */
	public static Especialidade cargarEspecialidadDtoToEntity(DtoEspecialidades dto)
	{
		Especialidade e=new Especialidade();
		e.setActivo(dto.getActivo());
		e.setNombre(dto.getNombre());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}
	


	/**
	 * 
	 * @param e
	 * @return
	 */
	public static DtoCentroAtencion cargarCentroAtencionEntityToDto(CentrosAtencion e) 
	{
		DtoCentroAtencion dto=new DtoCentroAtencion();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setActivo(e.getActivo());
			dto.setCodigoCentro(e.getCodigoCentro());
			dto.setDescripcion(e.getDescripcion());
			dto.setDireccion(e.getDireccion());
			dto.setTelefono(e.getTelefono());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setCiudad(cargarCiudadEntityToDtoBasico(e.getCiudade()));
		}
		return dto;
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 */
	public static CentrosAtencion cargarCentroAtencionDtoToEntity(DtoCentroAtencion dto)
	{
		CentrosAtencion e=new CentrosAtencion();
		e.setActivo(dto.getActivo());
		e.setCodigoCentro(dto.getCodigoCentro());
		e.setDescripcion(dto.getDescripcion());
		e.setDireccion(dto.getDireccion());
		e.setTelefono(dto.getTelefono());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		e.setCiudade(cargarCiudadDtoToEntity(dto.getCiudad()));
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}


	/**
	 * 
	 * @param e
	 * @return
	 */
	public static DtoExcecionesAgenda cargarExcecionAgendaEntityToDto(ExcepcionesAgenda e) 
	{
		DtoExcecionesAgenda dto=new DtoExcecionesAgenda();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setActivo(e.getActivo());
			dto.setDescripcion(e.getDescripcion());
			dto.setFecha(e.getFecha());
			dto.setCentroAtencion(cargarCentroAtencionEntityToDto(e.getCentrosAtencion()));			
		}
		return dto;
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 */
	public static ExcepcionesAgenda cargarExcecionAgendaDtoToEntity(DtoExcecionesAgenda dto)
	{
		ExcepcionesAgenda e=new ExcepcionesAgenda();
		e.setActivo(dto.getActivo());
		e.setCentrosAtencion(cargarCentroAtencionDtoToEntity(dto.getCentroAtencion()));
		e.setDescripcion(dto.getDescripcion());
		e.setFecha(dto.getFecha());
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}


	/**
	 * 
	 * @param e
	 * @return
	 */
	public static DtoCentroCosto cargarCentrosCostoEntityToDto(CentrosCosto e) 
	{
		DtoCentroCosto dto=new DtoCentroCosto();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setActivo(e.getActivo());
			dto.setCentrosAtencion(cargarCentroAtencionEntityToDto(e.getCentrosAtencion()));			
			dto.setManejoCamas(e.getManejoCamas());
			dto.setNombre(e.getNombre());
			dto.setTiposArea(cargarTiposAreaEntityToDto(e.getTiposArea()));
			dto.setUnidadesFuncionale(cargarUnidadFuncionalEntityToDto(e.getUnidadesFuncionale()));
		}
		return dto;
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 */
	public static CentrosCosto cargarCentrosCostoDtoToEntity(DtoCentroCosto dto)
	{
		CentrosCosto e=new CentrosCosto();
		e.setActivo(dto.getActivo());
		e.setCentrosAtencion(cargarCentroAtencionDtoToEntity(dto.getCentrosAtencion()));
		e.setNombre(dto.getNombre());
		e.setManejoCamas(dto.getManejoCamas());
		e.setTiposArea(cargarTiposAreaDtoToEntity(dto.getTiposArea()));
		e.setUnidadesFuncionale(cargarUnidadFuncionalDtoToEntity(dto.getUnidadesFuncionale()));
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}
	
	/**
	 * 
	 * @param findByInstitucioneCodigo
	 * @return
	 */
	public static TiposArea cargarTiposAreaDtoToEntity(DtoTiposArea dto) 
	{
		TiposArea e=new TiposArea();
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		e.setNombre(dto.getNombre());
		return e;
	}

	/**
	 * 
	 * @param findByInstitucioneCodigo
	 * @return
	 */
	public static DtoTiposArea cargarTiposAreaEntityToDto(TiposArea e) 
	{
		DtoTiposArea dto=new DtoTiposArea();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setNombre(e.getNombre());
		}
		return dto;
	}

	public static ArrayList<DtoTiposArea> cargarListadoTiposAreaEntityToDto(
			List<TiposArea> eList) 
	{
		ArrayList<DtoTiposArea> listado=new ArrayList<DtoTiposArea>();
		Iterator<TiposArea> it=eList.iterator();
		while(it.hasNext())
		{
			listado.add(cargarTiposAreaEntityToDto(it.next()));
		}
		return listado;
	}

	public static DtoBarrio cargarBarrioEntityToDto(Barrio e) 
	{
		DtoBarrio dto=new DtoBarrio();
		if(e!=null)
		{
			dto.setCodigoBarrio(e.getId().getCodigoBarrio());
			dto.setDescripcionBarrio(e.getDescripcionBarrio());
			dto.setCiudad(new DtoCiudades(e.getId().getCodigoCiudad(),e.getId().getCodigoDepartamento(),e.getId().getCodigoPais()));
		}
		return dto;
	}

	public static DtoTipoIdentificacion cargarTiposIdentificacionEntityToDto(TiposIdentificacion e) 
	{
		DtoTipoIdentificacion dto=new DtoTipoIdentificacion();
		if(e!=null)
		{
			dto.setAcronimo(e.getAcronimo());
			dto.setDescripcion(e.getNombre());
		}
		return dto;
	}

	public static DtoEstadoCivil cargarEstadosCivilesEntityToDto(EstadosCivile e) 
	{
		DtoEstadoCivil dto=new DtoEstadoCivil();
		if(e!=null)
		{
			dto.setAcronimo(e.getAcronimo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getNombre());
		}
		return dto;
	}

	
	public static DtoTipoVinculacion cargarTipoVinculacionEntityToDto(TiposVinculacion e) 
	{
		DtoTipoVinculacion dto=new DtoTipoVinculacion();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getNombre());
		}
		return dto;
	}

	
	public static DtoTipoConsultorio cargarTipoConsultorioEntityToDto(TiposConsultorio e) 
	{
		DtoTipoConsultorio dto=new DtoTipoConsultorio();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getNombre());
		}
		return dto;
	}
	public static TiposConsultorio cargarTipoConsultorioEntityToDto(DtoTipoConsultorio dto) 
	{
		TiposConsultorio e=new TiposConsultorio();
		e.setCodigo(dto.getCodigo());
		e.setNombre(dto.getDescripcion());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		
		return e;
	}

	public static DtoDiasSemana cargarDiasSemanaEntityToDto(DiasSemana e) 
	{
		DtoDiasSemana dto=new DtoDiasSemana();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
		}
		return dto;

	}

	public static DtoTipoServicio cargarTipoServicioEntityToDto(TiposServicio e) 
	{
		DtoTipoServicio dto=new DtoTipoServicio();
		if(e!=null)
		{
			dto.setAcronimo(e.getAcronimo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
			dto.setNombre(e.getNombre());
		}
		return dto;
	}

	public static DtoSexo cargarSexoEntityToDto(Sexo e) 
	{
		DtoSexo dto=new DtoSexo();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getNombre());
		}
		return dto;
	}

	public static DtoIntegridadDominio cargarIntegridadDominioEntityToDto(IntegridadDominio e) 
	{
		DtoIntegridadDominio dto=new DtoIntegridadDominio();
		if(e!=null)
		{
			dto.setAcronimo(e.getAcronimo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
		}
		return dto;
	}

	public static DtoTipoCie cargarTipoCieEntityToDto(TiposCie e) 
	{
		DtoTipoCie dto=new DtoTipoCie();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setCodigoReal(e.getCodigoReal());
			dto.setInicioVigencia(e.getInicioVigencia());
		}
		return dto;
	}

	public static DtoOcupacionProfesional cargarOcupacionProfesionalEntityToDto(OcupacionesProfesionale e) 
	{
		DtoOcupacionProfesional dto=new DtoOcupacionProfesional();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
		}
		return dto;
	}

	public static DtoConsultorios cargarConsultoriosEntityToDto(Consultorio e) 
	{
		DtoConsultorios dto=new DtoConsultorios();
		if(e!=null)
		{
			dto.setActivo(e.getActivo());
			dto.setCodigo(e.getCodigo());
			dto.setCodigoConsultorio(e.getCodigoConsultorio());
			dto.setCentroAtencion(cargarCentroAtencionEntityToDto(e.getCentrosAtencion()));
			dto.setTipoConsultorio(cargarTipoConsultorioEntityToDto(e.getTiposConsultorio()));
			dto.setDescripcion(e.getDescripcion());
		}
		return dto;
	}

	public static Consultorio cargarConsultorioDtoToEntity(DtoConsultorios dto) 
	{
		
		Consultorio e=new Consultorio();
		e.setActivo(dto.getActivo());
		e.setCentrosAtencion(cargarCentroAtencionDtoToEntity(dto.getCentroAtencion()));
		e.setCodigoConsultorio(dto.getCodigoConsultorio());
		e.setDescripcion(dto.getDescripcion());
		e.setTiposConsultorio(cargarTipoConsultorioEntityToDto(dto.getTipoConsultorio()));
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}

	public static DtoGruposServicios cargarGruposServicioEntityToDto(GruposServicio e) 
	{
		DtoGruposServicios dto=new DtoGruposServicios();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setAcronimo(e.getAcronimo());
			dto.setActivo(e.getActivo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
		}
		return dto;
	}

	public static GruposServicio cargarGruposServicioDtoToEntity(DtoGruposServicios dto) 
	{
		GruposServicio e=new GruposServicio();
		e.setActivo(dto.getActivo());
		e.setDescripcion(dto.getDescripcion());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		e.setAcronimo(dto.getAcronimo());
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}

	public static DtoMotivosCierreAperturaIngresos cargarMotivoCierreAperturaIngresoEntityToDto(
			MotCierreAperturaIngreso e) {
		
		DtoMotivosCierreAperturaIngresos dto=new DtoMotivosCierreAperturaIngresos();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setActivo(e.getActivo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
			dto.setTipo(e.getTipo());
		}
		return dto;
	}

	public static MotCierreAperturaIngreso cargarMotivoCierreAperturaIngresoDtoToEntity(
			DtoMotivosCierreAperturaIngresos dto) {
		MotCierreAperturaIngreso e=new MotCierreAperturaIngreso();
		e.setActivo(dto.getActivo());
		e.setDescripcion(dto.getDescripcion());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		e.setTipo(dto.getTipo());
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}

	public static DtoNaturalezaServicio cargarNaturalezasServicioEntityToDto(NaturalezasServicio e) {
		DtoNaturalezaServicio dto=new DtoNaturalezaServicio();
		if(e!=null)
		{
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
			dto.setAcronimo(e.getAcronimo());
		}
		return dto;
	}

	public static NaturalezasServicio cargarNaturalezasServicioDtoToEntity(DtoNaturalezaServicio dto) {
		NaturalezasServicio e=new NaturalezasServicio();
		e.setDescripcion(dto.getDescripcion());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		e.setAcronimo(dto.getAcronimo());
		return e;
	}

	public static DtoOcupacionesMedicas cargarOcupacionesMedicasEntityToDto(OcupacionesMedica e) {
		DtoOcupacionesMedicas dto=new DtoOcupacionesMedicas();
		if(e!=null)
		{
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setNombre(e.getNombre());
			dto.setCodigo(e.getCodigo());
		}
		return dto;
	}

	public static OcupacionesMedica cargarOcupacionesMedicasDtoToEntity(DtoOcupacionesMedicas dto) 
	{
		OcupacionesMedica e=new OcupacionesMedica();
		e.setNombre(dto.getNombre());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}

	public static DtoTarifariosOficiales cargarTarifariosOficialesEntityToDto(TarifariosOficiale e) 
	{
		DtoTarifariosOficiales dto=new DtoTarifariosOficiales();
		if(e!=null)
		{
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setNombre(e.getNombre());
			dto.setCodigo(e.getCodigo());
			dto.setActivo(e.getActivo());
			dto.setEsTarifario(e.getEsTarifario());
		}
		return dto;
	}

	public static TarifariosOficiale cargarTarifariosOficialesDtoToEntity(DtoTarifariosOficiales dto) 
	{
		TarifariosOficiale e=new TarifariosOficiale();
		e.setNombre(dto.getNombre());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		e.setActivo(dto.getActivo());
		e.setEsTarifario(dto.getEsTarifario());
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}

	public static DtoViasIngreso cargarViasIngresoEntityToDto(ViasIngreso e) 
	{
		DtoViasIngreso dto=new DtoViasIngreso();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setIdentificador(e.getIdentificador());
			dto.setNombre(e.getNombre());
			dto.setReqRespPaciente(e.getReqRespPaciente());
			dto.setViaIngresoFija(e.getVianIngresoFija());
		}
		return dto;
	}

	public static ViasIngreso cargarViasIngresoDtoToEntity(DtoViasIngreso dto) 
	{
		ViasIngreso e=new ViasIngreso();
		e.setNombre(dto.getNombre());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		e.setIdentificador(dto.getIdentificador());
		e.setReqRespPaciente(dto.getReqRespPaciente());
		e.setVianIngresoFija(dto.getViaIngresoFija());
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}
	
	public static DtoFuncionalidades cargarFuncionalidadEntityToDto(Funcionalidade e) 
	{
		DtoFuncionalidades dto=new DtoFuncionalidades();
		if(e!=null)
		{
			dto.setCodigo(e.getCodigo());
			dto.setAccion(e.getAccion());
			dto.setActivo(e.getActivo());
			dto.setCodigoInstitucion(e.getInstitucione().getCodigo());
			dto.setDescripcion(e.getDescripcion());
			dto.setLabel(e.getLabel());
			dto.setNombre(e.getNombre());
		}
		return dto;
	}

	public static Funcionalidade cargarFuncionalidadDtoToEntity(DtoFuncionalidades dto) 
	{
		Funcionalidade e=new Funcionalidade();
		e.setAccion(dto.getAccion());
		e.setActivo(dto.getActivo());
		e.setDescripcion(dto.getDescripcion());
		e.setLabel(dto.getLabel());
		e.setNombre(dto.getNombre());
		Institucione eIns=new Institucione();
		eIns.setCodigo(dto.getCodigoInstitucion());
		e.setInstitucione(eIns);
		if(dto.getCodigo()>0)
			e.setCodigo(dto.getCodigo());
		return e;
	}


	
}
