/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoGruposServicios;
import com.arsoft.santesys.entidades.GruposServicio;
import com.arsoft.santesys.repositorios.GruposServicioRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class GruposServicioMundoImplement implements GruposServicioMundoInterface 
{
	@Autowired
	private ApplicationContext appContext;

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.GruposServicioMundoInterface#listadoGruposServicio(java.lang.Integer)
	 */
	@Override
	public ArrayList<DtoGruposServicios> listadoGruposServicio(Integer codigoInstitucion) 
	{
		ArrayList<DtoGruposServicios> listado=new ArrayList<DtoGruposServicios>();
		GruposServicioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getGruposServicioRepository();
		Iterator<GruposServicio> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarGruposServicioEntityToDto((GruposServicio)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.GruposServicioMundoInterface#consultarGrupoServicio(java.lang.Integer)
	 */
	@Override
	public DtoGruposServicios consultarGrupoServicio(Integer codigoGrupoServicio) 
	{
		GruposServicioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getGruposServicioRepository();
		DtoGruposServicios dto=UtilidadesJPA.cargarGruposServicioEntityToDto(jpa.findBycodigo(codigoGrupoServicio));
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.GruposServicioMundoInterface#modificarInsertarGrupoServicio(com.arsoft.santesys.dto.administracion.DtoGruposServicios)
	 */
	@Override
	public DtoGruposServicios modificarInsertarGrupoServicio(DtoGruposServicios dto) {
		GruposServicioRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getGruposServicioRepository();
		GruposServicio e=UtilidadesJPA.cargarGruposServicioDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarGruposServicioEntityToDto(e);
		return new DtoGruposServicios();

	}

}
