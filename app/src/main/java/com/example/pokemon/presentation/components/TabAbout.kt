package com.example.pokemon.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokemon.domain.model.Ability
import com.example.pokemon.domain.model.Pokemon


@Composable
fun AboutTab(
    modifier: Modifier = Modifier,
    pokemon: Pokemon
) {
    Row(modifier = Modifier
        .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth(0.30F)
                .padding(20.dp)
        ) {
            Text(
                text = "Base Exp",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)

            )
            Text(
                text = "Height",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)

            )
            Text(
                text = "Weight",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)

            )
            Text(
                text = "Abilities",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)

            )

        }
        Column(horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text = pokemon.baseExperience.toString(),
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 8.dp)
            )
            Text(
                text = pokemon.height.toString(),
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 8.dp)
            )
            Text(
                text = pokemon.weight.toString(),
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 8.dp)
            )

            Row() {
                for (ability in pokemon.abilities)
                Text(
                    text = "${ability.ability.name} ",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                )
            }


        }
    }

}

@Composable
fun PokemonAbilitySection(
    ability: List<Ability>
) {
    for (ability in ability){
        ability.ability.name
    }

}