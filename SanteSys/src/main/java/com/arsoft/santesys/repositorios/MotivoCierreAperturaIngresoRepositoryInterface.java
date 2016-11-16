/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.MotCierreAperturaIngreso;

/**
 * @author artotor
 *
 */
public interface MotivoCierreAperturaIngresoRepositoryInterface extends JpaRepository<MotCierreAperturaIngreso, Integer> 
{

	public MotCierreAperturaIngreso findBycodigo(Integer codigo);

	public ArrayList<MotCierreAperturaIngreso> findByInstitucioneCodigo(Integer codigoInstitucion);
	
}
