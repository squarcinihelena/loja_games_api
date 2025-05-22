package com.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Busca produtos pelo nome (parcialmente)
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

    // Busca produtos com preço maior que o valor fornecido, ordenados de forma crescente
    public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);

    // Busca produtos com preço menor que o valor fornecido, ordenados de forma decrescente
    public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
