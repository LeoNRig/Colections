package com.example.colections.teste


class ComponentesListagem{

    var adaptador: Adapter? = null
    fun executar(){
        if (adaptador!=null){
            val qtdItems = adaptador!!.qtdItems()
            for (posicao in 0 until qtdItems){
                val item = adaptador!!.posicaoItem(posicao)
                println(item)
            }
        }else{
            println("Configure o adptador!")
        }
    }
}

interface Adapter{

    fun qtdItems(): Int
    fun posicaoItem(posicao: Int): String

}

class MeuAdaptador(
    list: List<String>
): Adapter{
    private val listaItems = list

    override fun qtdItems(): Int {
        return listaItems.size
    }

    override fun posicaoItem(posicao: Int): String {
       val nome = listaItems[posicao]
       return "$posicao) $nome -"
    }
}

fun main() {

    val listaItems = listOf("Leonardo","Leonard","Leonar","Leona","Leon","Leo","Le","L")

    val componentesListagem = ComponentesListagem()
    componentesListagem.adaptador = MeuAdaptador(listaItems)
    componentesListagem.executar()

}