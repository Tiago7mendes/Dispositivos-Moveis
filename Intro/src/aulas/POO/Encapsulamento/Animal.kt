package POO.Encapsulamento

open class Animal {
    protected fun respirar() {
        println("Animal respirando...")
    }
}
class Cachorro : Animal() {
    fun correr() {
        respirar()
        println("Cachorro correndo!")
    }
}
fun main() {
    val c = Cachorro()
    c.correr()
// c.respirar() -> ERRO: não acessível fora da classe
}