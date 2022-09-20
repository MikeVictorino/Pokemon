package com.example.pokemon.presentation.pokemon_detail_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.pokemon.R
import com.example.pokemon.domain.model.Pokemon
import com.example.pokemon.presentation.components.AboutTab
import com.example.pokemon.presentation.components.BaseStatTab
import com.example.pokemon.presentation.components.MovesTab
import kotlinx.coroutines.launch

@Composable
fun PokemonDetailScreen(
    viewModel: PokemonDetailViewModel = hiltViewModel()
) {
    val pokemon = viewModel.pokemon.value?.let {
        PokemonInfo(pokemon = it)
    }
    
    
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PokemonInfo(
    pokemon: Pokemon,
//    modifier: Modifier = Modifier
) {

    val sheetState = rememberBottomSheetState(
        initialValue = BottomSheetValue.Collapsed
    )
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )
    val scope = rememberCoroutineScope()
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetContent = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.60f),
                contentAlignment = Alignment.Center
            ) {
                TabRowSheet(pokemon = pokemon)

            }
        },
        sheetBackgroundColor = Color.White,
        sheetPeekHeight = 0.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red),
            contentAlignment = Alignment.TopCenter
        ) {
            Button(onClick = {
                scope.launch {
                    if (sheetState.isCollapsed) {
                        sheetState.expand()
                    } else {
                        sheetState.collapse()
                    }
                }
            }
            ) {
                Text(text = "Bottom sheet fraction: ${sheetState.progress.fraction}")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = pokemon.name,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp
            )
        }
    }

}


@Composable
fun TabRowSheet(
    pokemon: Pokemon
) {
    var selectedIndex by remember { mutableStateOf(0) }
    val tabs = listOf("About", "Base Stats", "Moves")

    Column(Modifier.fillMaxSize()) {
        TabRow(
            selectedTabIndex = selectedIndex,
            backgroundColor = Color.White,
            contentColor = Color.Black
        ) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    selected = selectedIndex == index,
                    onClick = { selectedIndex = index },
                    text = { Text(text = tab) }
                )
            }
        }

        Box(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            when (selectedIndex) {
                0 -> {
                    AboutTab(pokemon = pokemon)
                }
                1 -> {
                    BaseStatTab(pokemon = pokemon)
                }
                2 -> {
                    MovesTab(pokemon = pokemon)
                }
            }
        }
    }
}