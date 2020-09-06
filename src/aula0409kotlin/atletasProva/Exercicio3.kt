package aula0409kotlin.atletasProva

fun main() {
    var atleta1 = Atleta("Bruno", 1, 100.0)
    var atleta2 = Atleta("Roberto", 2, 100.0)
    var prova1 = Prova(2, 50.1)
    var prova2 = Prova(3, 48.2)
    var prova3 = Prova(4, 47.6)
    var prova4 = Prova(2, 45.5)
    var prova5 = Prova(1, 44.4)
    var prova6 = Prova(1, 40.0)

    println("O atleta 1 pode realizar a prova 1? ${prova1.podeRealizar(atleta1)}")
    println("O atleta 1 pode realizar a prova 2? ${prova2.podeRealizar(atleta1)}")
    println("O atleta 1 pode realizar a prova 3? ${prova3.podeRealizar(atleta1)}")
    println("O atleta 2 pode realizar a prova 4? ${prova4.podeRealizar(atleta2)}")
    println("O atleta 2 pode realizar a prova 5? ${prova5.podeRealizar(atleta2)}")
    println("O atleta 2 pode realizar a prova 6? ${prova6.podeRealizar(atleta2)}")
}