package exercicios

fun main() {
    // Peça ao usuário para digitar um número inteiro e informe se ele é par ou ímpar,
    //utilizando o if como expressão.

    println("Digite um numero: ")
    var n = readLine()?.toIntOrNull() ?: 0

    val resultado = if (n % 2 == 0){
        println("Par")
    } else {
        println("Ímpar")
    }
}