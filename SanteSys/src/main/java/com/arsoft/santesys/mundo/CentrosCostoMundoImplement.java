/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoCentroCosto;
import com.arsoft.santesys.entidades.CentrosCosto;
import com.arsoft.santesys.repositorios.CentrosCostoRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class CentrosCostoMundoImplement implements CentrosCostoMundoInterface {

	@Autowired
	private ApplicationContext appContext;
	
	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#listarUnidadesFuncionales(java.lang.Integer)
	 */
	@Override
	public ArrayList<DtoCentroCosto> listadoCentrosCostoXCentroAtencion(Integer codigoCentroAtencion) {
		ArrayList<DtoCentroCosto> listado=new ArrayList<DtoCentroCosto>();
		CentrosCostoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCentrosCostoRepository();
		Iterator<CentrosCosto> it=jpa.findByCentrosAtencionCodigo(codigoCentroAtencion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarCentrosCostoEntityToDto((CentrosCosto)it.next()));
		}
		return listado;
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#consultarUnidadFuncional(java.lang.Integer)
	 */
	@Override
	public DtoCentroCosto consultarCentroCosto(Integer codigoCentroAtencion) {
		CentrosCostoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCentrosCostoRepository();
		DtoCentroCosto dto=UtilidadesJPA.cargarCentrosCostoEntityToDto(jpa.findBycodigo(codigoCentroAtencion));
		return dto;
		
	}

	/* (non-Javadoc)
	 * @see com.arsoft.santesys.mundo.UnidadesFuncionalesMundoInterface#modificarInsertarUnidadFuncional(com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales)
	 */
	@Override
	public DtoCentroCosto modificarInsertarCentroCosto(DtoCentroCosto dto) 
	{
		CentrosCostoRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getCentrosCostoRepository();
		CentrosCosto e=UtilidadesJPA.cargarCentrosCostoDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarCentrosCostoEntityToDto(e);
		return new DtoCentroCosto();
	}


}
