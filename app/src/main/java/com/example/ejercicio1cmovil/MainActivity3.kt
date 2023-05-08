package com.example.ejercicio1cmovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
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

        val nombre=intent.getStringExtra("nombre")
        val apellido=intent.getStringExtra("apellido")
        val cuenta= intent.getStringExtra("cuenta")
        val edad= intent.getStringExtra("edad")
        val signoZ= intent.getStringExtra("signoZ")
        val signoC= intent.getStringExtra("signoC")
        val email= intent.getStringExtra("email")
        val carrera= intent.getStringExtra("carrera")

        val tNombre= findViewById<TextView>(R.id.Nombre2)
        val tCuenta= findViewById<TextView>(R.id.Tcuenta)
        val tSignoC= findViewById<TextView>(R.id.TSignoC)
        val tSignoZ= findViewById<TextView>(R.id.TSignoZ)
        val tCorreo= findViewById<TextView>(R.id.TCorreo)
        val tCarrera= findViewById<TextView>(R.id.TCarrera)

        tNombre.text = getString(R.string.res_nombre, nombre, apellido)
        tCuenta.text = getString(R.string.res_cuenta, cuenta)
        tCorreo.text=getString(R.string.res_correo, email)
        tCarrera.text=getString(R.string.res_carrera, carrera)


        val imageView = findViewById<ImageView>(R.id.iCarrera)

        //Imagen carrera
        when (carrera) {
            getString(R.string.Civil) -> imageView.setImageResource(R.drawable.Ingenieriacivil)
            getString(R.string.Electrica) -> imageView.setImageResource(R.drawable.ingenieriaelectricaelectronica)
            getString(R.string.Industrial) -> imageView.setImageResource(R.drawable.Ingenieriaindustrial)
            getString(R.string.Computacion) -> imageView.setImageResource(R.drawable.Ingenieriaencomputacion)
            getString(R.string.Telecom) -> imageView.setImageResource(R.drawable.Ingenieriatelecomunicaciones)
            getString(R.string.Mecanica) -> imageView.setImageResource(R.drawable.Ingenieriamecanica)
            getString(R.string.Mecatronica) -> imageView.setImageResource(R.drawable.Ingenieriamecatronica)
            getString(R.string.Petrolera) -> imageView.setImageResource(R.drawable.Ingenieriapetrolera)
            getString(R.string.Aeroespacial) -> imageView.setImageResource(R.drawable.Ingenieriaaeroespacial)
            getString(R.string.Geomatica) -> imageView.setImageResource(R.drawable.geomatico)
            getString(R.string.Ambiental) -> imageView.setImageResource(R.drawable.ambiental)
            getString(R.string.IngGeoFis) -> imageView.setImageResource(R.drawable.geofisica)
            getString(R.string.IngGeolo) -> imageView.setImageResource(R.drawable.geologia)
            getString(R.string.IngMM) -> imageView.setImageResource(R.drawable.minas)
            getString(R.string.IngSB) -> imageView.setImageResource(R.drawable.biomedico)
            else -> imageView.setImageResource(R.drawable.cheems)
        }

    }


}