package com.arsoft.santesys.mundo;

import java.util.ArrayList;


import com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales;

public interface UnidadesFuncionalesMundoInterface 
{
	
	/**
	 * 
	 * @param codigoInstitucion
	 * @return
	 */
	public ArrayList<DtoUnidadesFuncionales> listarUnidadesFuncionales(Integer codigoInstitucion);
	
	/**
	 * 
	 * @param codigoUnidadFuncional
	 * @return
	 */
	public DtoUnidadesFuncionales consultarUnidadFuncional(Integer codigoUnidadFuncional);
	
	/**
	 * 
	 * @return
	 */
	public DtoUnidadesFuncionales modificarInsertarUnidadFuncional(DtoUnidadesFuncionales dto);
	

}
