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
import com.arsoft.santesys.dto.administracion.DtoViasIngreso;
import com.arsoft.santesys.entidades.TarifariosOficiale;
import com.arsoft.santesys.entidades.ViasIngreso;
import com.arsoft.santesys.repositorios.TarifariosOficialesRepositoryInterface;
import com.arsoft.santesys.repositorios.ViasIngresoRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class ViasIngresoMundoImplement implements ViasIngresoMundoInterface 
{
	@Autowired
	private ApplicationContext appContext;

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.ViasIngresoMundoInterface#listadoViasIngreso(java.lang.Integer)
	 */
	@Override
	public List<DtoViasIngreso> listadoViasIngreso(Integer codigoInstitucion) 
	{
		ArrayList<DtoViasIngreso> listado=new ArrayList<DtoViasIngreso>();
		ViasIngresoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getViasIngresoRepository();
		Iterator<ViasIngreso> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarViasIngresoEntityToDto((ViasIngreso)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.ViasIngresoMundoInterface#consultarViaIngreso(java.lang.Integer)
	 */
	@Override
	public DtoViasIngreso consultarViaIngreso(Integer codigoViaIngreso) 
	{
		ViasIngresoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getViasIngresoRepository();
		DtoViasIngreso dto=UtilidadesJPA.cargarViasIngresoEntityToDto(jpa.findBycodigo(codigoViaIngreso));
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.ViasIngresoMundoInterface#modificarInsertarViaIngreso(com.arsoft.santesys.dto.administracion.DtoViasIngreso)
	 */
	@Override
	public DtoViasIngreso modificarInsertarViaIngreso(DtoViasIngreso dto) 
	{
		ViasIngresoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getViasIngresoRepository();
		ViasIngreso e=UtilidadesJPA.cargarViasIngresoDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarViasIngresoEntityToDto(e);
		return new DtoViasIngreso();
	}

}
