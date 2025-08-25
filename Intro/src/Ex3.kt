fun main() {
    // Peça dois números e uma operação (+, -, *, /). Mostre o resultado da operação
    //escolhida. Se a operação for inválida, exiba uma mensagem de erro.

    println("Digite um numero: ")
    val n1 = readLine()?.toIntOrNull() ?: Double.NaN

    println("Digite um numero: ")
    val n2 = readLine()?.toIntOrNull() ?: Double.NaN

    println("Digite um operador(+ - / *): ")
    val op = readLine()

    when (op) {
        "+" -> println("Resultado ${n1 + n2}")
        "-" -> println("Resultado ${n1 - n2}")
        "/" -> if (n2 != 0) println("Resultado ${n1 / n2}") else println("O numero dois não pode ser 0")
        "*" -> println("Resultado ${n1 * n2}")
        else println("Erro ao digitar o operador!")
    }
}
