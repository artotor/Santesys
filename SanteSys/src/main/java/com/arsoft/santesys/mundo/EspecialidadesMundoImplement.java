/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoEspecialidades;
import com.arsoft.santesys.entidades.Especialidade;
import com.arsoft.santesys.repositorios.EspecialidadesRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class EspecialidadesMundoImplement implements EspecialidadesMundoInterface {

	@Autowired
	private ApplicationContext appContext;
	

	@Override
	public ArrayList<DtoEspecialidades> listarEspecialidades(Integer codigoInstitucion) {
		ArrayList<DtoEspecialidades> listado=new ArrayList<DtoEspecialidades>();
		EspecialidadesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getEspecialidadesRepository();
		Iterator<Especialidade> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarEspecialidadEntityToDto((Especialidade)it.next()));
		}
		return listado;
	}

	@Override
	public DtoEspecialidades consultarEspecialidad(Integer codigoEspecialidad) {
		EspecialidadesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getEspecialidadesRepository();
		DtoEspecialidades dto=UtilidadesJPA.cargarEspecialidadEntityToDto(jpa.findBycodigo(codigoEspecialidad));
		return dto;
		
	}

	@Override
	public DtoEspecialidades modificarInsertarEspecialidad(DtoEspecialidades dto) 
	{
		EspecialidadesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getEspecialidadesRepository();
		Especialidade e=UtilidadesJPA.cargarEspecialidadDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarEspecialidadEntityToDto(e);
		return new DtoEspecialidades();
	}

}
