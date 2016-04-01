package com.arsoft.santesys.utilidades;


import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.bean.RegistrationBean;



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

	
}
