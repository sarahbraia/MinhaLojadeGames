package org.generation.LojadeGames.repository;

import java.util.Optional;

import org.generation.LojadeGames.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long> {
	Optional<Jogos> findByTituloAndDescricao(String titulo, String descricao);
}
