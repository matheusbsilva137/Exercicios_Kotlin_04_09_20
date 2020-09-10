package br.digital.com.exercicio3

class Prova (
        var dificuldade: Int,
        var energiaNecessaria: Int
) {
    init{
        println("Prova de dificuldade ${dificuldade} criada com sucesso!")
    }

    fun podeRealizar(atl: Atleta): Boolean {
        return (atl.nivel >= dificuldade && atl.energia >= energiaNecessaria)
    }
}