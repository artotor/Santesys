/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import javax.annotation.ManagedBean;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoInstituciones;
import com.arsoft.santesys.entidades.Institucione;
import com.arsoft.santesys.repositorios.InstitucioneRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class InstitucionesMundoImplement implements InstitucionesMundoInterface 
{

protected static Logger logger = Logger.getLogger("InstitucionesMundoImplement");
	
	@Autowired
	private ApplicationContext appContext;
	
	
	@Override
	public DtoInstituciones consultarInstitucion(Integer codigoInstitucion) {
		InstitucioneRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getInstitucioneRespository();
		DtoInstituciones dto=UtilidadesJPA.cargarInstEntEntityToDto(jpa.findByCodigo(codigoInstitucion));
		return dto;
		
	}

}
