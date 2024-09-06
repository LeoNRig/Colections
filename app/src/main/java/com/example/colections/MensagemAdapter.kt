package com.example.colections

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(
        val itemView:View
    ): ViewHolder(itemView){

//        val text_nome: TextView = itemView.findViewById(R.id.text_nome)
//        val text_ultima: TextView = itemView.findViewById(R.id.text_ultima)
         val text_nome: TextView = itemView.findViewById(R.id.text_card_view)
         val text_ultima: TextView = itemView.findViewById(R.id.text_card_ultima)
//         val text_horario: TextView = itemView.findViewById(R.id.text_horario)

    }
    // onCreateViewHolder -> Ao criar o ViewHolder -> Criar a Visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

//        val itemView = layoutInflater.inflate(
//            R.layout.item_lista, parent,false
//        )

        val itemView = layoutInflater.inflate(
            R.layout.item_cardview, parent,false
        )

        return MensagemViewHolder(itemView)
    }
    //Ao vincular os dados do ViewHolder
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {

        val mensagem = lista[position]
        holder.text_nome.text = mensagem.nome
        holder.text_ultima.text = mensagem.ultima
//        holder.text_horario.text = mensagem.horario


    }
    // getItemCount -> Recuperar o tamanho da lista
    override fun getItemCount(): Int {
        return lista.size
    }


}