package aula0409kotlin.testesFuncaoMain

class Multiplicacao(var listaDeNumeros: IntArray) {
    fun produto() {
        var resultado = 1
        for (numero in listaDeNumeros) {
            resultado *= numero
        }
        println("O resultado da multiplicação no array é $resultado")
    }
}

fun main() {
    var conta = Multiplicacao(intArrayOf(4, 5, 6, 7))
    conta.produto()
}