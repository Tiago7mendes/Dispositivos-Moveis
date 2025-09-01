package aulas

fun soma(numero1: Int = 0, numero2: Int = 0): Int {
    return numero1 + numero2
}

fun somar(vararg numeros: Int): Int {
    var soma = 0
    for (n in numeros) {
        soma += n
    }
    return soma
}

fun exemplo(vararg numeros: Int, mensagem: String) {
    println("Mensagem: $mensagem, Números: ${numeros.joinToString()}")
}

fun String.primeiraMaiuscula(): String {
    return when {
        this.isEmpty() -> this
        else -> this[0].uppercase() + this.substring(1).lowercase()
    }
}

fun main(){
    println(soma(1, 2))
    println(soma())
    println(soma(numero1 = 3, numero2 = 5))
    println(soma(numero2 = 10, numero1 = 5))

    println()
    println(somar(1, 2, 3))
    println(somar(10, 20, 30, 40))
    println(somar())

    println()
    exemplo(1, 2, 3, mensagem = "Teste") // nesse caso eu posso colocar quantos interios eu quiser sem utilizar array

    println()
    val palavra = "kotlin"
    println(palavra.primeiraMaiuscula())
}

