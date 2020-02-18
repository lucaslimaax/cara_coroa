package com.example.cara_coroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_moeda.*

class tela_moeda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_moeda)

        val dados: Bundle = intent.extras
        val numero = dados.getInt("numero")

        if(numero == 0){
            img_cara.setImageResource(R.drawable.moeda_cara)

        }
        else{
            img_cara.setImageResource(R.drawable.moeda_cara)

        }

        button_voltar.setOnClickListener{
            finish()
        }
    }
}
