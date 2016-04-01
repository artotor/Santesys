package com.arsoft.santesys.repositorios;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Ciudade;
import com.arsoft.santesys.entidades.CiudadePK;

public interface CiudadeRepositoryInterface extends JpaRepository<Ciudade, CiudadePK> {
	
	public ArrayList<Ciudade> findByIdCodigoPaisAndIdCodigoDepartamento(Integer codigoPais,String codigoDepto);
	
	public ArrayList<Ciudade> findByIdCodigoPais(Integer codigoPais);
	
}