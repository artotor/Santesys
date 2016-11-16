package com.arsoft.santesys.mundo;

import java.util.ArrayList;

import com.arsoft.santesys.dto.administracion.DtoCentroCosto;

public interface CentrosCostoMundoInterface {

	public ArrayList<DtoCentroCosto> listadoCentrosCostoXCentroAtencion(Integer codigoCentroAtencion);

	public DtoCentroCosto consultarCentroCosto(Integer codigoCentroCosto);

	public DtoCentroCosto modificarInsertarCentroCosto(DtoCentroCosto centroCosto);

}
