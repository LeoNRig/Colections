package com.example.colections.teste

fun main() {
    val listaNomes = listOf("Leonardo","Mateus","Arda","Coneailand","Olga")
    val listaNumeros = listOf(1, 2, 3)

//    listaNumeros.sorted()
//    val novaListaNumeros = listaNumeros.sortedDescending()DESC
    val novaListaNumeros = listaNumeros.sorted()//ASC
    println(novaListaNumeros)

    val novaListaNomes1 = listaNomes.sorted()
    val novaListaNomes2 = listaNomes.sortedDescending()

    println(novaListaNomes1)
    println(novaListaNomes2)
}