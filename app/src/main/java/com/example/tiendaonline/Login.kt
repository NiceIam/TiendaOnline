package com.example.tiendaonline

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

        // Función que se ejecuta al hacer clic en el botón
        fun irAHomeAdmin(view: View) {
            val intent = Intent(this, Home_Admin::class.java)  // Crea un Intent para cambiar de Activity
            startActivity(intent)  // Inicia la nueva Activity
            finish()  // (Opcional) Cierra la MainActivity para que no quede en segundo plano
        }
}
