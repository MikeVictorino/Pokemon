package com.example.pokemon.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MovesTab(
    
) {
LazyColumn(){
    items(10) {
        MoveInfo()
    }
}

    
}

@Preview
@Composable
fun MoveInfo(
    
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
                text = "Text Place holder",
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

