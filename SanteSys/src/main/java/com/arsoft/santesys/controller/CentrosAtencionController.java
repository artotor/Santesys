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

import com.arsoft.santesys.dto.administracion.DtoCentroAtencion;
import com.arsoft.santesys.mundo.CentrosAtencionMundoInterface;

/**
 * @author artotor
 *
 */
@RestController
public class CentrosAtencionController {
	
	private static final Logger logger = Logger.getLogger(CentrosAtencionController.class);
	
	@Autowired
	private CentrosAtencionMundoInterface mundo;
	
	@RequestMapping(value = "centrosAtencion/listadoCentrosAtencion", method = RequestMethod.GET)
	public List<DtoCentroAtencion> listadoCentrosAtencion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listarCentrosAtencion(codigoInstitucion);
	}
	
	
	@RequestMapping(value = "/centrosAtencion/consultarCentroAtencion", method = RequestMethod.GET)
	public DtoCentroAtencion consultarCentroAtencion(@RequestParam("codigoCentroAtencion")  Integer codigoCentroAtencion) 
	{
		return mundo.consultarCentroAtencion(codigoCentroAtencion);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "/centrosAtencion/modificarInsertarCentroAtencion", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoCentroAtencion modificarInsertarCentroAtencion(@RequestBody DtoCentroAtencion centroAtencion) {
		return mundo.modificarInsertarCentroAtencion(centroAtencion);
	}
	 

			
}
