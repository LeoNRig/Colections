package com.example.colections.teste



fun main() {

    var lista = arrayOf("leonardo","joao", "Leo","Maria")
    println(lista.size)
    println(lista[0])
    println(lista.first())
    println(lista.last())
    println(lista.contains("teo"))
    println(lista.shuffle())

    val novaLista = lista.plus("joao")
    novaLista.forEach { item ->
        println(item)
    }

}