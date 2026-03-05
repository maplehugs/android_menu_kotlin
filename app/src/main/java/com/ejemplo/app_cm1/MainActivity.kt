package com.ejemplo.app_cm1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista: ListView = findViewById(R.id.listaMenu)

        val opciones = arrayOf(
            "Página Institucional",
            "Buscar Páginas",
            "Mensajes"
        )

        lista.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            opciones
        )

        lista.setOnItemClickListener { _, _, position, _ ->

            when(position){

                0 -> {
                    val intent = Intent(this, WebViewActivity::class.java)
                    intent.putExtra("url","https://umb.edu.co")
                    startActivity(intent)
                }

                1 -> {
                    startActivity(Intent(this, BuscarActivity::class.java))
                }

                2 -> {
                    startActivity(Intent(this, FormularioActivity::class.java))
                }
            }
        }
    }
}