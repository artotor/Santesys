package com.arsoft.santesys.repositorios;



import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Departamento;
import com.arsoft.santesys.entidades.DepartamentoPK;



public interface DepartamentoRepositoryInterface extends JpaRepository<Departamento, DepartamentoPK> {
	
	public ArrayList<Departamento> findByPaisCodigo(Integer codigoPais);
		
}
