package org.generation.LojadeGames.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.OneToMany;

import org.generation.LojadeGames.model.Jogos;
import org.generation.LojadeGames.repository.JogosRepository;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("*")
public class JogosController {
	
	@Autowired
	private JogosRepository repository;
	
//	@OneToMany
//	(mappedBy ="categoria", cascade = CascadeType.ALL)
	
	@JsonIgnoreProperties ("categoria")
	private List<Jogos> Jogos;
	
	// Crud
	
	@GetMapping
	public List<Jogos> findAllProduto() {
		return repository.findAll();
	}
	
	@GetMapping("/{id_Produto}")
	public ResponseEntity<Jogos> GetById(@PathVariable long id_Produto){
		return repository.findById(id_Produto)
				.map(resp -> ResponseEntity.ok(resp))
						.orElse(ResponseEntity.notFound().build());
	}
	
//	@GetMapping("/{nome}/{descricao}")
//	public Optional<Jogos> findByDescricaoTitulo(@PathVariable String titulo,@PathVariable String descricao) {
//		return repository.findByTituloAndDescricao(titulo,descricao);
//	}
	
	@PostMapping
	public Jogos postProduto(@RequestBody Jogos objetoJogos) {
		repository.save(objetoJogos);
		return objetoJogos;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Jogos> putProduto(@RequestBody Jogos objetoJogos){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(objetoJogos));
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id) {
		repository.deleteById(id);
	}	
}
