/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.IntegridadDominio;

/**
 * @author artotor
 *
 */
public interface IntegridadDominioRespositoryInterface extends JpaRepository<IntegridadDominio, String> {
	
	@Cacheable("IntegridadDominio")
	public ArrayList<IntegridadDominio> findByInstitucioneCodigo(Integer codigo);
	

}
