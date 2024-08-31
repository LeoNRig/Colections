package com.example.colections

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.colections.teste.Recursos


class MainActivity : AppCompatActivity() {

    private lateinit var textResultado:TextView
    private lateinit var executar:Button

//    fun salvarProduto()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("","Leonardo")

        textResultado = findViewById(R.id.text_resultado)
        executar = findViewById(R.id.btn_executar)

//        executar.setOnClickListener {
//            textResultado.text = "Leonardo"
//        }
        fun cliqueBtn(view: View){

            Toast
                .makeText(this,
                    "Botão apertada com Sucesso",
                    Toast.LENGTH_LONG).show()

            textResultado.text = "Leonardo"
        }

        Recursos.id.text_numero

    }
}