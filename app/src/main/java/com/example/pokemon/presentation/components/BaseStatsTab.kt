package com.example.pokemon.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun BaseStatTab(
    modifier: Modifier = Modifier
    //needs a pokemon as parameter
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "HP",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.20F)
            )
            Text(
                text = "45",
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.15F)
            )
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .padding(horizontal = 8.dp)
                    .weight(0.65F),
                backgroundColor = Color.LightGray,
                color = Color.Red,
                progress = 0.45F
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Attack",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.20F)
            )
            Text(
                text = "60",
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.15F)
            )
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .padding(horizontal = 8.dp)
                    .weight(0.65F),
                backgroundColor = Color.LightGray,
                color = Color.Green,
                progress = 0.60F
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Sp. Atk",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.20F)
            )
            Text(
                text = "00",
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.15F)
            )
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .padding(horizontal = 8.dp)
                    .weight(0.65F),
                backgroundColor = Color.LightGray,
                color = Color.Green,
                progress = 0.85F
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Sp. Def",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.20F)
            )
            Text(
                text = "00",
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.15F)
            )
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .padding(horizontal = 8.dp)
                    .weight(0.65F),
                backgroundColor = Color.LightGray,
                color = Color.Red,
                progress = 0.85F
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Speed",
                color = Color.LightGray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.20F)
            )
            Text(
                text = "00",
                color = Color.Black,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.15F)
            )
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .padding(horizontal = 8.dp)
                    .weight(0.65F),
                backgroundColor = Color.LightGray,
                color = Color.Green,
                progress = 0.85F
            )
        }
    }
}
