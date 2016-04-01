package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Barrio;
import com.arsoft.santesys.entidades.BarrioPK;

public interface BarrioRepositoryInterface extends JpaRepository<Barrio, BarrioPK> {
	
	public ArrayList<Barrio> findByidCodigoPaisAndIdCodigoDepartamentoAndIdCodigoCiudad(Integer codigoPais,String codigoDepto,String codigoCiudad);

}
