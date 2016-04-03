package com.arsoft.santesys.repositorios;


import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Ciudade;
import com.arsoft.santesys.entidades.CiudadePK;

public interface CiudadeRepositoryInterface extends JpaRepository<Ciudade, CiudadePK> {
	
	@Cacheable("Ciudade")
	public ArrayList<Ciudade> findByIdCodigoPaisAndIdCodigoDepartamento(Integer codigoPais,String codigoDepto);
	
	@Cacheable("Ciudade")
	public ArrayList<Ciudade> findByIdCodigoPais(Integer codigoPais);
	
}