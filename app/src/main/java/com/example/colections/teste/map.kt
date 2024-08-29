package com.example.colections.teste


//data class Produto(
//    val nome: String
//)


fun main() {


//    val lista = mapOf(0 to "Leonardo",1 to "Relo",2 to "Gumball")
    val lista = mutableMapOf("nome" to "Leonardo","nome" to "Relo")

    println(lista["nome"])
            lista["Cavalo"] = "20"

    lista.forEach { produto ->
        println("${produto.key} - ${produto.value}")

    }
}