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

import com.arsoft.santesys.dto.administracion.DtoConsultorios;
import com.arsoft.santesys.mundo.ConsultoriosMundoInterface;


/**
 * @author artotor
 *
 */
@RestController
public class ConsultoriosController {
	
	private static final Logger logger = Logger.getLogger(ConsultoriosController.class);
	
	@Autowired
	private ConsultoriosMundoInterface mundo;
	
	
	/**
	 * 
	 * @param codigoCentroAtencion
	 * @return
	 */
	@RequestMapping(value = "consultorios/listadoConsultoriosXCentroAtencion", method = RequestMethod.GET)
	public List<DtoConsultorios> listadoConsultoriosXCentroAtencion(@RequestParam("codigoCentroAtencion")  Integer codigoCentroAtencion) 
	{
		return mundo.listadoConsultoriosXCentroAtencion(codigoCentroAtencion);
	}
	

	
	/**
	 * 
	 * @param codigoConsultorio
	 * @return
	 */
	@RequestMapping(value = "consultorios/consultarConsultorio", method = RequestMethod.GET)
	public DtoConsultorios consultarConsultorio(@RequestParam("codigoConsultorio")  Integer codigoConsultorio) 
	{
		return mundo.consultarConsultorio(codigoConsultorio);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "consultorios/modificarInsertarConsultorio", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoConsultorios modificarInsertarConsultorio(@RequestBody DtoConsultorios consultorio) {
		return mundo.modificarInsertarConsultorio(consultorio);
	}
	 

			
}
