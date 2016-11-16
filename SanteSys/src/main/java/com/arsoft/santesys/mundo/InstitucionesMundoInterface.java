package com.arsoft.santesys.mundo;


import com.arsoft.santesys.dto.administracion.DtoInstituciones;


public interface InstitucionesMundoInterface 
{
	
	public DtoInstituciones consultarInstitucion(Integer codigoInstitucion);

	public DtoInstituciones modificarInstitucion(DtoInstituciones institucion);

}
