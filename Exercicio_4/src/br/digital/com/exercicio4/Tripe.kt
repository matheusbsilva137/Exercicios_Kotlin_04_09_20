package br.digital.com.exercicio4

class Tripe (var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int) {
    init{
        println("Criado tripé com altura atual de $alturaAtual cm, altura máxima de $alturaMaxima cm e altura mínima de $alturaMinima cm.")
        if (dobrado) println("O tripé está dobrado!")
        else println("O tripé não está dobrado!")
        println()
    }

    fun definirAltura(novaAltura: Int){
        alturaAtual = novaAltura
        estadoTripe()
    }

    fun dobrar(){
        dobrado = true
        estadoTripe()
    }

    fun desdobrar(){
        dobrado = false
        estadoTripe()
    }

    fun guardar(){
        dobrado = true
        alturaAtual = alturaMinima
        estadoTripe()
    }

    fun prontoParaGuardar() : Boolean{
        return (dobrado && alturaAtual == alturaMinima)
    }

    fun usar(){
        dobrado = false
        alturaAtual = (alturaMaxima/2) + 1
        estadoTripe()
    }

    fun prontoParaUsar() : Boolean{
        return (!dobrado && alturaAtual > (alturaMaxima/2))
    }

    fun estadoTripe(){
        println("Tripé com altura atual de $alturaAtual cm.")
        if (dobrado) println("O tripé está dobrado!")
        else println("O tripé não está dobrado!")
        println()
    }
}