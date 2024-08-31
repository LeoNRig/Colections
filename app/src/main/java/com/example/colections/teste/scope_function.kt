package com.example.colections.teste

class Pessoa{
    val nome:String = ""//Escopo Local
}

var nome = "Leonardo"//Escopo Global

fun executar(){
//    val nome = ""//Escopo Local
    nome = "Executado"
}

fun main() {
//
//    val nome = Pessoa()
//    nome.nome
}