/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TiposConsultorio;

/**
 * @author artotor
 *
 */
public interface TiposConsultorioRespositoryInterface extends JpaRepository<TiposConsultorio, Integer> {
	public ArrayList<TiposConsultorio> findByInstitucioneCodigo(Integer codigo);

}
