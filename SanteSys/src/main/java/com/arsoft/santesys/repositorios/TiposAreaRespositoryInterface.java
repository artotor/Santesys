/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TiposArea;

/**
 * @author artotor
 *
 */
public interface TiposAreaRespositoryInterface extends JpaRepository<TiposArea, Integer> {
	public ArrayList<TiposArea> findByInstitucioneCodigo(Integer codigo);

}
