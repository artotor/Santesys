/**
 * 
 */
package com.arsoft.santesys.repositorios;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.TarifariosOficiale;

/**
 * @author artotor
 *
 */
public interface TarifariosOficialesRepositoryInterface extends JpaRepository<TarifariosOficiale, Integer> 
{

	public TarifariosOficiale findBycodigo(Integer codigo);

	public ArrayList<TarifariosOficiale> findByInstitucioneCodigo(Integer codigoInstitucion);
	
}