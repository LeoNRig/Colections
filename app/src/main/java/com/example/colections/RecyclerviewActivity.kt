package com.example.colections

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var RecyclerviewActivity: RecyclerView
    private lateinit var btnAtualizar: Button
    private lateinit var mensagemAdapter: MensagemAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val lista = mutableListOf(
            Mensagem("Leonardo", "Olá Mundo", "9:50"),
            Mensagem("Leonard", "Olá dfggggggggggggggggggggggggggggggggggdfgdfffffffffffffffffffffffffffffffffffffffffffffffffffffff", "9:49"),
            Mensagem("Leonar", "Olá Mun", "9:48")
        )

        RecyclerviewActivity = findViewById(R.id.rv_lista)
        btnAtualizar = findViewById(R.id.btn_atualizar)

        mensagemAdapter = MensagemAdapter{nome ->
            Toast.makeText(this, "Olá $nome", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ListViewActivity::class.java)
            intent.putExtra("nome", nome)

            startActivity(
                intent
            )
        }
        mensagemAdapter.atualizarLista(
            lista
        )

        RecyclerviewActivity.adapter = mensagemAdapter
        RecyclerviewActivity.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.VERTICAL,
            
        )
        RecyclerviewActivity.addItemDecoration(
            DividerItemDecoration(this, RecyclerView.VERTICAL)
        )

        btnAtualizar.setOnClickListener{

            mensagemAdapter.executarOperacao()

//            lista.add(
//                Mensagem("Nova Leonar", "Olá Mun", "9:48")
//            )
//            mensagemAdapter.atualizarLista(lista)

        }
        //LinearLayout(XML e Código)
//        RecyclerviewActivity.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
//        RecyclerviewActivity.layoutManager
    }
}