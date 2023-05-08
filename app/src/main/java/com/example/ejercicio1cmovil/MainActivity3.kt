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
        val carreraS= intent.getStringExtra("carrera")

        val tNombre= findViewById<TextView>(R.id.Nombre2)
        val tCuenta= findViewById<TextView>(R.id.Tcuenta)
        val tSignoC= findViewById<TextView>(R.id.TSignoC)
        val tSignoZ= findViewById<TextView>(R.id.TSignoZ)
        val tCorreo= findViewById<TextView>(R.id.TCorreo)
        val tCarrera= findViewById<TextView>(R.id.TCarrera)

        tNombre.text = getString(R.string.res_nombre, nombre, apellido)
        tCuenta.text = getString(R.string.res_cuenta, cuenta)
        tCorreo.text=getString(R.string.res_correo, email)
        tCarrera.text=getString(R.string.res_carrera, carreraS)


        val imageView = findViewById<ImageView>(R.id.iCarrera)

        //Imagen carrera
        when (carreraS) {
            getString(R.string.Civil) -> imageView.setImageResource(R.drawable.civil)
            getString(R.string.Electrica) -> imageView.setImageResource(R.drawable.ingenieriaelectricaelectronica)
            getString(R.string.Industrial) -> imageView.setImageResource(R.drawable.industrial)
            getString(R.string.Computacion) -> imageView.setImageResource(R.drawable.computacion)
            getString(R.string.Telecom) -> imageView.setImageResource(R.drawable.telecom)
            getString(R.string.Mecanica) -> imageView.setImageResource(R.drawable.mecanica)
            getString(R.string.Mecatronica) -> imageView.setImageResource(R.drawable.mecatronica)
            getString(R.string.Petrolera) -> imageView.setImageResource(R.drawable.petrolera)
            getString(R.string.Aeroespacial) -> imageView.setImageResource(R.drawable.aeroespacial)
            getString(R.string.Geomatica) -> imageView.setImageResource(R.drawable.geomatica)
            getString(R.string.Ambiental) -> imageView.setImageResource(R.drawable.ambiental)
            getString(R.string.Geofisica) -> imageView.setImageResource(R.drawable.geofisica)
            getString(R.string.Geologica) -> imageView.setImageResource(R.drawable.geologica)
            getString(R.string.Minas) -> imageView.setImageResource(R.drawable.metalurgia)
            getString(R.string.Biomedicos) -> imageView.setImageResource(R.drawable.biomedicos)
            else -> imageView.setImageResource(R.drawable.fondo1)
        }

    }


}