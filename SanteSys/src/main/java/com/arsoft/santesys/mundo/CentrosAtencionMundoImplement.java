/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoCentroAtencion;
import com.arsoft.santesys.dto.administracion.DtoInstituciones;
import com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales;
import com.arsoft.santesys.entidades.CentrosAtencion;
import com.arsoft.santesys.entidades.Institucione;
import com.arsoft.santesys.entidades.UnidadesFuncionale;
import com.arsoft.santesys.repositorios.CentrosAtencionRepositoryInterface;
import com.arsoft.santesys.repositorios.InstitucioneRepositoryInterface;
import com.arsoft.santesys.repositorios.UnidadesFuncionaleRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class CentrosAtencionMundoImplement implements CentrosAtencionMundoInterface {

	@Autowired
	private ApplicationContext appContext;
	
	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#listarUnidadesFuncionales(java.lang.Integer)
	 */
	@Override
	public ArrayList<DtoCentroAtencion> listarCentrosAtencion(Integer codigoInstitucion) {
		ArrayList<DtoCentroAtencion> listado=new ArrayList<DtoCentroAtencion>();
		CentrosAtencionRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCentrosAtencionRepository();
		Iterator<CentrosAtencion> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarCentroAtencionEntityToDto((CentrosAtencion)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#consultarUnidadFuncional(java.lang.Integer)
	 */
	@Override
	public DtoCentroAtencion consultarCentroAtencion(Integer codigoCentroAtencion) {
		CentrosAtencionRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCentrosAtencionRepository();
				DtoCentroAtencion dto=UtilidadesJPA.cargarCentroAtencionEntityToDto(jpa.findBycodigo(codigoCentroAtencion));
		return dto;
		
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#modificarInsertarUnidadFuncional(com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales)
	 */
	@Override
	public DtoCentroAtencion modificarInsertarCentroAtencion(DtoCentroAtencion dto) 
	{
		CentrosAtencionRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCentrosAtencionRepository();
		CentrosAtencion e=UtilidadesJPA.cargarCentroAtencionDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarCentroAtencionEntityToDto(e);
		return new DtoCentroAtencion();
	}

}
