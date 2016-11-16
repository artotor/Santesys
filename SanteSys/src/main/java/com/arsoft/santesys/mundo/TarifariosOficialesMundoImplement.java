/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoTarifariosOficiales;
import com.arsoft.santesys.entidades.TarifariosOficiale;
import com.arsoft.santesys.repositorios.TarifariosOficialesRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class TarifariosOficialesMundoImplement implements TarifariosOficialesMundoInterface 
{
	@Autowired
	private ApplicationContext appContext;

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.TarifariosOficialesMundoInterface#listadoTarifariosOficiales(java.lang.Integer)
	 */
	@Override
	public List<DtoTarifariosOficiales> listadoTarifariosOficiales(Integer codigoInstitucion) 
	{
		ArrayList<DtoTarifariosOficiales> listado=new ArrayList<DtoTarifariosOficiales>();
		TarifariosOficialesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getTarifariosOficialesRepository();
		Iterator<TarifariosOficiale> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarTarifariosOficialesEntityToDto((TarifariosOficiale)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.TarifariosOficialesMundoInterface#consultarTarifarioOficial(java.lang.Integer)
	 */
	@Override
	public DtoTarifariosOficiales consultarTarifarioOficial(Integer codigoTarifarioOficial) 
	{
		TarifariosOficialesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getTarifariosOficialesRepository();
		DtoTarifariosOficiales dto=UtilidadesJPA.cargarTarifariosOficialesEntityToDto(jpa.findBycodigo(codigoTarifarioOficial));
		return dto;

	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.TarifariosOficialesMundoInterface#modificarInsertarTarifarioOficial(com.arsoft.santesys.dto.administracion.DtoTarifariosOficiales)
	 */
	@Override
	public DtoTarifariosOficiales modificarInsertarTarifarioOficial(DtoTarifariosOficiales dto) {
		TarifariosOficialesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getTarifariosOficialesRepository();
		TarifariosOficiale e=UtilidadesJPA.cargarTarifariosOficialesDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarTarifariosOficialesEntityToDto(e);
		return new DtoTarifariosOficiales();
	}

}
