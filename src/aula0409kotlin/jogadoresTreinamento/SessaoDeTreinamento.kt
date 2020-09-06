package aula0409kotlin.jogadoresTreinamento

class SessaoDeTreinamento(experiencia: Int) {
    fun treinarA(jogador: JogadorDeFutebol) {
        println("Experiência inicial: ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += 1
        println("Experiência final: ${jogador.experiencia}")
    }
}