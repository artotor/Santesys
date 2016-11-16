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

import com.arsoft.santesys.dto.administracion.DtoCentroCosto;
import com.arsoft.santesys.mundo.CentrosCostoMundoInterface;


/**
 * @author artotor
 *
 */
@RestController
public class CentrosCostoController {
	
	private static final Logger logger = Logger.getLogger(CentrosCostoController.class);
	
	@Autowired
	private CentrosCostoMundoInterface mundo;
	
	@RequestMapping(value = "centrosCosto/listadoCentrosCostoXCentroAtencion", method = RequestMethod.GET)
	public List<DtoCentroCosto> listadoCentrosCostoXCentroAtencion(@RequestParam("codigoCentroAtencion")  Integer codigoCentroAtencion) 
	{
		return mundo.listadoCentrosCostoXCentroAtencion(codigoCentroAtencion);
	}
	

	
	
	@RequestMapping(value = "centrosCosto/consultarCentroCosto", method = RequestMethod.GET)
	public DtoCentroCosto consultarCentroCosto(@RequestParam("codigoCentroCosto")  Integer codigoCentroCosto) 
	{
		return mundo.consultarCentroCosto(codigoCentroCosto);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "centrosCosto/modificarInsertarCentroCosto", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoCentroCosto modificarInsertarCentroCosto(@RequestBody DtoCentroCosto centroCosto) {
		return mundo.modificarInsertarCentroCosto(centroCosto);
	}
	 

			
}
