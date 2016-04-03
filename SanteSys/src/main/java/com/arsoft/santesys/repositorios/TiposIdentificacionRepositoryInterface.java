/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TiposIdentificacion;

/**
 * @author artotor
 *
 */
public interface TiposIdentificacionRepositoryInterface extends JpaRepository<TiposIdentificacion, String> {

	
	@Cacheable("TiposIdentificacion")
	public ArrayList<TiposIdentificacion> findAll();
}
