package com.arsoft.santesys.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.UnidadesFuncionale;

public interface UnidadesFuncionaleRepositoryInterface extends JpaRepository<UnidadesFuncionale, Integer> 
{

	public UnidadesFuncionale findBycodigo(Integer codigo);
	
	public List<UnidadesFuncionale> findByInstitucioneCodigo(Integer codigoInstitucion);
}
