package com.arsoft.santesys.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Especialidade;

public interface EspecialidadesRepositoryInterface extends JpaRepository<Especialidade, Integer> 
{

	public Especialidade findBycodigo(Integer codigo);
	
	public List<Especialidade> findByInstitucioneCodigo(Integer codigoInstitucion);
}
