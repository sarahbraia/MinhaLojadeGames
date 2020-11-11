package org.generation.LojadeGames.repository;
import java.util.List;
import java.util.Optional;

import org.generation.LojadeGames.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	List<Categoria> findByNome(String nome);
	
	Optional<Categoria> findByDescricaoAndCategoria(String nome, String descricao);
}