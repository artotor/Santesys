/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TiposServicio;

/**
 * @author artotor
 *
 */
public interface TiposServicioRespositoryInterface extends JpaRepository<TiposServicio, String> {
	
	@Cacheable("TiposServicio")
	public ArrayList<TiposServicio> findByInstitucioneCodigo(Integer codigo);

}
