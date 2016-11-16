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

import com.arsoft.santesys.dto.administracion.DtoNaturalezaServicio;
import com.arsoft.santesys.entidades.NaturalezasServicio;
import com.arsoft.santesys.repositorios.NaturalezaServicioRepositoryInterface;
import com.arsoft.santesys.utilidades.Utilidades;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class NaturalezaServicioMundoImplement implements NaturalezaServicioMundoInterface 
{
	@Autowired
	private ApplicationContext appContext;

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.NaturalezaServicioMundoInterface#listadoNaturalezasServicios(java.lang.Integer)
	 */
	@Override
	public List<DtoNaturalezaServicio> listadoNaturalezasServicios(Integer codigoInstitucion) 
	{
		ArrayList<DtoNaturalezaServicio> listado=new ArrayList<DtoNaturalezaServicio>();
		NaturalezaServicioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getNaturalezaServicioRepository();
		Iterator<NaturalezasServicio> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarNaturalezasServicioEntityToDto((NaturalezasServicio)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.NaturalezaServicioMundoInterface#consultarNaturalezaServicio(java.lang.Integer)
	 */
	@Override
	public DtoNaturalezaServicio consultarNaturalezaServicio(String acronimoServicio) 
	{
		NaturalezaServicioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getNaturalezaServicioRepository();
		DtoNaturalezaServicio dto=UtilidadesJPA.cargarNaturalezasServicioEntityToDto(jpa.findByAcronimo(acronimoServicio));
		return dto;

	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.NaturalezaServicioMundoInterface#modificarInsertarNaturalezaServicio(com.arsoft.santesys.dto.administracion.DtoNaturalezaServicio)
	 */
	@Override
	public DtoNaturalezaServicio modificarInsertarNaturalezaServicio(DtoNaturalezaServicio dto) {
		NaturalezaServicioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getNaturalezaServicioRepository();
		NaturalezasServicio e=UtilidadesJPA.cargarNaturalezasServicioDtoToEntity(dto);
		e=jpa.save(e); 
		if(e!=null && !Utilidades.isEmptyString(e.getAcronimo()))
			return UtilidadesJPA.cargarNaturalezasServicioEntityToDto(e);
		return new DtoNaturalezaServicio();
	}

}
