package POO.Encapsulamento

class ContaBancaria(private var saldo: Double) {
    fun depositar(valor: Double) {
        if (valor > 0) saldo += valor
    }
    fun mostrarSaldo() {
        println("Saldo: R$ $saldo")
    }
}
fun main() {
    val conta = ContaBancaria(100.0)
    conta.depositar(50.0)
    conta.mostrarSaldo()
// conta.saldo -> ERRO: não acessível
}