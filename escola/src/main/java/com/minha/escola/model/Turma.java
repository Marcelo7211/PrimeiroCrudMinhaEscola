package com.minha.escola.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity //Estou conectando a minha Model com a minha tabela e seguind a estrutura de dados
@Table(name = "tb_turma") // estou nomeando a minha tabela como tb_turma
public class Turma {
	
	@Id //Estou definindo o atributo como Id la na minha base de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Defenido como auto-Increment la na minha base
	private long id;
	
	
	@NotNull // Não estou permitindo valores nulos na coluna descricao em meu banco
	@Size(min = 10, max = 500) // delimita o numero minimo e maximo de caracteres para ser inseridos nesse atributo
	private String descricao;
	
	private boolean ativo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
