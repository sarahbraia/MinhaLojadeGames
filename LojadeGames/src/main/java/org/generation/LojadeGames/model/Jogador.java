package org.generation.LojadeGames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "tb_Jogador")
public class Jogador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_jogador;
	
	@Column
	@NotNull
	@Size (min = 10,max = 50)
	private String nome_jogador;
	
	@Column
	@NotNull
	@Size (min = 9,max = 50)
	private String email_jogador;
	
	@Column
	@NotNull
	@Size (min = 8,max = 15)
	@UniqueElements
	private String senha_jogador;

	public long getId_jogador() {
		return id_jogador;
	}

	public void setId_jogador(long id_jogador) {
		this.id_jogador = id_jogador;
	}

	public String getNome_jogador() {
		return nome_jogador;
	}

	public void setNome_jogador(String nome_jogador) {
		this.nome_jogador = nome_jogador;
	}

	public String getEmail_jogador() {
		return email_jogador;
	}

	public void setEmail_jogador(String email_jogador) {
		this.email_jogador = email_jogador;
	}

	public String getSenha_jogador() {
		return senha_jogador;
	}

	public void setSenha_jogador(String senha_jogador) {
		this.senha_jogador = senha_jogador;
	}
	
	
	
}
