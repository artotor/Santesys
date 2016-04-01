/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.DiasSemana;

/**
 * @author artotor
 *
 */
public interface DiasSemanaRespositoryInterface extends JpaRepository<DiasSemana, Integer> {
	public ArrayList<DiasSemana> findByInstitucioneCodigo(Integer codigo);

}
