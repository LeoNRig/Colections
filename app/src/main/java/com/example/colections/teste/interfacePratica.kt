package com.example.colections.teste

import java.io.Serializable

//DRY -> Dont Repeat Yourself (Não repita código)
//Divisão de Responsabilidade
//Classes devem UTILIZAR outras classes
//Baixo Acoplamento
class Musico(private val instrumento: Instrumetos){

    fun tocar(){
        println("Musico tocando")
        instrumento.sendoTocado()
//        instrumento.tocandoBaterias()
    }

}
// Herança e Interface (Contrato) -> Composição
interface Instrumetos {
      fun sendoTocado()
}
// Int e String - tipos: Violao e Bateria
class Violao: Instrumetos{
    override fun sendoTocado(){
        println("Utilizando cordas")
        println("Para tocar violão")
    }
    fun ajustarCorda(){

    }
}

class Bateria: Instrumetos{
    override fun sendoTocado(){
        println("Utilizando Baquetas")
        println("para tocar a bateria")
    }
    fun ajustaBaqueta(){
        println("Ajustar Baquetas")
    }
}

class Guitarra: Instrumetos{
    override fun sendoTocado() {
        println("Utilizando cordas")
        println("Ajustes")
        println("para tocar guitarra")
    }
}

class Fornecedor: Serializable{

}

class Intent {
    fun putExtra(chave: String, serializable: Serializable){

    }
}


fun main() {
    val fornecedor = Fornecedor()//Fornecedor, Serializable
    val intent = Intent()
    intent.putExtra("fornecedor", fornecedor)

//    val violao: Instrumetos = Violao()
//    val bateria: Instrumetos = Bateria()

// Tela1 (tocando violao)
//    val violao1 = Violao()
//    val musico1 = Musico(violao1)
//    musico1.tocar()
//    println("***********")
//    // Tela2
//    val violao2 = Violao()
//    val musico2 = Musico(violao2)
//    musico2.tocar()
//    println("***********")
//    // Tela3
//    val bateria1 = Bateria()
//    val musico3 = Musico(bateria1)
//    musico3.tocar()
//    println("***********")
//    //Tela4
//    val guitarra1 = Guitarra()
//    val musico4 = Musico(guitarra1)
//    musico4.tocar()

}