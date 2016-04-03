/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TiposVinculacion;

/**
 * @author artotor
 *
 */
public interface TiposVinculacionRespositoryInterface extends JpaRepository<TiposVinculacion, Integer> {
	
	@Cacheable("TiposVinculacion")
	public ArrayList<TiposVinculacion> findByInstitucioneCodigo(Integer codigo);

}
