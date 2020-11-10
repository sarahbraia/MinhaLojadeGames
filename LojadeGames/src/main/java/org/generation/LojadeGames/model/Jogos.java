package org.generation.LojadeGames.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_jogos")
public class Jogos {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_Produto;
	
	@Column
	@NotNull
	@Size(min=5, max=100)
	private String produto;
	
	@Column
	@NotNull
	@Size(min=5, max=100)
	private String DescricaoTitulo;	
	
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private Categoria categoria;


	public long getId_Produto() {
		return id_Produto;
	}


	public void setId_Produto(long id_Produto) {
		this.id_Produto = id_Produto;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public String getDescricaoTitulo() {
		return DescricaoTitulo;
	}


	public void setDescricaoTitulo(String descricaoTitulo) {
		DescricaoTitulo = descricaoTitulo;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	

	
	
}
