package com.ejemplo.app_cm1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultado: TextView = findViewById(R.id.txtResultado)

        val nombre = intent.getStringExtra("nombre")
        val apellido = intent.getStringExtra("apellido")
        val edad = intent.getStringExtra("edad")

        resultado.text = """
            Nombre: $nombre
            Apellido: $apellido
            Edad: $edad
        """.trimIndent()
    }
}