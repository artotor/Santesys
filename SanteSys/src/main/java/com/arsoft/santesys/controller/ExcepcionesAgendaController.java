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

import com.arsoft.santesys.dto.administracion.DtoExcecionesAgenda;
import com.arsoft.santesys.mundo.ExcepcionesAgendaMundoInterface;




/**
 * @author artotor
 *
 */
@RestController
public class ExcepcionesAgendaController {
	
	private static final Logger logger = Logger.getLogger(ExcepcionesAgendaController.class);
	
	@Autowired
	private ExcepcionesAgendaMundoInterface mundo;
	
	@RequestMapping(value = "excepcionesAgenda/listadoExcepcionesXCentroAtencion", method = RequestMethod.GET)
	public List<DtoExcecionesAgenda> listadoExcepcionesAgendaXCentroAtencion(@RequestParam("codigoCentroAtencion")  Integer codigoCentroAtencion) 
	{
		return mundo.listadoExcepcionesAgendaXCentroAtencion(codigoCentroAtencion);
	}
	
	
	
	
	
	@RequestMapping(value = "excepcionesAgenda/consultarExcepcion", method = RequestMethod.GET)
	public DtoExcecionesAgenda consultarExcepcionAgenda(@RequestParam("codigoExcepcion")  Integer codigoExcepcion) 
	{
		return mundo.consultarExcepcionAgenda(codigoExcepcion);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "excepcionesAgenda/modificarInsertarExcepcion", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoExcecionesAgenda modificarInsertarExcepcionAgenda(@RequestBody DtoExcecionesAgenda centroAtencion) {
		return mundo.modificarInsertarExcepcionAgenda(centroAtencion);
	}
	 

			
}
