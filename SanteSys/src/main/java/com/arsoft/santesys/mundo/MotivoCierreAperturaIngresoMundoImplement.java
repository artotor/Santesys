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

import com.arsoft.santesys.dto.administracion.DtoMotivosCierreAperturaIngresos;
import com.arsoft.santesys.entidades.MotCierreAperturaIngreso;
import com.arsoft.santesys.repositorios.MotivoCierreAperturaIngresoRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class MotivoCierreAperturaIngresoMundoImplement implements MotivoCierreAperturaIngresoMundoInterface 
{
	@Autowired
	private ApplicationContext appContext;

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.MotivoCierreAperturaIngresoMundoInterface#listadoMotivosCierreAperturaIngreso(java.lang.Integer)
	 */
	@Override
	public List<DtoMotivosCierreAperturaIngresos> listadoMotivosCierreAperturaIngreso(Integer codigoInstitucion) 
	{
		ArrayList<DtoMotivosCierreAperturaIngresos> listado=new ArrayList<DtoMotivosCierreAperturaIngresos>();
		MotivoCierreAperturaIngresoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getMotivoCierreAperturaIngresoRepository();
		Iterator<MotCierreAperturaIngreso> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarMotivoCierreAperturaIngresoEntityToDto((MotCierreAperturaIngreso)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.MotivoCierreAperturaIngresoMundoInterface#consultarMotivoCierreAperturaIngreso(java.lang.Integer)
	 */
	@Override
	public DtoMotivosCierreAperturaIngresos consultarMotivoCierreAperturaIngreso(Integer codigoMotivo) 
	{
		MotivoCierreAperturaIngresoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getMotivoCierreAperturaIngresoRepository();
		DtoMotivosCierreAperturaIngresos dto=UtilidadesJPA.cargarMotivoCierreAperturaIngresoEntityToDto(jpa.findBycodigo(codigoMotivo));
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.MotivoCierreAperturaIngresoMundoInterface#modificarInsertarMotivoCierreAperturaIngreso(com.arsoft.santesys.dto.administracion.DtoMotivosCierreAperturaIngresos)
	 */
	@Override
	public DtoMotivosCierreAperturaIngresos modificarInsertarMotivoCierreAperturaIngreso(
			DtoMotivosCierreAperturaIngresos dto) {
		MotivoCierreAperturaIngresoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getMotivoCierreAperturaIngresoRepository();
		MotCierreAperturaIngreso e=UtilidadesJPA.cargarMotivoCierreAperturaIngresoDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarMotivoCierreAperturaIngresoEntityToDto(e);
		return new DtoMotivosCierreAperturaIngresos();
	}

}
