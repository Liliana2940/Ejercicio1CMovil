package com.example.ejercicio1cmovil


import android.content.Intent
import android.media.MediaPlayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
//import android.widget.ArrayAdapter
//import android.widget.Spinner
import android.widget.Toast

import com.example.ejercicio1cmovil.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {

    // private lateinit var binding: ActivityMainBinding
    private lateinit var binding: ActivityMain2Binding
    var cuenta = 0
    var nombre = " "

    //val carreras = resources.getStringArray(R.array.Carreras)
    val spinner = " "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)
        // binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        // Log.d("CICLODEVIDA", "onCreate")

//        mp = MediaPlayer.create(this, R.raw.zeldatotk)
        //      mp.start()


        ArrayAdapter.createFromResource(
            this,
            R.array.Carreras,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = adapter
        }


        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.d("LOGTAG", "El item seleccionado tiene la posición $position")
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }


        }

    }


        fun click(view: View) {

            //Cuenta
            if (binding.idCuenta.text.isNotEmpty()) {

                cuenta = binding.idCuenta.text.toString().toInt()

                Toast.makeText(this, "El número ingresado es: $cuenta", Toast.LENGTH_LONG).show()
            } else {
                binding.idCuenta.error = "Valor requerido"

                Toast.makeText(this, "Por favor ingresa numero: ", Toast.LENGTH_LONG).show()

            }


            if (binding.idCuenta.text.isNotEmpty()) {

                nombre = binding.idName.text.toString()

                Toast.makeText(this, "El nombre es: $cuenta", Toast.LENGTH_LONG).show()
            } else {
                binding.idCuenta.error = "Valor requerido"

                Toast.makeText(this, "Por favor ingresa numero: ", Toast.LENGTH_LONG).show()

            }
            /*
        val spinner: Spinner = findViewById(R.id.spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.Carreras,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
*/

            // Boton al siguiente activity
            val intent = Intent(this, MainActivity3::class.java)
            val bundle = Bundle()
            bundle.putString("nombre", "lili")
            bundle.putInt("cuenta", 45154)

            intent.putExtras(bundle)
            startActivity(intent)
        }

    }

