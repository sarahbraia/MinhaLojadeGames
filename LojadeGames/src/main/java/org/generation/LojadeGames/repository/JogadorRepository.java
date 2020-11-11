package org.generation.LojadeGames.repository;
import java.util.List;


import org.generation.LojadeGames.model.Jogador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {
	
}
