package POO.HerancaPolimorfismo

open class Veiculo(val modelo: String) {
    open fun mover() {
        println("$modelo está se movendo...")
    }
}
class Carro(modelo: String) : Veiculo(modelo) {
    override fun mover() {
        println("$modelo está dirigindo.")
    }
}
class Moto(modelo: String) : Veiculo(modelo) {
    override fun mover() {
        println("$modelo está acelerando sobre duas rodas.")
    }
}
fun main() {
    val veiculos = mutableListOf<Veiculo>()
    veiculos.add(Carro("Fusca"))
    veiculos.add(Moto("Harley"))
    println("Modelos:")
    veiculos.forEach { veiculo ->
        println(veiculo.modelo)
    }
    println("")
    println("Mover:")
    veiculos.forEach {
        it.mover()
    }
}