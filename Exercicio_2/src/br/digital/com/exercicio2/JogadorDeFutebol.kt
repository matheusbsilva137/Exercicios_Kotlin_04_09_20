package br.digital.com.exercicio2

class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    init{
        println("O jogador $nome está pronto para jogar!")
    }

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOL do $nome!")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }
}