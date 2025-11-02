package com.ejercicios.f1pilotos.di

import com.ejercicios.f1pilotos.repository.PilotoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindPilotoRepository(
        impl: PilotoRepository
    ): PilotoRepository // Aquí usarías una interfaz si la tuvieras
}
