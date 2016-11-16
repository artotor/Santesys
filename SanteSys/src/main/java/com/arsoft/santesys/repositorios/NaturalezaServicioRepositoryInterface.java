/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.NaturalezasServicio;

/**
 * @author artotor
 *
 */
public interface NaturalezaServicioRepositoryInterface extends JpaRepository<NaturalezasServicio, Integer> 
{

	public NaturalezasServicio findByAcronimo(String acronimo);

	public ArrayList<NaturalezasServicio> findByInstitucioneCodigo(Integer codigoInstitucion);
	
}