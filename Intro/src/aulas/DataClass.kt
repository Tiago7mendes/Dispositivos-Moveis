package aulas

data class Pessoa(val nome: String, val idade: Int)

// a data class ja cria metodos para deixar mais produtivo.
// metodos como: toString(), equals(), hashCode() e copy()

fun main() {
    val p1 = Pessoa("Ana", 20)
    val p2 = Pessoa("Ana", 20)
    val p3 = p1.copy(idade = 21)
    println(p1) // Pessoa(nome=Ana, idade=20)
    println(p1 == p2) // true (comparação por valores)
    println(p3) // Pessoa(nome=Ana, idade=21)
}
