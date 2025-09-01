package POO

class Carro(val modelo: String, val ano: Int) {
    init {
        require(ano > 1885) { "Ano inválido para um carro" }
        println("Carro $modelo ($ano) criado!")
    }
}
fun main() {
    val c = Carro("Fusca", 1970)
}