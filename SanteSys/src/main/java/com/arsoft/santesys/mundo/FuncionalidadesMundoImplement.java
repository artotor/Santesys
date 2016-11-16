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
import com.arsoft.santesys.dto.administracion.DtoFuncionalidades;
import com.arsoft.santesys.entidades.Consultorio;
import com.arsoft.santesys.entidades.Funcionalidade;
import com.arsoft.santesys.repositorios.ConsultoriosRepositoryInterface;
import com.arsoft.santesys.repositorios.FuncionalidadesRepositoryInterface;
import com.arsoft.santesys.utilidades.UtilidadesJPA;

/**
 * @author artotor
 *
 */
@ManagedBean
public class FuncionalidadesMundoImplement implements FuncionalidadesMundoInterface 
{

	@Autowired
	private ApplicationContext appContext;
	
	
	@Override
	public List<DtoFuncionalidades> listadoFuncionalidades(Integer codigoInstitucion) {
		ArrayList<DtoFuncionalidades> listado=new ArrayList<DtoFuncionalidades>();
		FuncionalidadesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getFuncionalidadesRepository();
		Iterator<Funcionalidade> it=jpa.findByInstitucioneCodigo(codigoInstitucion).iterator();
		while(it.hasNext())
		{
			listado.add(UtilidadesJPA.cargarFuncionalidadEntityToDto((Funcionalidade)it.next()));
		}
		return listado;
	}

	@Override
	public DtoFuncionalidades consultarFuncionalidad(Integer codigoFuncionalidad) {
		FuncionalidadesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getFuncionalidadesRepository();
		DtoFuncionalidades dto=UtilidadesJPA.cargarFuncionalidadEntityToDto(jpa.findBycodigo(codigoFuncionalidad));
		return dto;
	}

	@Override
	public DtoFuncionalidades modificarInsertarFuncionalidad(DtoFuncionalidades dto) 
	{
		FuncionalidadesRepositoryInterface jpa=UtilidadesJPA.obtenerRegistrationBean(appContext).getFuncionalidadesRepository();
		Funcionalidade e=UtilidadesJPA.cargarFuncionalidadDtoToEntity(dto);
		e=jpa.save(e);
		if(e!=null && e.getCodigo()>0)
			return UtilidadesJPA.cargarFuncionalidadEntityToDto(e);
		return new DtoFuncionalidades();
	}

	

}
