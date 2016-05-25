package com.arsoft.santesys.repositorios;



import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Institucione;

public interface InstitucioneRepositoryInterface extends JpaRepository<Institucione, Integer> {
	

	public Institucione findByCodigo(Integer codigo);

}
