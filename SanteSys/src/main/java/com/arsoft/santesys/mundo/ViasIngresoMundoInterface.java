/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.List;

import com.arsoft.santesys.dto.administracion.DtoViasIngreso;

/**
 * @author artotor
 *
 */
public interface ViasIngresoMundoInterface {

	public List<DtoViasIngreso> listadoViasIngreso(Integer codigoInstitucion);

	public DtoViasIngreso consultarViaIngreso(Integer codigoViaIngreso);

	public DtoViasIngreso modificarInsertarViaIngreso(DtoViasIngreso viaIngreso);

}
