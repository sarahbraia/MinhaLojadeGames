package org.generation.LojadeGames.controller;

import java.util.List;
import java.util.Optional;

import org.generation.LojadeGames.model.Jogador;
import org.generation.LojadeGames.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogador")
@CrossOrigin("*")
public class JogadorController {
	@Autowired
	private JogadorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Jogador>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	

	@GetMapping("/{id}")
	public Optional<Jogador> findByIDJogador(@PathVariable Long id {
		return repository.findById(id);
	}
	
	@PostMapping
	public Jogador postJogador(@RequestBody Jogador objetoUser) {
		repository.save(objetoUser);
		return objetoUser;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Jogador> putJogador(@RequestBody Jogador objetoUser){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(objetoUser));
	}
	
	@DeleteMapping("/{id}")
	public void deleteJogador(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}

