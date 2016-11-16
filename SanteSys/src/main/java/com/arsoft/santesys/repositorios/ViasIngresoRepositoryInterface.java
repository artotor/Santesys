/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.ViasIngreso;

/**
 * @author artotor
 *
 */
public interface ViasIngresoRepositoryInterface extends JpaRepository<ViasIngreso, Integer> 
{

	public ViasIngreso findBycodigo(Integer codigo);

	public ArrayList<ViasIngreso> findByInstitucioneCodigo(Integer codigoInstitucion);
	
}
