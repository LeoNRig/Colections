package com.example.colections.teste

fun main() {

     val listLanches = listOf("Hamburger","Batata Frita")
     val listEntradas = listOf("cubinho de tapioca","pão")

//    val novaLista = listLanches.union(listEntradas)
    val listaExclusao = listOf("Batata Frita")
    val novaLista = listLanches + listEntradas
    val listaCompleta = novaLista - listaExclusao

    println(novaLista)


}