/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Sexo;

/**
 * @author artotor
 *
 */
public interface SexoRespositoryInterface extends JpaRepository<Sexo, Integer> {
	public ArrayList<Sexo> findByInstitucioneCodigo(Integer codigo);

}
