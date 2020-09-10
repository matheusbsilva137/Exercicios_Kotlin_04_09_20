package br.digital.com.exercicio3

class Atleta (
        var nome: String,
        var nivel: Int,
        var energia: Int
){
    init{
        println("Atleta $nome pronto para a prova!")
    }
}