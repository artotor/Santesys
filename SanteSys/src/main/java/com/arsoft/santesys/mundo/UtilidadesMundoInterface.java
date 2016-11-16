package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import com.arsoft.santesys.dto.administracion.DtoBarrio;
import com.arsoft.santesys.dto.administracion.DtoDiasSemana;
import com.arsoft.santesys.dto.administracion.DtoEstadoCivil;
import com.arsoft.santesys.dto.administracion.DtoIntegridadDominio;
import com.arsoft.santesys.dto.administracion.DtoOcupacionProfesional;
import com.arsoft.santesys.dto.administracion.DtoSexo;
import com.arsoft.santesys.dto.administracion.DtoTipoCie;
import com.arsoft.santesys.dto.administracion.DtoTipoConsultorio;
import com.arsoft.santesys.dto.administracion.DtoTipoIdentificacion;
import com.arsoft.santesys.dto.administracion.DtoTipoServicio;
import com.arsoft.santesys.dto.administracion.DtoTipoVinculacion;
import com.arsoft.santesys.dto.administracion.DtoCiudades;
import com.arsoft.santesys.dto.administracion.DtoDepartamentos;
import com.arsoft.santesys.dto.administracion.DtoPaises;
import com.arsoft.santesys.dto.administracion.DtoTiposArea;

public interface UtilidadesMundoInterface 
{
	public ArrayList<DtoPaises> listadoPaises() ;

	public ArrayList<DtoDepartamentos> listadoDepartamentos(Integer codigoPais);

	public ArrayList<DtoCiudades> listadoTodosCiudadesXPaisDepartamento(Integer codigoPais,String codigoDepartamento);

	public ArrayList<DtoCiudades> listadoCiudadesXPais(Integer codigoPais);

	public ArrayList<DtoBarrio> listadoBarriosXCiudad(Integer codigoPais, String codigoDepartamento, String codigoCiudad);

	public ArrayList<DtoTipoIdentificacion> listadotiposIdentificacion();

	public ArrayList<DtoTiposArea> listadoTiposAreaInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoEstadoCivil> listadoEstadosCivilesInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoTipoVinculacion> listadoTiposVinculacionInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoTipoConsultorio> listadoTiposConsultorioInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoDiasSemana> listadoDiasSemanaInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoTipoServicio> listadoTiposServicioInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoSexo> listadoSexoInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoIntegridadDominio> listadoIntegridadDominioInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoTipoCie> listadoTiposCieInstitucion(Integer codigoInstitucion);

	public ArrayList<DtoOcupacionProfesional> listadoOcupacionesProfesionalInstitucion(Integer codigoInstitucion);

}
