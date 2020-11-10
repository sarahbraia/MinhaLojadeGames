package org.generation.LojadeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table (name = "tb_categoria")

public class Categoria {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id_categoria;
	
	@NotNull
	@Size(min=10, max=100)
	private String descricao;

	
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Jogos> jogos;



	public long getId_categoria() {
		return id_categoria;
	}



	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public List<Jogos> getJogos() {
		return jogos;
	}



	public void setJogos(List<Jogos> jogos) {
		this.jogos = jogos;
	}



	
	
}
