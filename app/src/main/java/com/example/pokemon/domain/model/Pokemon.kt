package com.example.pokemon.domain.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
    val id: Int,
    val name: String,
    @SerializedName("base_experience")
    val baseExperience: Int,
    val height: Int,
    val weight: Int,
    val abilities: List<Ability> = listOf(),
    val moves: List<Move>,
    val sprites: Sprite,
    val stats: List<BaseStat>,
    val types: List<Type>
)


