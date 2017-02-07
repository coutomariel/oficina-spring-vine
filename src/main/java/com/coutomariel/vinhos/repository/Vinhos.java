package com.coutomariel.vinhos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coutomariel.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{
	
	public List<Vinho> findByNomeContainingIgnoreCase(String nome);

}
