package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import com.arsoft.santesys.dto.administracion.DtoExcecionesAgenda;

public interface ExcepcionesAgendaMundoInterface 
{
	

	public ArrayList<DtoExcecionesAgenda> listadoExcepcionesAgendaXCentroAtencion(Integer codigoCentroAtencion);

	public DtoExcecionesAgenda consultarExcepcionAgenda(Integer codigoExcepcion);

	public DtoExcecionesAgenda modificarInsertarExcepcionAgenda(DtoExcecionesAgenda centroAtencion);
	

}
