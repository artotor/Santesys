/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.List;

import com.arsoft.santesys.dto.administracion.DtoNaturalezaServicio;

/**
 * @author artotor
 *
 */
public interface NaturalezaServicioMundoInterface {

	public List<DtoNaturalezaServicio> listadoNaturalezasServicios(Integer codigoInstitucion);

	public DtoNaturalezaServicio consultarNaturalezaServicio(String acronimoServicio);

	public DtoNaturalezaServicio modificarInsertarNaturalezaServicio(DtoNaturalezaServicio naturalezaServicio);

}
