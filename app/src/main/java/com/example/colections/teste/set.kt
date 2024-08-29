package com.example.colections.teste

data class Carro(
    val mome: String,
    val marca: String
)


fun main() {

//    val lista = setOf("Leoanrdo", "leo",4,"leo")
//    val lista = mutableSetOf("Leoanrdo", "leo",4,"leo")
    val lista = mutableSetOf(
        Carro("","")
    )
//    val novaLista = lista.plus(4)
    lista.add(Carro("leonard","sar"))
    lista.add(Carro("leonard","sar"))
    lista.remove(Carro("Leoanrdo","sar"))
    lista.clear()

    lista.forEach { nome ->
//        println(nome)
    }
}