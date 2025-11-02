package com.ejercicios.f1pilotos.ui.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.ejercicios.f1pilotos.model.PilotoF1
import com.ejercicios.f1pilotos.repository.PilotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PilotoViewModel @Inject constructor(
    private val repository: PilotoRepository
) : ViewModel() {

    private val _pilotos = mutableStateListOf<PilotoF1>()
    val pilotos: List<PilotoF1> = _pilotos

    init {
        _pilotos.addAll(repository.getPilotos())
    }

    fun addPiloto(piloto: PilotoF1) {
        repository.addPiloto(piloto)
        _pilotos.add(piloto)
    }

    fun getPilotoByNombre(nombre: String): PilotoF1? {
        return pilotos.find { it.nombre == nombre }
    }
}
