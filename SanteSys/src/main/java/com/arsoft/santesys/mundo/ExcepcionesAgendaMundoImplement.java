/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoExcecionesAgenda;
import com.arsoft.santesys.entidades.ExcepcionesAgenda;
import com.arsoft.santesys.repositorios.ExcepcionesAgendaRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class ExcepcionesAgendaMundoImplement implements ExcepcionesAgendaMundoInterface {

	@Autowired
	private ApplicationContext appContext;
	
	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#listarUnidadesFuncionales(java.lang.Integer)
	 */
	@Override
	public ArrayList<DtoExcecionesAgenda> listadoExcepcionesAgendaXCentroAtencion(Integer codigoCentroAtencion) {
		ArrayList<DtoExcecionesAgenda> listado=new ArrayList<DtoExcecionesAgenda>();
		ExcepcionesAgendaRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getExcepcionesAgendaRepository();
		Iterator<ExcepcionesAgenda> it=jpa.findByCentrosAtencionCodigo(codigoCentroAtencion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarExcecionAgendaEntityToDto((ExcepcionesAgenda)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#consultarUnidadFuncional(java.lang.Integer)
	 */
	@Override
	public DtoExcecionesAgenda consultarExcepcionAgenda(Integer codigoCentroAtencion) {
		ExcepcionesAgendaRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getExcepcionesAgendaRepository();
		DtoExcecionesAgenda dto=UtilidadesJPA.cargarExcecionAgendaEntityToDto(jpa.findBycodigo(codigoCentroAtencion));
		return dto;
		
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#modificarInsertarUnidadFuncional(com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales)
	 */
	@Override
	public DtoExcecionesAgenda modificarInsertarExcepcionAgenda(DtoExcecionesAgenda dto) 
	{
		ExcepcionesAgendaRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getExcepcionesAgendaRepository();
		ExcepcionesAgenda e=UtilidadesJPA.cargarExcecionAgendaDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarExcecionAgendaEntityToDto(e);
		return new DtoExcecionesAgenda();
	}


}
