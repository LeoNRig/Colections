package com.example.colections.teste

data class Produto(
    var nome: String,
    var preco: Double
){
     fun desativar(){
         println("Produto $nome com preco: $preco foi desativado")
     }
}

fun salvarProduto(produto: Produto){

}

class AlertDialog{

    fun configTitulo(titulo: String) = println(titulo)
    fun configDescricao(descricao: String) = println(descricao)

    fun configCancelar() = println("Acao de cancelar")
    fun configConfirmar() = println("Acao de confirmar")

}

fun main() {

    val alertDialog = AlertDialog()
//    alertDialog.configTitulo("Confirmar o exclusão?")
//    alertDialog.configDescricao("Você tem certerza?")
//    alertDialog.configCancelar()
//    alertDialog.configConfirmar()

//    alertDialog.apply {
//        configTitulo("Confirmar a exclusão")
//        configDescricao("Você tem certeza?")
//        configCancelar()
//        configConfirmar()
//    }

    val lista = listOf("Leonardo","Leo","Coimbra")
    val novaLista = lista
        .map { it.uppercase() }
        .also { println(it) }


//    var produto: Produto? = null
//
//    produto = Produto("Notebook",2500.5)

//    produto?.let {
//        salvarProduto(produto)
//    }
//    produto?.run {
//        desativar()
//    }

//    val novoObjeto = with(produto) {
//        desativar()
//        this
//    }

//    if (produto != null){
//        produto.preco = 1000.00
//        produto.nome = "Alterado"
//        salvarProduto(produto)
//    }

//    val novoProduto = produto?.let {
//        it.preco = 1000.00
//        salvarProduto(produto)
//        it
//    }
//    produto?.let {
//        it.preco = 1000.00
//        salvarProduto(it)
//    }
//
//    println(produto?.nome)
//    println(produto?.preco)

}