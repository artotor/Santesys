/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Consultorio;

/**
 * @author artotor
 *
 */
public interface ConsultoriosRepositoryInterface extends JpaRepository<Consultorio,Integer> 
{


	public Consultorio findBycodigo(Integer codigo);

	public ArrayList<Consultorio> findByCentrosAtencionCodigo(Integer codigoCentroAtencion);
}
