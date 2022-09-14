package com.example.pokemon.data.remote.repository

import com.example.pokemon.data.remote.PokeApi
import com.example.pokemon.data.remote.model.PokemonDto
import com.example.pokemon.domain.model.Pokemon
import com.example.pokemon.domain.repository.PokemonRepository
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val api: PokeApi
): PokemonRepository {

   override suspend fun getPokemon(pokemonName: String): Pokemon {
        return api.getPokemonInfo(pokemonName)
    }


}