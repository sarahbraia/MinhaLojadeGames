package org.generation.LojadeGames.repository;

import java.util.List;

import org.generation.LojadeGames.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long> {
	public List<Jogos> findAllProdutoContainIgnoreCase(String produto);
}
