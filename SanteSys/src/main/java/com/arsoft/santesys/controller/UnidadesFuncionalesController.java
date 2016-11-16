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

import com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales;
import com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface;

/**
 * @author artotor
 *
 */
@RestController
public class UnidadesFuncionalesController {
	
	private static final Logger logger = Logger.getLogger(UnidadesFuncionalesController.class);
	
	@Autowired
	private UnidadesFuncionalesMundoInterface mundo;
	
	@RequestMapping(value = "unidadesFuncionalesService/listadoUnidadesFuncionales", method = RequestMethod.GET)
	public List<DtoUnidadesFuncionales> listadoUnidadesFuncionales(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listarUnidadesFuncionales(codigoInstitucion);
	}
	
	@RequestMapping(value = "unidadesFuncionalesService/consultarUnidadFuncional", method = RequestMethod.GET)
	public DtoUnidadesFuncionales consultarUnidadFuncional(@RequestParam("codigoUnidadFuncional")  Integer codigoUnidadFuncional) 
	{
		return mundo.consultarUnidadFuncional(codigoUnidadFuncional);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "/unidadesFuncionalesService/modificarInsertarUnidadFuncional", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoUnidadesFuncionales modificarInsertarUnidadFuncional(@RequestBody DtoUnidadesFuncionales unidadFuncional) {
		return mundo.modificarInsertarUnidadFuncional(unidadFuncional);
	}
	 

			
}
