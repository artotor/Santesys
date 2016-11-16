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

import com.arsoft.santesys.dto.administracion.DtoGruposServicios;
import com.arsoft.santesys.mundo.GruposServicioMundoInterface;

/**
 * @author artotor
 *
 */
@RestController
public class GruposServicioController {
	
	private static final Logger logger = Logger.getLogger(GruposServicioController.class);
	
	@Autowired
	private GruposServicioMundoInterface mundo;
	
	/**
	 * 
	 * @param codigoInstitucion
	 * @return
	 */
	@RequestMapping(value = "gruposServicio/listadoGruposServicio", method = RequestMethod.GET)
	public ArrayList<DtoGruposServicios> listadoGruposServicio(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listadoGruposServicio(codigoInstitucion);
	}
	
	/**
	 * 
	 * @param codigoGrupoServicio
	 * @return
	 */
	@RequestMapping(value = "gruposServicio/consultarGrupoServicio", method = RequestMethod.GET)
	public DtoGruposServicios consultarGrupoServicio(@RequestParam("codigoGrupoServicio")  Integer codigoGrupoServicio) 
	{
		return mundo.consultarGrupoServicio(codigoGrupoServicio);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "gruposServicio/modificarInsertarGrupoServicio", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoGruposServicios modificarInsertarGrupoServicio(@RequestBody DtoGruposServicios dto) {
		return mundo.modificarInsertarGrupoServicio(dto);
	}
	 

			
}
