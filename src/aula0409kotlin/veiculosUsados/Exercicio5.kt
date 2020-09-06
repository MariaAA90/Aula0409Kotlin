package aula0409kotlin.veiculosUsados

fun main() {
    var carro = Veiculo("Ford", "Ka", 2019, "Prata", 50.5f)
    var cliente = Cliente("Maria", "Armelin", "ma_armelin@hotmail.com")
    var concessionaria = Concessionaria()

    concessionaria.registrarVenda(carro, cliente, 50000.0)
}