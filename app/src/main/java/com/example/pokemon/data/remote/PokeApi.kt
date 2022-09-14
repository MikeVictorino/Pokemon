package com.example.pokemon.data.remote

import com.example.pokemon.domain.model.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {

    @GET("pokemon/{pokemonName}")
    suspend fun getPokemonInfo(
        @Path("pokemonName") pokemonName: String
    ) : Pokemon

    companion object{
        const val BASE_URL = "https://pokeapi.co/api/v2/"
    }


}