package com.example.colections.teste





fun main() {


//    val frutas = listOf("maça","banana","pera")
    val nomes = listOf("Leonardo","Leonard","Leonar","Leona")


//    val novaLista = listaVendas.filter { it >= 500 }
    val novaLista = nomes.filter { nome ->
        nome.contains("a")
    }

//    val novaLista = listaVendas.filter {valor ->
//        valor >= 600
//    }
//    println(novaLista)


//    val novaFrutas = frutas.filter{ fruta ->
//        fruta == "laranja"
//    }
//    println(novaFrutas)

}