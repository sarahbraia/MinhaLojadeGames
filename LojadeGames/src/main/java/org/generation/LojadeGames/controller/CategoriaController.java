package org.generation.LojadeGames.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.ManyToOne;

import org.generation.LojadeGames.model.Categoria;
import org.generation.LojadeGames.repository.CategoriaRepository;


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
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController  {
	
		
	@Autowired
	private CategoriaRepository repository;
	

	
	// Crud
	
	
	//READ --> GET
	// findAllCategoria = um endPoint com a capacidade de trazer todas as  categorias. 
	@GetMapping("/categorias")
	public List<Categoria> findAllCategoria(){
		return repository.findAll();
	}
	
	// findByIDCategoria = um endPoint com a função de trazer uma única  categoria por id. 
	@GetMapping("/categorias/{id}")
	public Optional<Categoria> findByIDCategoria(@PathVariable Long idCategoria) {
		return repository.findById(idCategoria);
	}
	
	//findByDescricaoCategoria = um endPoint com a função de trazer uma  categoria por Descricao. 
//	@GetMapping("/categoria/descricao/{descricao}")
//	public ResponseEntity<List<Categoria>> findByDescricaoCategoria (@PathVariable String descricaoCategoria){
//		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricaoCategoria));
//	}
	
	//postCategoria = um endPoint com a função de gravar uma nova categoria no  banco de dados. 
	//CREATE --> POST
	@PostMapping("/categoria")
	public Categoria postCategoria (@RequestBody Categoria objetoCategoria) {
		repository.save(objetoCategoria);
		return objetoCategoria;
	}
	
	//UPDATE --> PUT
	// putCategoria = um endPoint com a função de atualizar dados de uma  categoria.
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> putCategoria(@PathVariable Long id, @RequestBody Categoria categoria) 
	{
		categoria.setId(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	//DELETE --> DELETE
	//deleteCategoria = um endPoint com a função de apagar uma categoria do  banco de dados). 

	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id) {
		repository.deleteById(id);
	}	
	
}

