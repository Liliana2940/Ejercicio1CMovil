package com.example.ejercicio1cmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity3 : AppCompatActivity() {
    //private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        // binding = ActivityMain3Binding.inflate(layoutInflater)
        //setContentView(binding.root)

        /*val bundle = intent.extras

        if (bundle != null) {
            val nombre = bundle.getString("nombre", "")
            val cuenta = bundle.getInt("cuenta", 0)

            Toast.makeText(this, "El nombre es: $nombre, y cuenta es: $cuenta", Toast.LENGTH_LONG)
                .show()
        }*/

        val nombre=intent.getStringExtra("idName")
        val cuenta= intent.getStringExtra("idCuenta")


        val tNombre= findViewById<TextView>(R.id.Nombre2)
        //val tCuenta= findViewById<TextView>(R.id.Tcuenta)
    }


}