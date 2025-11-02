package com.ejercicios.f1pilotos.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ejercicios.f1pilotos.ui.viewmodel.PilotoViewModel

@Composable
fun AddPilotScreen(
    navController: NavController,
    viewModel: PilotoViewModel = hiltViewModel()
) {
    // UI to add a new pilot will be implemented here
}
