package aulas

fun main() {
    var idade = 20  // IF "ternário"
    val status = if (idade >= 18) "Adulto" else "Menor"
    println(status)

    val nota = 6.5
    val resultado = if (nota >= 7.0) {
        "Aprovado"
    } else if (nota >= 5.0) {
        "Recuperação"
    } else {
        "Reprovado"
    }
    println(resultado)


    val dia = 3
    when (dia) {
        1 -> println("Segunda")
        2 -> println("Terça")
        3 -> println("Quarta")
        else -> println("Outro dia")
    }
//when como expressão:
    val tipo = when (dia) {
        1 -> "Segunda"
        2 -> "Terça"
        3 -> "Quarta"
        else -> "Outro dia"
    }
    println(tipo)
//when com intervalos
    idade = 25
    when (idade) {
        in 0..12 -> println("Criança")
        in 13..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        else -> println("Idoso")
    }

    val x = 5
    when (x) {
        in 1..3 -> println("De 1 até 3 (inclusive)")   // inclui tanto o 1 quanto o 3
        in 3 until 5 -> println("De 3 até 4")   // inclui o 3 e exclui o 5
        in 10 downTo 5 -> println("De 10 até 5")  // intervalo descrecente incluindo os dois
    }

    val numero = 15
    when {
        numero < 10 -> println("Menor que 10")
        numero in 10..20 -> println("Entre 10 e 20")
        else -> println("Maior que 20")
    }
}

