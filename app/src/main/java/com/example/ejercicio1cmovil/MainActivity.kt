package com.example.ejercicio1cmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.ejercicio1cmovil.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var cuenta = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        // val nombre = binding.idName.text.toString()

    }


    fun click(view: View){
        cuenta = binding.idCuenta.text.String().toInt()
    }

}