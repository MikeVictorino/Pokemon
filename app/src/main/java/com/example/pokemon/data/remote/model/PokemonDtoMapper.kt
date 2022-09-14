package com.example.pokemon.data.remote.model

import com.example.pokemon.domain.model.Pokemon
import com.example.pokemon.util.DomainMapper

class PokemonDtoMapper : DomainMapper <PokemonDto, Pokemon> {
    override fun mapToDomain(model: PokemonDto): Pokemon {
        TODO("Not yet implemented")
    }

    override fun mapFromDomainModel(domainModel: Pokemon): PokemonDto {
        TODO("Not yet implemented")
    }
}