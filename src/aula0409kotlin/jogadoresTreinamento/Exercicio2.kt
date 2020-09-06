package aula0409kotlin.jogadoresTreinamento

fun main() {
    var jogador1 = JogadorDeFutebol("Pelé", 100, 200, 2, 10)
    var jogador2 = JogadorDeFutebol("Neymar", 100, 200, 10, 1)
    var sessao1 = SessaoDeTreinamento(1)
    sessao1.treinarA(jogador1)
    sessao1.treinarA(jogador2)
}