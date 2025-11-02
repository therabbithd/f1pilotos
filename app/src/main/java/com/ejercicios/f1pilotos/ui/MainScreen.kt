package com.ejercicios.f1pilotos.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.ejercicios.f1pilotos.model.PilotoF1
import com.ejercicios.f1pilotos.ui.viewmodel.PilotoViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: PilotoViewModel = hiltViewModel()
) {
    val pilotos = viewModel.pilotos

    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(pilotos) { piloto ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("detail/${piloto.nombre}")
                    }
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(piloto.fotoUrl),
                        contentDescription = "Imagen de ${piloto.nombre}",
                        modifier = Modifier
                            .size(90.dp)
                            .clip(CircleShape)
                            .border(2.dp, MaterialTheme.colorScheme.secondary, CircleShape)
                    )
                    Column(modifier = Modifier.padding(start = 16.dp)) {
                        Text(
                            text = piloto.nombre,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = piloto.equipo,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}
