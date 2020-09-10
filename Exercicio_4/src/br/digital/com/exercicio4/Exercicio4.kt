package br.digital.com.exercicio4

fun main(){
    var tripe = Tripe(true, 80, 180, 90)

    tripe.desdobrar()
    tripe.dobrar()
    tripe.guardar()
    if (tripe.prontoParaGuardar()) println("Tripe está pronto para guardar!")
    else println("Tripe não está pronto para guardar!")
    tripe.usar()
    if (tripe.prontoParaUsar()) println("Tripe está pronto para usar!")
    else println("Tripe não está pronto para usar!")
    tripe.definirAltura(120)
}