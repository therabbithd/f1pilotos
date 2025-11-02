package com.ejercicios.f1pilotos.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.ejercicios.f1pilotos.model.PilotoF1
import com.ejercicios.f1pilotos.repository.PilotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PilotoViewModel @Inject constructor(
    private val repository: PilotoRepository
) : ViewModel() {

    val pilotos: List<PilotoF1> = repository.getPilotos()

    fun getPilotoByNombre(nombre: String): PilotoF1? {
        return pilotos.find { it.nombre == nombre }
    }
}
