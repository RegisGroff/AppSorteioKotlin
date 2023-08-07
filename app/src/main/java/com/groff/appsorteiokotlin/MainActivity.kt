package com.groff.appsorteiokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){
        var texto = findViewById<TextView>(R.id.textoSorteio)
        val random = Random
        var RandomInRange = random.nextInt(1, 11)
        texto.setText("Número sorteado é: " + RandomInRange)
        //ou texto.text = "Número sorteado é:"

    }

}