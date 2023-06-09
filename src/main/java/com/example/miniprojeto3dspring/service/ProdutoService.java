package com.example.miniprojeto3dspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.miniprojeto3dspring.model.Produto;
import com.example.miniprojeto3dspring.model.ProdutoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

	// Criação do objeto repository
	final ProdutoRepository produtoRepository;
	
	// Criar construtor para injeção de dependência
	public ProdutoService (ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
		
	}
	
	// Método de inserção de dados
	// INSERT INTO PRODUTO VALUES (?,?)
	// recebe um produto (sem id) e devolve/coloca no banco(com id)
	@Transactional
	public Produto save (Produto produto) {
		return produtoRepository.save(produto);
		
	}
	
	// Método de pesquisa de dados
	// select * from produto
	public List<Produto> findAll() {
		List<Produto> listaProdutos = produtoRepository.findAll();
		return listaProdutos;
		
	}
	
	
}
