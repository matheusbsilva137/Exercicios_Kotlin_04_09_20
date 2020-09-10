package br.digital.com.exercicio2

class SessaoDeTreinamento (var experiencia: Int){
    fun treinar(jog: JogadorDeFutebol){
        println("Experiência inicial de ${jog.nome}: ${jog.experiencia}")
        jog.correr()
        jog.fazerGol()
        jog.correr()
        jog.experiencia += experiencia
        println("Experiência final de ${jog.nome}: ${jog.experiencia}")
    }
}