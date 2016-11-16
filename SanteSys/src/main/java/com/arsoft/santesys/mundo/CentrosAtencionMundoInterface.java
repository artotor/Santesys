package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import com.arsoft.santesys.dto.administracion.DtoCentroAtencion;

public interface CentrosAtencionMundoInterface 
{
	
	/**
	 * 
	 * @param codigoInstitucion
	 * @return
	 */
	public ArrayList<DtoCentroAtencion> listarCentrosAtencion(Integer codigoInstitucion);
	
	/**
	 * 
	 * @param codigoUnidadFuncional
	 * @return
	 */
	public DtoCentroAtencion consultarCentroAtencion(Integer codigoCentroAtencion);
	
	/**
	 * 
	 * @return
	 */
	public DtoCentroAtencion modificarInsertarCentroAtencion(DtoCentroAtencion dto);
	

}
