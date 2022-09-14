package com.example.pokemon.presentation.pokemon_detail_screen

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon.domain.model.Pokemon
import com.example.pokemon.domain.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import retrofit2.Retrofit
import javax.inject.Inject


const val TAG = "APPDEBUG"
@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    val pokemon: MutableState<Pokemon?> = mutableStateOf(null)

    val query = mutableStateOf("pikachu")

    init {
        newSearch(query.value)
    }

    fun newSearch(query: String){
        viewModelScope.launch {
            try {
                val poke = repository.getPokemon(query)
                            Log.d(TAG, "Pokemon id: ${poke.id} ")
            Log.d(TAG, "Pokemon name: ${poke.name} ")
            Log.d(TAG, "Pokemon baseExp: ${poke.baseExperience} ")
            Log.d(TAG, "Pokemon height: ${poke.height} ")
            Log.d(TAG, "Pokemon weight: ${poke.weight} ")
            Log.d(TAG, "Pokemon ability: ${poke.abilities[0].ability.name} ")
            Log.d(TAG, "Pokemon move: ${poke.moves[0].move.name} ")
            Log.d(TAG, "Pokemon move learned at: ${poke.moves[0].versionGroup[0].levelLearnedAt} ")
            Log.d(TAG, "Pokemon stats HP base stats: ${poke.stats[0].baseStat} ")
            Log.d(TAG, "Pokemon types: ${poke.types[0].type.name} ")
            pokemon.value = poke
            } catch (e: HttpException) {
                Log.d("APPDEBUG", "newSearch: ${e.code()}")
                Log.d("APPDEBUG", "newSearch: ${e.message()}")
                Log.d("APPDEBUG", "newSearch: ${e.cause}")
            }


            Log.d("APPDEBUG", "newSearch: $query new Search")
        }

    }
}