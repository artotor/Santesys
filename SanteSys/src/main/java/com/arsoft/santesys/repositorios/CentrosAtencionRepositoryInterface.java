package com.arsoft.santesys.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.CentrosAtencion;

public interface CentrosAtencionRepositoryInterface extends JpaRepository<CentrosAtencion, Integer> 
{

	public CentrosAtencion findBycodigo(Integer codigo);
	
	public List<CentrosAtencion> findByInstitucioneCodigo(Integer codigoInstitucion);
}
