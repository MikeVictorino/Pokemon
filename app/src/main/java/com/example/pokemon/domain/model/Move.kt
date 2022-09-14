package com.example.pokemon.domain.model

import com.google.gson.annotations.SerializedName

data class Move(
    val move: MoveX,
    @SerializedName("version_group_details")
    val versionGroup: List<LevelLearnedAt>
)

data class MoveX (
    val name: String

)

data class LevelLearnedAt(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int
)