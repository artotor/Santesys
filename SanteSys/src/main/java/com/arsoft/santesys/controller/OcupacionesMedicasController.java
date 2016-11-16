/**
 * 
 */
package com.arsoft.santesys.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arsoft.santesys.dto.administracion.DtoOcupacionesMedicas;
import com.arsoft.santesys.mundo.OcupacionesMedicasMundoInterface;

/**
 * @author artotor
 *
 */
@RestController
public class OcupacionesMedicasController {
	
	private static final Logger logger = Logger.getLogger(OcupacionesMedicasController.class);
	
	@Autowired
	private OcupacionesMedicasMundoInterface mundo;
	
	/**
	 * 
	 * @param codigoInstitucion
	 * @return
	 */
	@RequestMapping(value = "ocupacionesMedicas/listadoOcupacionesMedicas", method = RequestMethod.GET)
	public ArrayList<DtoOcupacionesMedicas> listadoOcupacionesMedicas(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listadoOcupacionesMedicas(codigoInstitucion);
	}
	
	/**
	 * 
	 * @param codigoOcupacion
	 * @return
	 */
	@RequestMapping(value = "ocupacionesMedicas/consultarOcupacionMedica", method = RequestMethod.GET)
	public DtoOcupacionesMedicas consultarOcupacionMedica(@RequestParam("codigoOcupacion")  Integer codigoOcupacion) 
	{
		return mundo.consultarOcupacionMedica(codigoOcupacion);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "ocupacionesMedicas/modificarInsertarOcupacionMedica", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoOcupacionesMedicas modificarInsertarOcupacionMedica(@RequestBody DtoOcupacionesMedicas dto) {
		return mundo.modificarInsertarOcupacionMedica(dto);
	}
	 

			
}
