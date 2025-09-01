package aulas

import java.lang.Math.pow
import kotlin.random.Random
import kotlin.math.*

fun main() {
    print("Digite sua idade: ")
    val idade = readln().toIntOrNull() ?: 0
    println("Você tem $idade anos")

    val nome = " Kotlin "
    println(nome.trim())
    println(nome.uppercase())
    println(nome.lowercase())
    println(nome.length)
    println("Olá, ${nome.trim()}!")

    println(abs(-10)) // math
    println(sqrt(16.0))
    println(pow(2.0, 3.0))
    println(round(3.7))
    println(hypot(3.0, 4.0))

    println(Random.nextInt(10)) // random
    println((1..6).random())

    //● Random.nextInt(n) → número entre 0 e n-1
    //● Random.nextInt(a, b) → número entre a e b-1
    //● Random.nextDouble() → número decimal entre 0.0 e 1.0
    //● (range).random() → valor aleatório dentro de um intervalo
}