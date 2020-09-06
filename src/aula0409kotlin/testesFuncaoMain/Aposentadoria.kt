package aula0409kotlin.testesFuncaoMain

class Aposentadoria(var idade: Int, var sexo: String, var anosDeContribuicao: Int) {
    fun podeSeAposentar() {
        println("Pode se aposentar? ${(sexo == "feminino" && idade >= 60 || sexo == "masculino" && idade >= 65) && anosDeContribuicao >= 30}")
    }
}

fun main() {
    var aposentadoria1 = Aposentadoria(30, "feminino", 10)
    aposentadoria1.podeSeAposentar()
    var aposentadoria2 = Aposentadoria(70, "feminino", 30)
    aposentadoria2.podeSeAposentar()
}