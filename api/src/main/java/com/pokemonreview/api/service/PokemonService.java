package com.pokemonreview.api.service;

import java.util.List;

import com.pokemonreview.api.dto.PokemonDto;

public interface PokemonService {
	
	PokemonDto createPokemon(PokemonDto pokemonDto);
	
	List<PokemonDto> getAllPokemon();
	
	PokemonDto getPokemonById(int id);
	
	PokemonDto updatePokemon(PokemonDto pokemonDto, int id);
	
	
	

}
