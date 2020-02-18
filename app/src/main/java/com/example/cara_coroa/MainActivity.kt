package com.example.cara_coroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_jogar.setOnClickListener{
            val intent = Intent(applicationContext, tela_moeda::class.java)

            //gerar numero randomico
            val numero = Random().nextInt(2)

            //Enviar numero para a proxima activy

            intent.putExtra(name:"nnumero", numero)

            startActivity()


        }
    }
}
