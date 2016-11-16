/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.List;

import com.arsoft.santesys.dto.administracion.DtoConsultorios;
import com.arsoft.santesys.dto.administracion.DtoFuncionalidades;

/**
 * @author artotor
 *
 */
public interface FuncionalidadesMundoInterface 
{

	List<DtoFuncionalidades> listadoFuncionalidades(Integer codigoInstitucion);

	DtoFuncionalidades consultarFuncionalidad(Integer codigoFuncionalidad);

	DtoFuncionalidades modificarInsertarFuncionalidad(DtoFuncionalidades funcionalidad);

}
