package com.example.busschedule // Define el paquete al que pertenece esta clase (organización del código)

import android.app.Application // Importa la clase Application, la clase base para todas las aplicaciones Android
import com.example.busschedule.data.AppDatabase // Importa la clase AppDatabase, que probablemente gestiona la base de datos de la aplicación

class BusScheduleApplication: Application() { // Declara la clase BusScheduleApplication, que hereda de Application. Esta clase representa la aplicación en sí.
    val database: AppDatabase by lazy { // Declara una propiedad (variable) llamada database de tipo AppDatabase. La inicialización se realiza de forma lazy.
        AppDatabase.getDatabase(this) // Llama a la función estática (o de objeto singleton) getDatabase de la clase AppDatabase, pasándole el contexto de la aplicación (this). Esto obtiene (o crea si no existe) la instancia de la base de datos de la aplicación. La inicialización lazy asegura que la base de datos solo se cree cuando se acceda a esta propiedad por primera vez.
    }
}