package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import com.arsoft.santesys.entidades.Barrio;
import com.arsoft.santesys.entidades.Ciudade;
import com.arsoft.santesys.entidades.Departamento;
import com.arsoft.santesys.entidades.DiasSemana;
import com.arsoft.santesys.entidades.EstadosCivile;
import com.arsoft.santesys.entidades.IntegridadDominio;
import com.arsoft.santesys.entidades.OcupacionesProfesionale;
import com.arsoft.santesys.entidades.Pais;
import com.arsoft.santesys.entidades.Sexo;
import com.arsoft.santesys.entidades.TiposArea;
import com.arsoft.santesys.entidades.TiposCie;
import com.arsoft.santesys.entidades.TiposConsultorio;
import com.arsoft.santesys.entidades.TiposIdentificacion;
import com.arsoft.santesys.entidades.TiposServicio;
import com.arsoft.santesys.entidades.TiposVinculacion;

public interface UtilidadesMundoInterface 
{
	public ArrayList<Pais> listadoPaises() ;

	public ArrayList<Departamento> listadoDepartamentos(Integer codigoPais);

	public ArrayList<Ciudade> listadoTodosCiudadesXPaisDepartamento(Integer codigoPais,String codigoDepartamento);

	public ArrayList<Ciudade> listadoCiudadesXPais(Integer codigoPais);

	public ArrayList<Barrio> listadoBarriosXCiudad(Integer codigoPais, String codigoDepartamento, String codigoCiudad);

	public ArrayList<TiposIdentificacion> listadotiposIdentificacion();

	public ArrayList<TiposArea> listadoTiposAreaInstitucion(Integer codigoInstitucion);

	public ArrayList<EstadosCivile> listadoEstadosCivilesInstitucion(Integer codigoInstitucion);

	public ArrayList<TiposVinculacion> listadoTiposVinculacionInstitucion(Integer codigoInstitucion);

	public ArrayList<TiposConsultorio> listadoTiposConsultorioInstitucion(Integer codigoInstitucion);

	public ArrayList<DiasSemana> listadoDiasSemanaInstitucion(Integer codigoInstitucion);

	public ArrayList<TiposServicio> listadoTiposServicioInstitucion(Integer codigoInstitucion);

	public ArrayList<Sexo> listadoSexoInstitucion(Integer codigoInstitucion);

	public ArrayList<IntegridadDominio> listadoIntegridadDominioInstitucion(Integer codigoInstitucion);

	public ArrayList<TiposCie> listadoTiposCieInstitucion(Integer codigoInstitucion);

	public ArrayList<OcupacionesProfesionale> listadoOcupacionesProfesionalInstitucion(Integer codigoInstitucion);

}
