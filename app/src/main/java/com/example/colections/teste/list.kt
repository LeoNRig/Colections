package com.example.colections.teste

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main() {

//    val cliente1 = Cliente("Leonardo", 20)
//    val cliente2 = Cliente("Joao", 34)
    val listaClientes = mutableListOf(
        Cliente("Leonardo", 20),
        Cliente("Joao", 34)
    )

//    val listaArray= mutableListOf("Leonardo", "Joao")
//
//    listaArray.add("Leoncio")
//    val novaLista = listOf("marcelo", "marcela")
//    listaArray.addAll(novaLista)
//    listaArray.remove("Joao")
//    listaArray.removeAt(1)
      listaClientes.clear()
      listaClientes.size
    listaClientes.forEach { cliente ->
        println("${cliente.nome} - ${cliente.idade}")
    }
}