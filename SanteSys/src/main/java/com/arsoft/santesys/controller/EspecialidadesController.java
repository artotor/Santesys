/**
 * 
 */
package com.arsoft.santesys.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arsoft.santesys.dto.administracion.DtoEspecialidades;
import com.arsoft.santesys.mundo.EspecialidadesMundoInterface;

/**
 * @author artotor
 *
 */
@RestController
public class EspecialidadesController {
	
	private static final Logger logger = Logger.getLogger(EspecialidadesController.class);
	
	@Autowired
	private EspecialidadesMundoInterface mundo;
	
	@RequestMapping(value = "especialidadesService/listadoEspecialidades", method = RequestMethod.GET)
	public List<DtoEspecialidades> listadoEspecialidades(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listarEspecialidades(codigoInstitucion);
	}
	
	@RequestMapping(value = "especialidadesService/consultarEspecialidad", method = RequestMethod.GET)
	public DtoEspecialidades consultarEspecialidad(@RequestParam("codigoEspecialidad")  Integer codigoEspecialidad) 
	{
		return mundo.consultarEspecialidad(codigoEspecialidad);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "especialidadesService/modificarInsertarEspecialidad", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoEspecialidades modificarInsertarEspecialidad(@RequestBody DtoEspecialidades dto) {
		return mundo.modificarInsertarEspecialidad(dto);
	}
	 

			
}
