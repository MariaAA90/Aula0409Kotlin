package aula0409kotlin.testesFuncaoMain

class Fatorial(var x: Int) {
    fun calcular() {
        var resultado = 1
        for (i in x downTo 1) {
            resultado *= i
        }
        println("O fatorial de $x é $resultado")
    }
}

fun main() {
    var x = Fatorial(10)
    x.calcular()
}