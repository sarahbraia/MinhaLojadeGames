package org.generation.LojadeGames.controller;

import org.generation.LojadeGames.repository.JogosRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("*")
public class JogosController {
	private JogosRepository repository;
	
}
