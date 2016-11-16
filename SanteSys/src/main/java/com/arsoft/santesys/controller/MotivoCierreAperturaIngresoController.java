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

import com.arsoft.santesys.dto.administracion.DtoMotivosCierreAperturaIngresos;
import com.arsoft.santesys.mundo.MotivoCierreAperturaIngresoMundoInterface;


/**
 * @author artotor
 *
 */
@RestController
public class MotivoCierreAperturaIngresoController {
	
	private static final Logger logger = Logger.getLogger(MotivoCierreAperturaIngresoController.class);
	
	@Autowired
	private MotivoCierreAperturaIngresoMundoInterface mundo;
	
	
	/**
	 * 
	 * @param codigoCentroAtencion
	 * @return
	 */
	@RequestMapping(value = "motivoCierreAperturaIngreso/listadoMotivosCierreAperturaIngreso", method = RequestMethod.GET)
	public List<DtoMotivosCierreAperturaIngresos> listadoMotivosCierreAperturaIngreso(@RequestParam("codigoInstitucion")  Integer codigoInstitucion) 
	{
		return mundo.listadoMotivosCierreAperturaIngreso(codigoInstitucion);
	}
	

	
	/**
	 * 
	 * @param codigoConsultorio
	 * @return
	 */
	@RequestMapping(value = "motivoCierreAperturaIngreso/consultarMotivoCierreAperturaIngreso", method = RequestMethod.GET)
	public DtoMotivosCierreAperturaIngresos consultarMotivoCierreAperturaIngreso(@RequestParam("codigoMotivo")  Integer codigoMotivo) 
	{
		return mundo.consultarMotivoCierreAperturaIngreso(codigoMotivo);
	}
	
	/***
	 *
	 *
	*/
	@RequestMapping(value = "motivoCierreAperturaIngreso/modificarInsertarMotivoCierreAperturaIngreso", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public DtoMotivosCierreAperturaIngresos modificarInsertarMotivoCierreAperturaIngreso(@RequestBody DtoMotivosCierreAperturaIngresos motivosCierreAperturaIngresos) {
		return mundo.modificarInsertarMotivoCierreAperturaIngreso(motivosCierreAperturaIngresos);
	}
	 

			
}
