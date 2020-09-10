package br.digital.com.exercicio2

fun main(){
    var jog1 = JogadorDeFutebol("Matheus", 10, 8, 0, 2)
    var jog2 = JogadorDeFutebol("João", 15, 12, 1, 5)
    var treino1 = SessaoDeTreinamento(1)

    treino1.treinar(jog1)
    println()
    treino1.treinar(jog2)
}