package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	// Método para buscar categorias pelo tipo, ignorando maiúsculas e minúsculas
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
