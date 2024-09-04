package com.example.colections.teste


class TomadaAntiga(val conector: Conector){
    fun passaEnergia(){
        val qtdPinos = conector.quantidadePinos()
        if (qtdPinos == 2){
            conector.ligarAparelho()
            println("Quantidade de pinos: $qtdPinos")
            println("passando energia")
        }else{
            println("Essa tomada só funciona com 2 pínos, você passou $qtdPinos")
        }

    }

}

interface Conector{
    fun quantidadePinos(): Int
    fun ligarAparelho()
}

class ConectarPadrao: Conector{
    override fun quantidadePinos(): Int{
        return 3
    }
    override fun ligarAparelho(){
        println("aparelho está ligado")
    }
}
class conectorAdapter(val conectorPadrao: ConectarPadrao): Conector{
    override fun quantidadePinos(): Int{
        return 2
    }

    override fun ligarAparelho() {
        conectorPadrao.ligarAparelho()
    }
}


fun main() {

    val conectorPadrao = ConectarPadrao()

    val conectorAdapter = conectorAdapter(conectorPadrao)

    val tomadaAntiga = TomadaAntiga(conectorPadrao)
    tomadaAntiga.passaEnergia()

}


