package com.arsoft.santesys.mundo;

import java.util.List;

import com.arsoft.santesys.dto.administracion.DtoTarifariosOficiales;

public interface TarifariosOficialesMundoInterface {

	public List<DtoTarifariosOficiales> listadoTarifariosOficiales(Integer codigoInstitucion);

	public DtoTarifariosOficiales consultarTarifarioOficial(Integer codigoTarifarioOficial);

	public DtoTarifariosOficiales modificarInsertarTarifarioOficial(DtoTarifariosOficiales tarifarioOficial);

}
