package com.example.colections.teste



class Matematica {
    fun somar(n1: Int, n2: Int): Int {
        return 10 + 10
    }

}

//    fun somar(n1: Int, n2: Int): Int {
//        return n1 + n2
//    }
    fun calcular(funcao: (Int, Int)-> Int){

    val retorno = funcao(10, 10)
        println(retorno)
    }

//    fun executar(){
//        println("Executar")
//    }
//
//    fun executar2() = println("Executar")

class Botao {

    fun configCliqBtn(funcao: () -> Unit){
        funcao()
    }
}

fun execCliq(){
    println("Executar o clique")
}


fun main() {


    val btn = Botao()
    btn.configCliqBtn{
        println("Executar o clique")
    }

//    Função Lambda

//    val funclamb = { nome: String, idade: Int ->
//        println("Executar $nome")
//    }
//    funclamb("Leonardo", 1)




//    val matematica = Matematica()
//    calcular(matematica::somar)

//    val matematica = Matematica()
//    val retorno = matematica.somar(10,9)
//      val retorno = somar(10,5)
//      calcular(::somar)
//        println(retorno)
}