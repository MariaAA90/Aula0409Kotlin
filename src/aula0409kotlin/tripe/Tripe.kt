package aula0409kotlin.tripe

class Tripe(var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int) {
    fun definirAltura(novaAltura: Int) {
        alturaAtual = novaAltura
    }

    fun dobrar() {
        dobrado = true
    }

    fun desdobrar() {
        dobrado = false
    }

    fun guardar() {
        dobrar()
        definirAltura(alturaMinima)
    }

    fun prontoParaGuardar(): Boolean {
        return dobrado && alturaAtual == alturaMinima
    }

    fun usar() {
        desdobrar()
        definirAltura(alturaMaxima / 2 + 1)
    }

    fun prontoParaUsar(): Boolean {
        return !dobrado && alturaAtual > alturaMaxima / 2
    }
}