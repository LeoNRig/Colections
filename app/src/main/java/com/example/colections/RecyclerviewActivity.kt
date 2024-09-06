package com.example.colections

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var RecyclerviewActivity: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val lista = listOf(
            Mensagem("Leonardo", "Olá Mundo", "9:50"),
            Mensagem("Leonard", "Olá dfggggggggggggggggggggggggggggggggggdfgdfffffffffffffffffffffffffffffffffffffffffffffffffffffff", "9:49"),
            Mensagem("Leonar", "Olá Mun", "9:48"),
        )

        RecyclerviewActivity = findViewById(R.id.rv_lista)
        RecyclerviewActivity.adapter = MensagemAdapter(lista)
        RecyclerviewActivity.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.VERTICAL,
            
        )

        //LinearLayout(XML e Código)
//        RecyclerviewActivity.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
//        RecyclerviewActivity.layoutManager
    }
}