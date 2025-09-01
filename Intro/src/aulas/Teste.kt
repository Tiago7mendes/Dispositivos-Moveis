package aulas

class Carro(val modelo: String, val ano: Int) {
    init {
        require(ano > 1885) { "Ano inválido para um carro" }
        println("Carro $modelo ($ano) criado!")
    }
}

fun main() {
    println("Teste")
}