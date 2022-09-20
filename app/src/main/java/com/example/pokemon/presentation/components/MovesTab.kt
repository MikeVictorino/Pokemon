package com.example.pokemon.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokemon.domain.model.LevelLearnedAt
import com.example.pokemon.domain.model.Move
import com.example.pokemon.domain.model.Pokemon


@Composable
fun MovesTab(
   pokemon: Pokemon
) {
LazyColumn(){
    items(pokemon.moves) { moves ->
        MoveInfo(moves)
    }
}

    
}

@Composable
fun MoveInfo(
    move: Move,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = move.move.name.capitalize(Locale.current),
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)

            )
            Text(
                text = "Learned at lvl: 00",
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .padding(horizontal = 32.dp),
            color = Color.Gray
        )
    }

}

