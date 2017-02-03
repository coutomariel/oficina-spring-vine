package com.coutomariel.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coutomariel.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{

}
