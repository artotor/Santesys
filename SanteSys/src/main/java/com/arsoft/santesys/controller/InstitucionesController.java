package com.arsoft.santesys.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arsoft.santesys.dto.administracion.DtoInstituciones;
import com.arsoft.santesys.entidades.Institucione;
import com.arsoft.santesys.mundo.InstitucionesMundoInterface;

@RestController
public class InstitucionesController 
{

	private static final Logger logger = Logger.getLogger(InstitucionesController.class);
	
	@Autowired
	private InstitucionesMundoInterface institucioneMundo;
	

	@RequestMapping(value = "/institucionesService/consultarInstitucion", method = RequestMethod.GET)
	public DtoInstituciones getTiposAreaInstitucion(@RequestParam("codigoInstitucion")  Integer codigoInstitucion){
		return institucioneMundo.consultarInstitucion(codigoInstitucion);
	}
}
