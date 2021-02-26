package com.francisco.edivan.entidade;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // faz a classe se comportar como entidade (tabela no banco)
public class Produto {
	
	@Id  //informa que este campo é o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define a estratégia de geracao de ID
	private Long id;
	
	private String nome;
	
	private BigDecimal valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}

