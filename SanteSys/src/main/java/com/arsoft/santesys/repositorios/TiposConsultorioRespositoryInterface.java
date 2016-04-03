/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TiposConsultorio;

/**
 * @author artotor
 *
 */
public interface TiposConsultorioRespositoryInterface extends JpaRepository<TiposConsultorio, Integer> {
	
	@Cacheable("TiposConsultorio")
	public ArrayList<TiposConsultorio> findByInstitucioneCodigo(Integer codigo);

}
