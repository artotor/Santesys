/**
 * 
 */
package com.arsoft.santesys.mundo;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.arsoft.santesys.dto.administracion.DtoInstituciones;
import com.arsoft.santesys.dto.administracion.DtoUnidadesFuncionales;
import com.arsoft.santesys.entidades.Institucione;
import com.arsoft.santesys.entidades.UnidadesFuncionale;
import com.arsoft.santesys.repositorios.InstitucioneRepositoryInterface;
import com.arsoft.santesys.repositorios.UnidadesFuncionaleRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class UnidadesFuncionalesMundoImplement implements UnidadesFuncionalesMundoInterface {

	@Autowired
	private ApplicationContext appContext;
	
	@Override
	public ArrayList<DtoUnidadesFuncionales> listarUnidadesFuncionales(Integer codigoInstitucion) {
		ArrayList<DtoUnidadesFuncionales> listado=new ArrayList<DtoUnidadesFuncionales>();
		UnidadesFuncionaleRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getUnidadesFuncionaleRepository();
		Iterator<UnidadesFuncionale> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarUnidadFuncionalEntityToDto((UnidadesFuncionale)it.next()));
		}
		return listado;
	}

	@Override
	public DtoUnidadesFuncionales consultarUnidadFuncional(Integer codigoUnidadFuncional) {
		UnidadesFuncionaleRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getUnidadesFuncionaleRepository();
		DtoUnidadesFuncionales dto=UtilidadesJPA.cargarUnidadFuncionalEntityToDto(jpa.findBycodigo(codigoUnidadFuncional));
		return dto;
		
	}

	@Override
	public DtoUnidadesFuncionales modificarInsertarUnidadFuncional(DtoUnidadesFuncionales dto) 
	{
		UnidadesFuncionaleRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getUnidadesFuncionaleRepository();
		UnidadesFuncionale e=UtilidadesJPA.cargarUnidadFuncionalDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarUnidadFuncionalEntityToDto(e);
		return new DtoUnidadesFuncionales();
	}

}
