package aula0409kotlin.veiculosUsados

class Concessionaria {
    val registroVendas = arrayListOf<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        val venda = Venda(cliente, veiculo, valor)
        registroVendas.add(venda)
        println("Vendido ${veiculo.marca} ${veiculo.modelo} do ano ${veiculo.anoFabricacao} por apenas R$ $valor para ${cliente.nome}.")
    }
}