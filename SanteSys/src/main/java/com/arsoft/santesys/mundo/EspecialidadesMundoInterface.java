package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import com.arsoft.santesys.dto.administracion.DtoEspecialidades;

public interface EspecialidadesMundoInterface 
{
	
	/**
	 * 
	 * @param codigoInstitucion
	 * @return
	 */
	public ArrayList<DtoEspecialidades> listarEspecialidades(Integer codigoInstitucion);
	
	/**
	 * 
	 * @param codigoUnidadFuncional
	 * @return
	 */
	public DtoEspecialidades consultarEspecialidad(Integer codigoEspecialidad);
	
	/**
	 * 
	 * @return
	 */
	public DtoEspecialidades modificarInsertarEspecialidad(DtoEspecialidades dto);
	

}
