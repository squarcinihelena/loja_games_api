package com.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Busca produtos pelo nome 
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
    
    // Método para buscar produtos com preço maior que o valor passado, ordenando em ordem crescente
    public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);

    // Método para buscar produtos com preço menor que o valor passado, ordenando em ordem decrescente
    public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
