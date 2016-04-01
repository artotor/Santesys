package com.arsoft.santesys.repositorios;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsoft.santesys.entidades.Pais;



public interface PaisRepositoryInterface extends JpaRepository<Pais, Integer> {
	
	public ArrayList<Pais> findAll();
	
}
