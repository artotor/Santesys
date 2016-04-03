/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.OcupacionesProfesionale;

/**
 * @author artotor
 *
 */
public interface OcupacionesProfesionalRespositoryInterface extends JpaRepository<OcupacionesProfesionale, Integer> {
	
	@Cacheable("OcupacionesProfesionale")
	public ArrayList<OcupacionesProfesionale> findByInstitucioneCodigo(Integer codigo);

}
