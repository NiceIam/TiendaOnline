package com.example.tiendaonline

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Home_Admin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_admin)
    }

    // Función para el botón "Listado Productos"
    fun irAListadoProductos(view: View) {
        val intent = Intent(this, ListadoProductos::class.java)
        startActivity(intent)
        // finish()  // Opcional: cierra esta actividad si no quieres volver atrás
    }

    // Función para el botón "Carrito de Compras"
    fun irACarritoCompras(view: View) {
        val intent = Intent(this, CarritoCompras::class.java)
        startActivity(intent)
    }

    // Función para el botón "Registro de Clientes"
    fun irARegistroClientes(view: View) {
        val intent = Intent(this, RegistroClientes::class.java)
        startActivity(intent)
    }
}