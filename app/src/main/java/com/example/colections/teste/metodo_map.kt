package com.example.colections.teste

fun converterMaiuscula(texto: String): String{
    return texto.uppercase()
}

fun main() {

    val lista = listOf("Leonardo","Leonard","Leonar")

//    val novaLista = mutableListOf<String>()
//
//    lista.forEach { nome ->
//        novaLista.add(nome.uppercase())
////        println(nome.uppercase())
//    }

//    val novaLista = lista.map { nome ->
//        converterMaiuscula(nome)
////        nome.uppercase()
////        "+ $nome"
//    }
       val novaLista = lista.map{it.uppercase() }
}