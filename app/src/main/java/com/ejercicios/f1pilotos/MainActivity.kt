package com.ejercicios.f1pilotos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.ejercicios.f1pilotos.ui.theme.F1pilotosTheme

// Define your data class outside of any function


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            F1pilotosTheme {
                // The NavController should be created here, at the top level of your composable hierarchy
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "main",
                        // Apply the padding from the Scaffold to the NavHost
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("main") {
                            // Pass the navController to the list screen
                            ListaPilotosF1(pilotos = getListaPilotosF1(), navController = navController)
                        }
                        composable("detail/{pilotonom}") { backStackEntry ->
                            val pilotoNom = backStackEntry.arguments?.getString("pilotonom")
                            val piloto = getListaPilotosF1().find { it.nombre == pilotoNom }
                            if (piloto != null) {
                                DetailScreen(pilotoF1 = piloto, navController = navController)
                            }
                        }
                    }
                }
            }
        }
    }
}

fun getListaPilotosF1(): List<PilotoF1> {
    return listOf(
        PilotoF1(
            nombre = "Lewis Hamilton",
            fotoUrl = "https://www.formula1.com/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png.transform/1col/image.png",
            equipo = "Mercedes",
            nacionalidad = "Reino Unido"
        ),
        PilotoF1(
            nombre = "Max Verstappen",
            fotoUrl = "https://www.formula1.com/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png.transform/1col/image.png",
            equipo = "Red Bull",
            nacionalidad = "Países Bajos"
        ),
        // Add the rest of your pilots here...
        PilotoF1(
            nombre = "Fernando Alonso",
            fotoUrl = "https://www.formula1.com/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png.transform/1col/image.png",
            equipo = "Aston Martin",
            nacionalidad = "España"
        ),
        PilotoF1(
            nombre = "Carlos Sainz",
            fotoUrl = "https://www.formula1.com/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png.transform/1col/image.png",
            equipo = "Ferrari",
            nacionalidad = "España"
        )
    )
}

@Composable
fun ListaPilotosF1(pilotos: List<PilotoF1>, navController: NavController) {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(pilotos) { piloto ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    // Use the clickable modifier on the Card
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




