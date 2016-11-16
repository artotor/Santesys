/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.OcupacionesMedica;

/**
 * @author artotor
 *
 */
public interface OcupacionesMedicasRepositoryInterface extends JpaRepository<OcupacionesMedica, Integer> 
{

	public OcupacionesMedica findBycodigo(Integer codigo);

	public ArrayList<OcupacionesMedica> findByInstitucioneCodigo(Integer codigoInstitucion);
	
}