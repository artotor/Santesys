/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.List;

import com.arsoft.santesys.dto.administracion.DtoMotivosCierreAperturaIngresos;
import com.arsoft.santesys.dto.administracion.DtoViasIngreso;

/**
 * @author artotor
 *
 */
public interface MotivoCierreAperturaIngresoMundoInterface {

	public List<DtoMotivosCierreAperturaIngresos> listadoMotivosCierreAperturaIngreso(Integer codigoInstitucion);

	public DtoMotivosCierreAperturaIngresos consultarMotivoCierreAperturaIngreso(Integer codigoMotivo);

	public DtoMotivosCierreAperturaIngresos modificarInsertarMotivoCierreAperturaIngreso(
			DtoMotivosCierreAperturaIngresos motivosCierreAperturaIngresos);

}
