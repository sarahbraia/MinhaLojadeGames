package org.generation.LojadeGames.repository;
import java.util.List;

import org.generation.LojadeGames.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllProdutoContainIgnoreCase(String descricao);
}
