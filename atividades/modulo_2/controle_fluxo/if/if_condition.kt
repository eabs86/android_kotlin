fun main (){
    val tipoDeRota = "TREM"//A_PE, ONIBUS, CARRO, TREM
    if(tipoDeRota=="A_PE"){
        println("Tracando rota a pe")
    } else if (tipoDeRota=="CARRO"){
        println("Tracando rota de carro")
    } else if(tipoDeRota=="ONIBUS"){
        println("Tracando rota de onibus")

    } else {
        println("Nenhum modo escolhido")
    }
}