/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import com.arsoft.santesys.dto.administracion.DtoGruposServicios;

/**
 * @author artotor
 *
 */
public interface GruposServicioMundoInterface {

	public ArrayList<DtoGruposServicios> listadoGruposServicio(Integer codigoInstitucion);

	public DtoGruposServicios consultarGrupoServicio(Integer codigoGrupoServicio);

	public DtoGruposServicios modificarInsertarGrupoServicio(DtoGruposServicios dto);

}
