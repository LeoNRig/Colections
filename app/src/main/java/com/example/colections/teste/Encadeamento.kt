package com.example.colections.teste


class Menssagem{

    companion object{

        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1

        fun construirTexto(mensagem: String, duracao: Int): Menssagem{
            val menssagem = Menssagem()
            return menssagem
        }

    }
        fun exibir(){
            println("Exibir Mensagem")
        }
}

fun main() {

    Menssagem.construirTexto("Test", Menssagem.DURACAO_LONGA).exibir()

}