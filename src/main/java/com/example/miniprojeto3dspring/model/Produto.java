package com.example.miniprojeto3dspring.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Produto")
public class Produto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long id;
private String nome;
private String descricao;
private String codigoBarras;
private byte[] foto;

public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getDescricao() {
	return descricao;
}


public void setDescricao(String descricao) {
	this.descricao = descricao;
}


public String getCodigoBarras() {
	return codigoBarras;
}


public void setCodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
}


public byte[] getFoto() {
	return foto;
}


public void setFoto(byte[] foto) {
	this.foto = foto;
}


public double getPreco() {
	return preco;
}


public void setPreco(double preco) {
	this.preco = preco;
}


public String getCategoria() {
	return categoria;
}


public void setCategoria(String categoria) {
	this.categoria = categoria;
}


public String getDestaque() {
	return destaque;
}


public void setDestaque(String destaque) {
	this.destaque = destaque;
}


public String getStatusProd() {
	return statusProd;
}


public void setStatusProd(String statusProd) {
	this.statusProd = statusProd;
}


private double preco;
private String categoria;
private String destaque;
private String statusProd;

// Gerar os Getters and Setters
// Source / Generate Getters and Setters... 
// Select All / Generate
}
