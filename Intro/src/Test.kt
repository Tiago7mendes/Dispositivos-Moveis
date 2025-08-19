fun main(){
// em Kotlin tudo é objeto

    val nome = "Maria" // valor: val é um objeto imutável
    var idade = 25 // variável: var é um objteo mutável
    val altura: Double = 1.68
    println("Nome: $nome, Idade: $idade, Altura: $altura metros")
    idade += 1
    println("Ano que vem, $nome terá $idade anos.")

// compareTo funciona igual o Java
    println("Comparação: ${idade.compareTo(26)}") // retorna 0, pois é igual
    println("Comparação: ${idade.compareTo(23)}") // retorna 1, pois é menor
    println("Comparação: ${idade.compareTo(27)}") // retorna -1, pois é maior
}