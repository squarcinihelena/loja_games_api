package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Busca produtos pelo nome 
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

}
