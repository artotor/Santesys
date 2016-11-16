/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.GruposServicio;

/**
 * @author artotor
 *
 */
public interface GruposServicioRepositoryInterface extends JpaRepository<GruposServicio , Integer> 
{

	public GruposServicio findBycodigo(Integer codigo);

	public ArrayList<GruposServicio> findByInstitucioneCodigo(Integer codigoInstitucion);
	
}