package com.arsoft.santesys.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
import com.arsoft.santesys.mundo.UtilidadesMundoInterface;

@RestController
public class UtilidadesController 
{

	private static final Logger logger = Logger.getLogger(UtilidadesController.class);
	
	@Autowired
	private UtilidadesMundoInterface utilidadesMundo;
	
	
	
	@RequestMapping(value = "/utilidadesService/listadoTodosPaises", method = RequestMethod.GET)
	public List<Pais> getPaises() {
		
		logger.info("consultado el listado de paises");
		List<Pais> tempo=utilidadesMundo.listadoPaises();
		return tempo;
		/*
		 * Ejemplo retornando el objeto de retorno transaccional que se usará en la funcionalidad.
		 * public ObjetoRetornoDto getPaises() {
				ObjetoRetornoDto objeto=new ObjetoRetornoDto();
				try
				{
					List<Pais> tempo=utilidadesMundo.listadoPaises();
					objeto.setResultadoCorrecto(true);
					objeto.setResultado(tempo);
				}
				catch(Exception e)
				{
					objeto.setResultadoCorrecto(false);
					objeto.setResultado(new ArrayList<>());
					objeto.setMensaje(e.getMessage());
				}
				return objeto;
			}
		 */
	}
	
	
	@RequestMapping(value = "/utilidadesService/listadoTodosDepartamentosXPais", method = RequestMethod.GET)
	public List<Departamento> getDepartamentosXPais(@RequestParam("codigoPais")  Integer codigoPais){
		return utilidadesMundo.listadoDepartamentos(codigoPais);
	}
	
	
	@RequestMapping(value = "/utilidadesService/listadoTodosCiudadesXDepartamentoPais", method = RequestMethod.GET)
	public List<Ciudade> getCiudadesXPaisXDepartamento(@RequestParam("codigoPais")  Integer codigoPais,@RequestParam("codigoDepartamento")  String codigoDepartamento){
		return utilidadesMundo.listadoTodosCiudadesXPaisDepartamento(codigoPais, codigoDepartamento);
	}
	
	
	@RequestMapping(value = "/utilidadesService/ListadoCiudadesXPais", method = RequestMethod.GET)
	public List<Ciudade> getCiudadesXPais(@RequestParam("codigoPais")  Integer codigoPais){
		return utilidadesMundo.listadoCiudadesXPais(codigoPais);
	}
	
	
	@RequestMapping(value = "/utilidadesService/listadoBarriosXCiudad", method = RequestMethod.GET)
	public List<Barrio> getBarriosXCiudad(@RequestParam("codigoPais")  Integer codigoPais,
											@RequestParam("codigoDepartamento")  String codigoDepartamento,
											@RequestParam("codigoCiudad")  String codigoCiudad){
		return utilidadesMundo.listadoBarriosXCiudad(codigoPais,codigoDepartamento,codigoCiudad);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposIdentificacion", method = RequestMethod.GET)
	public List<TiposIdentificacion> getTiposIdentificacion(){
		return utilidadesMundo.listadotiposIdentificacion();
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposAreaInstitucion", method = RequestMethod.GET)
	public List<TiposArea> getTiposAreaInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposAreaInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoEstadosCivilesInstitucion", method = RequestMethod.GET)
	public List<EstadosCivile> getEstadosCivilesInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoEstadosCivilesInstitucion(codigoInstitucion);
	}
	

	@RequestMapping(value = "/utilidadesService/listadoTiposVinculacionInstitucion", method = RequestMethod.GET)
	public List<TiposVinculacion> getTiposVinculacionInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposVinculacionInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposConsultorioInstitucion", method = RequestMethod.GET)
	public List<TiposConsultorio> getTiposTiposConsultorioInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposConsultorioInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoDiasSemanaInstitucion", method = RequestMethod.GET)
	public List<DiasSemana> getDiasSemanaInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoDiasSemanaInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposServicioInstitucion", method = RequestMethod.GET)
	public List<TiposServicio> getTiposServicioInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposServicioInstitucion(codigoInstitucion);
	}

	@RequestMapping(value = "/utilidadesService/listadoSexoInstitucion", method = RequestMethod.GET)
	public List<Sexo> getSexoInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoSexoInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoIntegridadDominioInstitucion", method = RequestMethod.GET)
	public List<IntegridadDominio> getIntegridadDominioInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoIntegridadDominioInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposCieInstitucion", method = RequestMethod.GET)
	public List<TiposCie> getTiposCieInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposCieInstitucion(codigoInstitucion);
	}

	@RequestMapping(value = "/utilidadesService/listadoOcupacionesProfesionalInstitucion", method = RequestMethod.GET)
	public List<OcupacionesProfesionale> getOcupacionesProfesionalInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoOcupacionesProfesionalInstitucion(codigoInstitucion);
	}
}
