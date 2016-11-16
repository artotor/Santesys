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
import com.arsoft.santesys.dto.administracion.DtoFuncionalidades;
import com.arsoft.santesys.mundo.ConsultoriosMundoInterface;
import com.arsoft.santesys.mundo.FuncionalidadesMundoInterface;


/**
 * @author artotor
 *
 */
@RestController
public class FuncionalidadesController {
	
	private static final Logger logger = Logger.getLogger(FuncionalidadesController.class);
	
	@Autowired
	private FuncionalidadesMundoInterface mundo;
	
	
	/**
	 * 
	 * @param codigoCentroAtencion
	 * @return
	 */
	@RequestMapping(value = "funcionalidades/listadoFuncionalidades", method = RequestMethod.GET)
	public List<DtoFuncionalidades> listadoFuncionalidades(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listadoFuncionalidades(codigoInstitucion);
	}
	

	
	/**
	 * 
	 * @param codigoConsultorio
	 * @return
	 */
	@RequestMapping(value = "funcionalidades/consultarFuncionalidad", method = RequestMethod.GET)
	public DtoFuncionalidades consultarFuncionalidad(@RequestParam("codigoFuncionalidad")  Integer codigoFuncionalidad) 
	{
		return mundo.consultarFuncionalidad(codigoFuncionalidad);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "funcionalidades/modificarInsertarFuncionalidad", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoFuncionalidades modificarInsertarFuncionalidad(@RequestBody DtoFuncionalidades funcionalidad) {
		return mundo.modificarInsertarFuncionalidad(funcionalidad);
	}
	 

			
}
