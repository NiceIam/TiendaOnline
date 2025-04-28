package com.example.tiendaonline

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Función que se ejecuta al hacer clic en el botón
    fun irALogin(view: View) {
        val intent = Intent(this, Login::class.java)  // Crea un Intent para cambiar de Activity
        startActivity(intent)  // Inicia la nueva Activity
        finish()  // (Opcional) Cierra la MainActivity para que no quede en segundo plano
    }
}
