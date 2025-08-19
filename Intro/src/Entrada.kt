fun main() {
    print("Digite seu nome: ")
    val nome = readLine() // retorna um objeto String? podendo retornar um null
    println("Olá, $nome!")

    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull()
    if (idade != null) {
        println("Ano que vem você terá ${idade + 1} anos.")
    } else {
        println("Idade inválida!")
    }

    print("Digite sua idade novamente: ")
    val idadeElvis = readLine()?.toIntOrNull() ?: -1 // agora utilizando o Operador Elvis

    if (idade != -1) {
        println("Ano que vem você terá ${idadeElvis + 1} anos.")
    } else {
        println("Idade inválida!")
    }
    println("A idade Elvis é " + idadeElvis) // pois foi escolhido caso o usuário escolha Null
}