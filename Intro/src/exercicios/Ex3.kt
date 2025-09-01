package exercicios

fun main() {
    // Peça dois números e uma operação (+, -, *, /). Mostre o resultado da operação
    //escolhida. Se a operação for inválida, exiba uma mensagem de erro.

    print("Digite um numero: ")
    val n1 = readLine()?.toDoubleOrNull()

    print("Digite outro numero: ")
    val n2 = readLine()?.toDoubleOrNull()

    print("Digite um operador (+ - * /): ")
    val op = readLine()

    if (n1 == null || n2 == null) {
        println("Erro: você digitou um número inválido.")
        return
    }

    when (op) {
        "+" -> println("Resultado: ${n1 + n2}")
        "-" -> println("Resultado: ${n1 - n2}")
        "*" -> println("Resultado: ${n1 * n2}")
        "/" -> if (n2 != 0.0) println("Resultado: ${n1 / n2}") else println("Erro: não é possível dividir por zero")
        else -> println("Erro: operador inválido!")
    }
}
