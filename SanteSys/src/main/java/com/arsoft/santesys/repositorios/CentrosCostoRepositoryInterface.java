package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.CentrosCosto;

public interface CentrosCostoRepositoryInterface extends JpaRepository<CentrosCosto, Integer> 
{

	public CentrosCosto findBycodigo(Integer codigo);
	
	public ArrayList<CentrosCosto> findByCentrosAtencionCodigo(Integer codigoCentroAtencion);
}
