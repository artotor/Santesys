/**
 * 
 */
package com.arsoft.santesys.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Funcionalidade;

/**
 * @author artotor
 *
 */
public interface FuncionalidadesRepositoryInterface  extends JpaRepository<Funcionalidade, Integer> 
{
	public Funcionalidade findBycodigo (Integer codigo);

	public List<Funcionalidade> findByInstitucioneCodigo (Integer codigo);
}
