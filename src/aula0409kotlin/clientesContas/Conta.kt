package aula0409kotlin.clientesContas

class Conta(val numero: String, var saldo: Double, var titular: Cliente) {
    fun deposito(quantiaDinheiro: Double) {
        saldo += quantiaDinheiro
        println("Depósito realizado. Novo saldo é de: $saldo")
    }

    fun saque(quantiaDinheiro: Double) {
        if (quantiaDinheiro > saldo) {
            println("Saldo insuficiente.")
            return
        }
        saldo -= quantiaDinheiro
        println("Saque realizado. Novo saldo é de: $saldo")
    }
}