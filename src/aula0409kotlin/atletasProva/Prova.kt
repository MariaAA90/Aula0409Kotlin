package aula0409kotlin.atletasProva

class Prova(var dificuldade: Int, var energiaNecessaria: Double) {
    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }
}