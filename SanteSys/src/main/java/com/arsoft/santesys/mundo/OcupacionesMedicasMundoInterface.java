/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import com.arsoft.santesys.dto.administracion.DtoOcupacionesMedicas;

/**
 * @author artotor
 *
 */
public interface OcupacionesMedicasMundoInterface {

	public ArrayList<DtoOcupacionesMedicas> listadoOcupacionesMedicas(Integer codigoInstitucion);

	public DtoOcupacionesMedicas consultarOcupacionMedica(Integer codigoOcupacion);

	public DtoOcupacionesMedicas modificarInsertarOcupacionMedica(DtoOcupacionesMedicas dto);

}
