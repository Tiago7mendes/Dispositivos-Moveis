package POO.HerancaPolimorfismo

abstract class Animal {
    abstract fun falar()
    fun dormir() = println("Dormindo...")
}

class Cachorro : Animal() {
    override fun falar() {
        println("Au au!")
    }
}

class Gato : Animal() {
    override fun falar() {
        println("Miau!")
    }
}
fun main() {
    val c : Animal = Cachorro()
    val g : Animal = Gato()
    c.dormir()
    c.falar()
    g.dormir()
    g.falar()
}