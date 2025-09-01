package POO.HerancaPolimorfismo

interface Trabalhador {
    fun trabalhar()
}
open class Pessoa(val nome: String)
class Professor(nome: String) : Pessoa(nome), Trabalhador {
    override fun trabalhar() {
        println("$nome está dando aula.")
    }
}
class Pedreiro(nome: String) : Pessoa(nome), Trabalhador {
    override fun trabalhar() {
        println("$nome está construindo casas.")
    }
}
fun main(){
    val trabalhadores = mutableListOf<Trabalhador>()
    trabalhadores.add(Professor("João"))
    trabalhadores.add(Pedreiro("Maria"))
    trabalhadores.forEach {
        it.trabalhar()
    }
}