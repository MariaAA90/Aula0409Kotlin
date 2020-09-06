package aula0409kotlin.clientesContas

fun main() {
    var cliente1 = Cliente("Maria Alice", "Armelin")
    var cliente2 = Cliente("Victor", "David Santos")
    var contaAlice = Conta("12345", 3000.5, cliente1)
    var contaVictor = Conta("54321", 2500.3, cliente2)
    contaAlice.deposito(50.0)
    contaAlice.saque(200.0)
    contaVictor.deposito(500.0)
    contaVictor.saque(1500.0)
}