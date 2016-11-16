package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.ExcepcionesAgenda;

public interface ExcepcionesAgendaRepositoryInterface extends JpaRepository<ExcepcionesAgenda, Integer> 
{

	public ExcepcionesAgenda findBycodigo(Integer codigo);

	public ArrayList<ExcepcionesAgenda> findByCentrosAtencionCodigo(Integer codigoCentroAtencion);
	
}
