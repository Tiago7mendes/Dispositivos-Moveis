fun main() {
    // Escreva um programa que leia três números inteiros e indique qual o menor valor dentre
    //eles.

    for (i in 1..3){
        var menor
        println("Digite um numero: ")
        var n = readLine()?.toIntOrNull() ?: 0

        if (i == 1) {
            menor = n
        } else {
            if (menor > n) menor = n
        }
    }

    println("O menor numero digitado foi $menor")
}