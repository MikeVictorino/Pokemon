package com.example.pokemon.data.remote.model

import com.google.gson.annotations.SerializedName

data class PokemonDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("base_experience")
    val baseExperience: Int,
    @SerializedName("height")
    val height: Int,
    @SerializedName("weight")
    val weight: Int,
    @SerializedName("abilities")
    val abilities: List<AbilityDto> = listOf(),
    @SerializedName("moves")
    val moves: List<MoveDto>,
    @SerializedName("sprites")
    val sprites: SpriteDto,
    @SerializedName("stats")
    val stats: List<BaseStatDto>,
    @SerializedName("types")
    val types: List<TypeDto>
)

data class AbilityDto(
    @SerializedName("ability")
    val ability: AbilityXDto
)

data class AbilityXDto(
    @SerializedName("name")
    val name: String
)

data class BaseStatDto(
    @SerializedName("base_stat")
    val baseStat: Int
)

data class MoveDto(
    @SerializedName("move")
    val move: MoveXDto,
    @SerializedName("version_group_details")
    val versionGroup: List<LevelLearnedAtDto>
)

data class MoveXDto (
    @SerializedName("name")
    val name: String

)

data class LevelLearnedAtDto(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int
)

data class SpriteDto(
    @SerializedName("front_default")
    val frontDefault: String
)

data class TypeDto(
    @SerializedName("type")
    val type: TypeXDto
)

data class TypeXDto(
    @SerializedName("name")
    val name: String
)
