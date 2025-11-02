package com.ejercicios.f1pilotos.repository

import com.ejercicios.f1pilotos.model.PilotoF1
import javax.inject.Inject
import javax.inject.Singleton



@Singleton
class PilotoRepository @Inject constructor() {
    private var pilotos = mutableListOf(
        PilotoF1(
            "Lewis Hamilton",
            "https://www.formula1.com/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png.transform/1col/image.png",
            "Mercedes",
            "Reino Unido"
        ),
        PilotoF1(
            "Max Verstappen",
            "https://www.formula1.com/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png.transform/1col/image.png",
            "Red Bull",
            "Países Bajos"
        ),
        PilotoF1(
            "Charles Leclerc",
            "https://www.formula1.com/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png.transform/1col/image.png",
            "Ferrari",
            "Mónaco"
        ),
        PilotoF1(
            "Fernando Alonso",
            "https://www.formula1.com/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png.transform/1col/image.png",
            "Aston Martin",
            "España"
        ),
        PilotoF1(
            "Lando Norris",
            "https://www.formula1.com/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png.transform/1col/image.png",
            "McLaren",
            "Reino Unido"
        ),
        PilotoF1(
            "Sergio Pérez",
            "https://www.formula1.com/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png.transform/1col/image.png",
            "Red Bull",
            "México"
        ),
        PilotoF1(
            "Carlos Sainz",
            "https://www.formula1.com/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png.transform/1col/image.png",
            "Ferrari",
            "España"
        ),
        PilotoF1(
            "George Russell",
            "https://www.formula1.com/content/dam/fom-website/drivers/G/GEORUS01_George_Russell/georus01.png.transform/1col/image.png",
            "Mercedes",
            "Reino Unido"
        ),
        PilotoF1(
            "Oscar Piastri",
            "https://www.formula1.com/content/dam/fom-website/drivers/O/OSCPIA01_Oscar_Piastri/oscpia01.png.transform/1col/image.png",
            "McLaren",
            "Australia"
        ),
        PilotoF1(
            "Esteban Ocon",
            "https://www.formula1.com/content/dam/fom-website/drivers/E/ESTOCO01_Esteban_Ocon/estoco01.png.transform/1col/image.png",
            "Alpine",
            "Francia"
        )
    )


    fun getPilotos():List<PilotoF1> {
        return pilotos
    }

    fun addPiloto(piloto: PilotoF1) {
        pilotos.add(piloto)
    }
}
