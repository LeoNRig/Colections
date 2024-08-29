package com.example.colections.teste

import androidx.core.os.persistableBundleOf


//class Motorista(val nome: String){
//    fun exibirNome()= println("Motorista: $nome")
//
//    inner class Caminhao(val nomeCaminhao: String){ //Nested Class  //Inner Class
//        fun exibirNomeCaminhao() = println("Caminhão: $nomeCaminhao")
//    }
//}

//data class Perguntas(val pergunta: String, val repostasCerta: Int){
//
//}
//class Usuario(){
//    var nome:String = ""
//        get(){
//            println("get:")
//            return field.uppercase()
//        }
//        set(value) {
//            field = "set $value"
//        }
//    var idade: Int = 0
//    val maiorIdade
//        get() = idade >= 18
//}
class Usuario(){
      fun salvarTelefone(vararg telefones: String){
           for (telefone in telefones){
                 println("telefone : $telefone")
           }
      }
}


fun main() {

      val usuario = Usuario()
      usuario.salvarTelefone("")

//      val pessoa = Pessoa()
//      pessoa.salvarTelefone("(27)998262626","(27)998262626","(27)998262626","(27)998262626")


//     val usuario = Usuario()
//     usuario.nome = "Pedro"
//     usuario.idade = 1
//    println("nome ${usuario.nome}, idade ${usuario.idade}, maior de idade: ${usuario.maiorIdade} ")

//    val pessoa = Pessoa()
//    pessoa.nome = "Leonardo"
//    pessoa.idade = 1

//    val pergunta1 = Perguntas("Qual a pergunta certa", 1)
//    val pergunta2 = Perguntas("Qual a pergunta certa", 1)
//
//    val(pergunta, resposta) = pergunta1
//
//    val p = pergunta1.pergunta
//    val r = pergunta1.repostasCerta

//    println( pergunta == pergunta2 )
//    val motorista = Motorista("Leonardo")
//    motorista.exibirNome()
//    val caminhao = Motorista.Caminhao("Valeria")
//    caminhao.exibirNomeCaminhao()

//      val motorista = Motorista("Leonardo")
//      val caminhao = motorista.Caminhao("Valeria")
//      caminhao.exibirNomeCaminhao()




}