/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.DiasSemana;

/**
 * @author artotor
 *
 */
public interface DiasSemanaRespositoryInterface extends JpaRepository<DiasSemana, Integer> {
	
	@Cacheable("DiasSemana")	
	public ArrayList<DiasSemana> findByInstitucioneCodigo(Integer codigo);

}
