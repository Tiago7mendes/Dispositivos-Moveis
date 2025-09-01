package exercicios

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    // Você está programando um jogo e precisa, em todo frame, calcular a distância entre o
    //personagem do(a) jogador(a) com um inimigo. Dados os pontos cartesianos P1 = (x1, y1)
    //representando a localização do(a) jogador(a) e P2 = (x2, y2) representando a posição do
    //inimigo, crie um programa que calcule a distância entre estes dois pontos. Caso o
    //inimigo esteja há uma distância menor ou igual a 5, você deverá mostrar “[ENTRAR NO
    //MODO ATAQUE]”. O cálculo da distância é feito pela fórmula ao lado, em que d representa
    //a distância. Gere números aleatórios entre 0 e 10 para x1, x2, y1 e y2.

    val frames = 5

    for (i in 0..frames) {
        val dist = jogo()
        println("A distancia do inimigo é ${dist}")
        if (dist <= 5){
            println("ENTRAR NO MODO ATAQUE")
        }
    }
}

fun jogo(): Double {
    val x1 = (0..9).random()
    val y1 = (0..9).random()
    val x2 = (0..9).random()
    val y2 = (0..9).random()

    val matriz = 10

    for (i in 0 until matriz){
        for (j in 1..matriz){
            if (x1 == i && y1 == j){
                print("@ ") // heroi
            } else if (x2 == i && y2 == j){
                print("# ") // inimigo
            } else print(". ")
        }
        println()
    }

    val d = sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2))
    return d
}
