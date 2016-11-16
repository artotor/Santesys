/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoOcupacionesMedicas;
import com.arsoft.santesys.entidades.OcupacionesMedica;
import com.arsoft.santesys.repositorios.OcupacionesMedicasRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class OcupacionesMedicasMundoImplement implements OcupacionesMedicasMundoInterface 
{
	@Autowired
	private ApplicationContext appContext;

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.OcupacionesMedicasMundoInterface#listadoOcupacionesMedicas(java.lang.Integer)
	 */
	@Override
	public ArrayList<DtoOcupacionesMedicas> listadoOcupacionesMedicas(Integer codigoInstitucion) 
	{
		ArrayList<DtoOcupacionesMedicas> listado=new ArrayList<DtoOcupacionesMedicas>();
		OcupacionesMedicasRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getOcupacionesMedicasRepository();
		Iterator<OcupacionesMedica> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarOcupacionesMedicasEntityToDto((OcupacionesMedica)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.OcupacionesMedicasMundoInterface#consultarOcupacionMedica(java.lang.Integer)
	 */
	@Override
	public DtoOcupacionesMedicas consultarOcupacionMedica(Integer codigoOcupacion) 
	{
		OcupacionesMedicasRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getOcupacionesMedicasRepository();
		DtoOcupacionesMedicas dto=UtilidadesJPA.cargarOcupacionesMedicasEntityToDto(jpa.findBycodigo(codigoOcupacion));
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.OcupacionesMedicasMundoInterface#modificarInsertarOcupacionMedica(com.arsoft.santesys.dto.administracion.DtoOcupacionesMedicas)
	 */
	@Override
	public DtoOcupacionesMedicas modificarInsertarOcupacionMedica(DtoOcupacionesMedicas dto) {
		OcupacionesMedicasRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getOcupacionesMedicasRepository();
		OcupacionesMedica e=UtilidadesJPA.cargarOcupacionesMedicasDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarOcupacionesMedicasEntityToDto(e);
		return new DtoOcupacionesMedicas();
	}

}
