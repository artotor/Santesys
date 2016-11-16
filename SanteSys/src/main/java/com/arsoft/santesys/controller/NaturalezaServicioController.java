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

import com.arsoft.santesys.dto.administracion.DtoNaturalezaServicio;
import com.arsoft.santesys.mundo.NaturalezaServicioMundoInterface;


/**
 * @author artotor
 *
 */
@RestController
public class NaturalezaServicioController {
	
	private static final Logger logger = Logger.getLogger(NaturalezaServicioController.class);
	
	@Autowired
	private NaturalezaServicioMundoInterface mundo;
	
	
	/**
	 * 
	 * @param codigoCentroAtencion
	 * @return
	 */
	@RequestMapping(value = "naturalezasServicios/listadoNaturalezasServicios", method = RequestMethod.GET)
	public List<DtoNaturalezaServicio> listadoNaturalezasServicios(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listadoNaturalezasServicios(codigoInstitucion);
	}
	

	
	/**
	 * 
	 * @param codigoConsultorio
	 * @return
	 */
	@RequestMapping(value = "naturalezasServicios/consultarNaturalezaServicio", method = RequestMethod.GET)
	public DtoNaturalezaServicio consultarNaturalezaServicio(@RequestParam("acronimoNaturaleza")  String acronimoNaturaleza) 
	{
		return mundo.consultarNaturalezaServicio(acronimoNaturaleza);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "naturalezasServicios/modificarInsertarNaturalezaServicio", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoNaturalezaServicio modificarInsertarNaturalezaServicio(@RequestBody DtoNaturalezaServicio naturalezaServicio) {
		return mundo.modificarInsertarNaturalezaServicio(naturalezaServicio);
	}
	 

			
}
