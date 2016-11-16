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

import com.arsoft.santesys.dto.administracion.DtoViasIngreso;
import com.arsoft.santesys.mundo.ViasIngresoMundoInterface;


/**
 * @author artotor
 *
 */
@RestController
public class ViasIngresoController {
	
	private static final Logger logger = Logger.getLogger(ViasIngresoController.class);
	
	@Autowired
	private ViasIngresoMundoInterface mundo;
	
	
	/**
	 * 
	 * @param codigoCentroAtencion
	 * @return
	 */
	@RequestMapping(value = "viasIngreso/listadoViasIngreso", method = RequestMethod.GET)
	public List<DtoViasIngreso> listadoViasIngreso(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listadoViasIngreso(codigoInstitucion);
	}
	

	
	/**
	 * 
	 * @param codigoConsultorio
	 * @return
	 */
	@RequestMapping(value = "viasIngreso/consultarVianIngreso", method = RequestMethod.GET)
	public DtoViasIngreso consultarViaIngreso(@RequestParam("codigoViaIngreso")  Integer codigoViaIngreso) 
	{
		return mundo.consultarViaIngreso(codigoViaIngreso);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "viasIngreso/modificarInsertarViaIngreso", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoViasIngreso modificarInsertarViaIngreso(@RequestBody DtoViasIngreso viaIngreso) {
		return mundo.modificarInsertarViaIngreso(viaIngreso);
	}
	 

			
}
