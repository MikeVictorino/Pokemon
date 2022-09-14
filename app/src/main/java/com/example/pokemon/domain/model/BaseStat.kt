package com.example.pokemon.domain.model

import com.google.gson.annotations.SerializedName

data class BaseStat(
    @SerializedName("base_stat")
    val baseStat: Int
)
