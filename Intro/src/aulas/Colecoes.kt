package aulas

fun main() {

    // list
    val nomes = listOf("Ana", "Bruno", "Carlos", "Ana") // lista imutavel
    println(nomes[0])
    println(nomes.size)
    println()

    val numeros = mutableListOf(1, 2, 3) // lista mutavel
    numeros.add(4)
    numeros.remove(2)
    println(numeros)
    println()

    val numerosVazio = mutableListOf<Int>() // lista mutavel vazia
    numerosVazio.add(4)
    numerosVazio.add(2)
    numerosVazio.remove(2)
    println(numerosVazio)
    println()

    // set
    val conjunto = setOf("maçã", "banana", "maçã", "laranja") // set imutavel
    println(conjunto)
    println()

    val numerosSet = mutableSetOf(10, 20, 30) // set mutavel
    numerosSet.add(20)
    numerosSet.add(40)
    println(numerosSet)
    println()

    val numerosSetVazio = mutableSetOf<Int>() // set mutavel vazio
    numerosSetVazio.add(20)
    numerosSetVazio.add(20)
    numerosSetVazio.add(40)
    println(numerosSetVazio)
    println()

    // map
    val capitais = mapOf("SP" to "São Paulo", "RJ" to "Rio de Janeiro") // map imutavel
    println(capitais["SP"])
    println()

    val estoque = mutableMapOf("arroz" to 10, "feijão" to 5) // map mutavel
    estoque["macarrão"] = 7
    estoque["arroz"] = 15
    println(estoque)
    println()

    // array
    val numerosArray = arrayOf(10, 20, 30)
    numerosArray[1] = 99
    println(numerosArray.joinToString())
}