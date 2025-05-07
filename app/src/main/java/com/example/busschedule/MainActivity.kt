package com.example.busschedule // Define el paquete al que pertenece esta clase (organización del código)

import android.os.Bundle // Importa la clase Bundle para guardar y restaurar el estado de la actividad
import androidx.activity.ComponentActivity // Importa la clase base para actividades que usan Jetpack Compose
import androidx.activity.compose.setContent // Importa la función para definir el contenido de la UI con Compose
import com.example.busschedule.ui.BusScheduleApp // Importa el Composable BusScheduleApp, que probablemente define la interfaz de usuario principal de la aplicación
import com.example.busschedule.ui.theme.BusScheduleTheme // Importa el tema personalizado de la aplicación de horarios de autobús

class MainActivity : ComponentActivity() { // Declara la clase MainActivity, que hereda de ComponentActivity. Esta será la actividad principal de la aplicación.
    override fun onCreate(savedInstanceState: Bundle?) { // Sobrescribe la función onCreate, que se llama cuando la actividad se está creando por primera vez.
        super.onCreate(savedInstanceState) // Llama a la implementación onCreate de la clase padre (ComponentActivity). Es importante para la inicialización básica de la actividad.
        setContent { // Inicia el bloque de definición del contenido de la interfaz de usuario con Jetpack Compose.
            BusScheduleTheme { // Aplica el tema personalizado BusScheduleTheme a la interfaz de usuario. Esto asegura que la aplicación tenga la apariencia definida en tu tema.
                BusScheduleApp() // Llama al Composable BusScheduleApp(). Este Composable es el punto de entrada para la interfaz de usuario principal de tu aplicación de horarios de autobús.
            }
        }
    }
}