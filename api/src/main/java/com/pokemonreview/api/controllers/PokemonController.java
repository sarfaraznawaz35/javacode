package com.pokemonreview.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pokemonreview.api.dto.PokemonDto;
import com.pokemonreview.api.models.Pokemon;
import com.pokemonreview.api.service.PokemonService;

@RestController
@RequestMapping("/api/")
public class PokemonController {
	
	
	PokemonService pokemonService;
	
	@Autowired
	public PokemonController(PokemonService pokemonService) {
		super();
		this.pokemonService = pokemonService;
	}

	@GetMapping("pokemon")
	public ResponseEntity<List<PokemonDto>> getPokemons(){
		return new ResponseEntity<>(pokemonService.getAllPokemon(), HttpStatus.OK);
	}
	
	@GetMapping("pokemon/{id}")
	public ResponseEntity<PokemonDto> pokemonDetail(@PathVariable int id) {
		return ResponseEntity.ok(pokemonService.getPokemonById(id));
	}
	
	@PostMapping("/pokemon/create")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<PokemonDto> createPokemon(@RequestBody PokemonDto pokemonDto ){
		return new ResponseEntity<>(pokemonService.createPokemon(pokemonDto), HttpStatus.CREATED);
	}
	
	@PutMapping("pokemon/{id}/update")
	public ResponseEntity<Pokemon> updatePokemon(@RequestBody Pokemon pokemon, @PathVariable("id") int pokemonId){
		System.out.println(pokemon.getName());
		System.out.println(pokemon.getType());
		return ResponseEntity.ok(pokemon);	
	}
	
	@DeleteMapping("pokemon/{id}/delete")
	public ResponseEntity<String> deletePokemon(@PathVariable("id") int pokemonId){
		System.out.println(pokemonId);
		return ResponseEntity.ok("Pokemon deleted successfully");
	}
	
}
