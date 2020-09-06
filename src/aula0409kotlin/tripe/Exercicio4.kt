package aula0409kotlin.tripe

fun main() {
    val tripe = Tripe(true, 2,4,3)

    tripe.desdobrar()
    println("Este tripé está desdobrado")
    tripe.definirAltura(5)
    println("A nova altura é: ${tripe.alturaAtual}")
    tripe.dobrar()
    println("Este tripé está dobrado")
    tripe.guardar()
    println("Este tripé está dobrado e tem altura mínima estabelecida")
    println("O tripé está pronto para guardar? ${tripe.prontoParaGuardar()}")
    println("O tripé está pronto para usar? ${tripe.prontoParaUsar()}")
    tripe.usar()
    println("O tripé está desdobrado e tem sua nova altura maior que metade da altura máxima")
}