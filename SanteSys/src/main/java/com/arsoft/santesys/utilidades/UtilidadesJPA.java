package com.arsoft.santesys.utilidades;


import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.bean.RegistrationBean;
import com.arsoft.santesys.dto.administracion.DtoInstituciones;
import com.arsoft.santesys.entidades.Institucione;



public class UtilidadesJPA 
{
	
	/**
	 * Metodo que retorna la clase RegistrationBean
	 * @param appContext
	 * @return
	 */
	public static RegistrationBean obtenerRegistrationBean(ApplicationContext appContext)
	{
		return (RegistrationBean) appContext.getBean("registrationBean");
	}
	
	/**
	 * 
	 * @param entity
	 * @return
	 */
	public static DtoInstituciones cargarInstEntEntityToDto(Institucione entity)
	{
		DtoInstituciones dto=new DtoInstituciones();
		dto.setCodigo(entity.getCodigo());
		dto.setDireccion(entity.getDireccion());
		return dto;
				
	}

		
}
