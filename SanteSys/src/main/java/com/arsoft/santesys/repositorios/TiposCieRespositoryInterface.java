/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TiposCie;

/**
 * @author artotor
 *
 */
public interface TiposCieRespositoryInterface extends JpaRepository<TiposCie, Integer> {
	public ArrayList<TiposCie> findByInstitucioneCodigo(Integer codigo);

}
