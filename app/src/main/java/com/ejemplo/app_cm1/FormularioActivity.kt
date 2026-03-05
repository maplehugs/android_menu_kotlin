package com.ejemplo.app_cm1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        val nombre: EditText = findViewById(R.id.txtNombre)
        val apellido: EditText = findViewById(R.id.txtApellido)
        val edad: EditText = findViewById(R.id.txtEdad)
        val btnEnviar: Button = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("nombre", nombre.text.toString())
            intent.putExtra("apellido", apellido.text.toString())
            intent.putExtra("edad", edad.text.toString())

            startActivity(intent)
        }
    }
}