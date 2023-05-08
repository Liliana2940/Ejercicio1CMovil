package com.example.ejercicio1cmovil


import android.content.Intent
import android.media.MediaPlayer
import android.os.Build

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

import com.example.ejercicio1cmovil.databinding.ActivityMain2Binding



class MainActivity2 : AppCompatActivity() {

    // private lateinit var binding: ActivityMainBinding
    private lateinit var binding: ActivityMain2Binding
    private var carreraS=""
    private var diaS = 0
    private var mesS = 0
    private var anS = 0
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


/*        if(idEmail("aa@bb")){
            Log.d("CORREO", "Sí es correo")
        }else {
            Log.d("CORREO", "No es correo")
        }*/

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

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                carreraS=parent?.getItemAtPosition(position).toString()
                 }

            override fun onNothingSelected(parent: AdapterView<*>?) {



            }


        }

    }
   /* private fun showDatePickerDialog() {
        val date = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        date.show(supportFragmentManager, "Fecha")
    }

    fun onDateSelected(day: Int, month: Int, year: Int) {
        diaS = day
        mesS = month + 1
        anS = year
        //val fecha = binding.idDatePicker.setText("$day/$mesS/$year")
    }*/

        fun click(view: View) {

            val nombre = binding.idName.text.toString()
            val cuenta = binding.idCuenta.text.toString()
            val apellido = binding.idApellido.text.toString()
            val email = binding.idEmail.text.toString()
            //val carrera= binding.idCarrera.text.toString()

            //banderas
            var banderaNombre= false;
            var banderaCuenta= false;
            var banderaApellido= false;
            var banderaEmail= false;
            var banderaCarrera= false;

           /*

            while (fechaN == null) {
                //print("Por favor ingresa tu fecha de nacimiento (formato dd/mm/yyyy): ")
                val input = readLine()
                try {
                    fechaN = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    //println("Tu fecha de nacimiento es: $fechaNacimiento")
                } catch (ex: DateTimeParseException) {
                    println("Formato de fecha incorrecto, por favor inténtalo de nuevo.")
                }
            }*/


            //Cuenta
            if (binding.idCuenta.text.isNotEmpty()) {

               // cuenta = binding.idCuenta.text.toString().toInt()
                if(cuenta.length== 9) {
                    banderaCuenta = true;

                }
                else{
                    binding.idCuenta.error = "Ingrese nueve digitos"
                    banderaCuenta= false;
                }
            } else {
                binding.idCuenta.error = "Valor requerido"

                Toast.makeText(this, "Por favor ingresa numero: ", Toast.LENGTH_LONG).show()
                banderaCuenta= false;
            }

        //Nombre
            if (binding.idName.text.isNotEmpty()) {

                //nombreObtenido = binding.idName.text.toString()
                banderaNombre=true;

            } else {
                binding.idName.error = "Falta nombre"

                Toast.makeText(this, "Por favor ingresa nombre:", Toast.LENGTH_LONG).show()
                banderaNombre= false;
            }

            //apellido
            if (binding.idApellido.text.isNotEmpty()) {

                //nombreObtenido = binding.idName.text.toString()
                banderaApellido=true;

            } else {
                binding.idApellido.error = "Falta apellido"

                Toast.makeText(this, "Por favor ingresa apellido: ", Toast.LENGTH_LONG).show()
                banderaApellido= false;
            }


            //Correo
            if (binding.idEmail.text.isNotEmpty()) {

                //nombreObtenido = binding.idName.text.toString()
                banderaEmail=true;

            } else {
                binding.idEmail.error = "Falta email"

                Toast.makeText(this, "Por favor ingresa email: ", Toast.LENGTH_LONG).show()
                banderaEmail= false;
            }

            if(banderaNombre==true && banderaCuenta==true && banderaApellido==true&& banderaEmail==true) {
                // Boton al siguiente activity
                val intent = Intent(this, MainActivity3::class.java)
                val bundle = Bundle()
                bundle.putString("nombre", nombre)
                bundle.putString("cuenta", cuenta)
                bundle.putString("apellido", apellido)
                bundle.putString("email", email)
                bundle.putString("carrera", carreraS)
               // bundle.putString("fecha", date)

                intent.putExtras(bundle)
                startActivity(intent)
            }
            else{
                //banderaNombre.error="falta nombre"
                binding.idEmail.error = "Falta email"
            }

        }

    }

