package com.ejemplo.app_cm1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class BuscarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar)

        val txtUrl: EditText = findViewById(R.id.txtUrl)
        val btnBuscar: Button = findViewById(R.id.btnBuscar)

        btnBuscar.setOnClickListener {

            var direccion = txtUrl.text.toString()

            if(!direccion.startsWith("http")){
                direccion = "https://$direccion"
            }

            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url", direccion)
            startActivity(intent)
        }
    }
}