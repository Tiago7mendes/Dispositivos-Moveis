fun main() {
    // Escreva um programa que leia três números inteiros e indique qual o menor valor dentre
    //eles.

    var menor: Int? = null // valor indefinido

    for (i in 1..3) {
        print("Digite um numero: ")
        val n = readLine()?.toIntOrNull() ?: 0

        if (menor == null || n < menor) {
            menor = n
        }
    }

    println("O menor numero digitado foi $menor")
}