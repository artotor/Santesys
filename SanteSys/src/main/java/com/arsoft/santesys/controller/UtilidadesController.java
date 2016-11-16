package com.arsoft.santesys.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
import com.arsoft.santesys.mundo.UtilidadesMundoInterface;

@RestController
public class UtilidadesController 
{

	private static final Logger logger = Logger.getLogger(UtilidadesController.class);
	
	@Autowired
	private UtilidadesMundoInterface utilidadesMundo;
	
	
	
	@RequestMapping(value = "/utilidadesService/listadoTodosPaises", method = RequestMethod.GET)
	public ArrayList<DtoPaises> getPaises() {
		
		return utilidadesMundo.listadoPaises();
	}
	
	
	@RequestMapping(value = "/utilidadesService/listadoTodosDepartamentosXPais", method = RequestMethod.GET)
	public ArrayList<DtoDepartamentos> getDepartamentosXPais(@RequestParam("codigoPais")  Integer codigoPais){
		return utilidadesMundo.listadoDepartamentos(codigoPais);
	}
	
	
	@RequestMapping(value = "/utilidadesService/listadoTodosCiudadesXDepartamentoPais", method = RequestMethod.GET)
	public ArrayList<DtoCiudades> getCiudadesXPaisXDepartamento(@RequestParam("codigoPais")  Integer codigoPais,@RequestParam("codigoDepartamento")  String codigoDepartamento){
		return utilidadesMundo.listadoTodosCiudadesXPaisDepartamento(codigoPais, codigoDepartamento);
	}
	
	
	@RequestMapping(value = "/utilidadesService/ListadoCiudadesXPais", method = RequestMethod.GET)
	public ArrayList<DtoCiudades> getCiudadesXPais(@RequestParam("codigoPais")  Integer codigoPais){
		return utilidadesMundo.listadoCiudadesXPais(codigoPais);
	}
	
	
	@RequestMapping(value = "/utilidadesService/listadoBarriosXCiudad", method = RequestMethod.GET)
	public ArrayList<DtoBarrio> getBarriosXCiudad(@RequestParam("codigoPais")  Integer codigoPais,
											@RequestParam("codigoDepartamento")  String codigoDepartamento,
											@RequestParam("codigoCiudad")  String codigoCiudad){
		return utilidadesMundo.listadoBarriosXCiudad(codigoPais,codigoDepartamento,codigoCiudad);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposIdentificacion", method = RequestMethod.GET)
	public ArrayList<DtoTipoIdentificacion> getTiposIdentificacion(){
		return utilidadesMundo.listadotiposIdentificacion();
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposAreaInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoTiposArea> getTiposAreaInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposAreaInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoEstadosCivilesInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoEstadoCivil> getEstadosCivilesInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoEstadosCivilesInstitucion(codigoInstitucion);
	}
	

	@RequestMapping(value = "/utilidadesService/listadoTiposVinculacionInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoTipoVinculacion> getTiposVinculacionInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposVinculacionInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposConsultorioInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoTipoConsultorio> getTiposTiposConsultorioInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposConsultorioInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoDiasSemanaInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoDiasSemana> getDiasSemanaInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoDiasSemanaInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposServicioInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoTipoServicio> getTiposServicioInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposServicioInstitucion(codigoInstitucion);
	}

	@RequestMapping(value = "/utilidadesService/listadoSexoInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoSexo> getSexoInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoSexoInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoIntegridadDominioInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoIntegridadDominio> getIntegridadDominioInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoIntegridadDominioInstitucion(codigoInstitucion);
	}
	
	@RequestMapping(value = "/utilidadesService/listadoTiposCieInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoTipoCie> getTiposCieInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoTiposCieInstitucion(codigoInstitucion);
	}

	@RequestMapping(value = "/utilidadesService/listadoOcupacionesProfesionalInstitucion", method = RequestMethod.GET)
	public ArrayList<DtoOcupacionProfesional> getOcupacionesProfesionalInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return utilidadesMundo.listadoOcupacionesProfesionalInstitucion(codigoInstitucion);
	}
}
