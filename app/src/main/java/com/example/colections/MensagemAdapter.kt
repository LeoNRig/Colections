package com.example.colections

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val clique: (String) -> Unit
) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    private var listaMensagens = mutableListOf<Mensagem>()


    fun executarOperacao(){

        listaMensagens.removeAt(1)
        listaMensagens.removeAt(2)
        notifyItemRangeRemoved(1,2)
//        listaMensagens[0] = Mensagem("Leonardo", "Olá, teste", "9:49")
//        listaMensagens[1] = Mensagem("Maria", "Olá, tdbem", "9:49")
//        notifyItemRangeChanged(0,2)
//        listaMensagens[0] = Mensagem("Leonardo", "Olá, teste", "9:49")
//        notifyItemChanged(0)

//        listaMensagens.add(
//               Mensagem("Novo Leonar", "Olá Mun", "9:48")
//            )
//        listaMensagens.add(
//            Mensagem("Novo Leon", "Olá Mun", "9:48")
//        )
//        listaMensagens.add(
//            Mensagem("Novo Leo", "Olá Mun", "9:48")
//        )
//        notifyItemRangeInserted(2, 3)
//            notifyItemInserted(listaMensagens.size)

    }

    fun atualizarLista(lista: MutableList<Mensagem>){
//        listaMensagens.addAll(lista)
        listaMensagens = lista
        notifyDataSetChanged()
    }
    inner class MensagemViewHolder(
        val itemView:View
    ): ViewHolder(itemView){

//        val text_nome: TextView = itemView.findViewById(R.id.text_nome)
//        val text_ultima: TextView = itemView.findViewById(R.id.text_ultima)

         val text_nome: TextView = itemView.findViewById(R.id.text_card_view)
         val text_ultima: TextView = itemView.findViewById(R.id.text_card_ultima)
         val imagePerfil: ImageView = itemView.findViewById(R.id.image_card_perfil)
         val cardView: CardView = itemView.findViewById(R.id.card_view_layout)

//         val text_horario: TextView = itemView.findViewById(R.id.text_horario)

        fun bind(mensagem: Mensagem){//Conectar com a interface
            text_nome.text = mensagem.nome
            text_ultima.text = mensagem.ultima

            cardView.setOnClickListener{
                clique(mensagem.nome)
            }

        }

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

        val mensagem = listaMensagens[position]
        holder.bind(mensagem)

//        holder.text_nome.text = mensagem.nome
//        holder.text_ultima.text = mensagem.ultima
//        holder.text_horario.text = mensagem.horario

        //Aplicar eventos de clique
//        val context = holder.imagePerfil.context
//        holder.imagePerfil.setOnClickListener{
//            Toast.makeText(context,"Olá Mundo ${mensagem.nome}", Toast.LENGTH_SHORT).show()
//        }

    }
    // getItemCount -> Recuperar o tamanho da lista
    override fun getItemCount(): Int {
        return listaMensagens.size
    }


}