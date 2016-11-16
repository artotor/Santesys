/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.List;

import com.arsoft.santesys.dto.administracion.DtoConsultorios;

/**
 * @author artotor
 *
 */
public interface ConsultoriosMundoInterface {

	public List<DtoConsultorios> listadoConsultoriosXCentroAtencion(Integer codigoCentroAtencion);

	public DtoConsultorios consultarConsultorio(Integer codigoConsultorio);

	public DtoConsultorios modificarInsertarConsultorio(DtoConsultorios consultorio);

}
