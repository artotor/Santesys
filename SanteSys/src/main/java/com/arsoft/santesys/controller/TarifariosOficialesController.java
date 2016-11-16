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

import com.arsoft.santesys.dto.administracion.DtoTarifariosOficiales;
import com.arsoft.santesys.mundo.TarifariosOficialesMundoInterface;


/**
 * @author artotor
 *
 */
@RestController
public class TarifariosOficialesController {
	
	private static final Logger logger = Logger.getLogger(TarifariosOficialesController.class);
	
	@Autowired
	private TarifariosOficialesMundoInterface mundo;
	
	
	/**
	 * 
	 * @param codigoCentroAtencion
	 * @return
	 */
	@RequestMapping(value = "tarifariosOficiales/listadoTarifariosOficiales", method = RequestMethod.GET)
	public List<DtoTarifariosOficiales> listadoTarifariosOficiales(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listadoTarifariosOficiales(codigoInstitucion);
	}
	

	
	/**
	 * 
	 * @param codigoConsultorio
	 * @return
	 */
	@RequestMapping(value = "tarifariosOficiales/consultarTarifarioOficial", method = RequestMethod.GET)
	public DtoTarifariosOficiales consultarTarifarioOficial(@RequestParam("codigoTarifarioOficial")  Integer codigoTarifarioOficial) 
	{
		return mundo.consultarTarifarioOficial(codigoTarifarioOficial);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "tarifariosOficiales/modificarInsertarTarifarioOficial", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoTarifariosOficiales modificarInsertarTarifarioOficial(@RequestBody DtoTarifariosOficiales tarifarioOficial) {
		return mundo.modificarInsertarTarifarioOficial(tarifarioOficial);
	}
	 

			
}
