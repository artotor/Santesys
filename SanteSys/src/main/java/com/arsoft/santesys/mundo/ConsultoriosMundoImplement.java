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

import com.arsoft.santesys.dto.administracion.DtoConsultorios;
import com.arsoft.santesys.entidades.Consultorio;
import com.arsoft.santesys.repositorios.ConsultoriosRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class ConsultoriosMundoImplement implements ConsultoriosMundoInterface 
{
	@Autowired
	private ApplicationContext appContext;

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.ConsultoriosMundoInterface#listadoConsultoriosXCentroAtencion(java.lang.Integer)
	 */
	@Override
	public List<DtoConsultorios> listadoConsultoriosXCentroAtencion(Integer codigoCentroAtencion) 
	{
		ArrayList<DtoConsultorios> listado=new ArrayList<DtoConsultorios>();
		ConsultoriosRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getConsultoriosRepository();
		Iterator<Consultorio> it=jpa.findByCentrosAtencionCodigo(codigoCentroAtencion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarConsultoriosEntityToDto((Consultorio)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.ConsultoriosMundoInterface#consultarConsultorio(java.lang.Integer)
	 */
	@Override
	public DtoConsultorios consultarConsultorio(Integer codigoConsultorio) 
	{
		ConsultoriosRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getConsultoriosRepository();
		DtoConsultorios dto=UtilidadesJPA.cargarConsultoriosEntityToDto(jpa.findBycodigo(codigoConsultorio));
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.ConsultoriosMundoInterface#modificarInsertarConsultorio(com.arsoft.santesys.dto.administracion.DtoConsultorios)
	 */
	@Override
	public DtoConsultorios modificarInsertarConsultorio(DtoConsultorios dto) {
		ConsultoriosRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getConsultoriosRepository();
		Consultorio e=UtilidadesJPA.cargarConsultorioDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarConsultoriosEntityToDto(e);
		return new DtoConsultorios();
	}

}
