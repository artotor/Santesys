package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.EstadosCivile;

public interface EstadosCivilesRespositoryInterface extends JpaRepository<EstadosCivile, String> {
	
	@Cacheable("EstadosCivile")
	public ArrayList<EstadosCivile> findByInstitucioneCodigo(Integer codigo);
}
