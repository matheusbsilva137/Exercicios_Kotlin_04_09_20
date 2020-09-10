package br.digital.com.exercicio3

fun main(){
    var atl1 = Atleta("Matheus", 10, 7)
    var atl2 = Atleta("Jorge", 6, 5)

    var provas : Array<Prova> = arrayOf(
            Prova(6, 6),
            Prova(7, 4),
            Prova(11, 8),
            Prova(2, 2),
            Prova(5, 9),
            Prova(9, 3)
    )

    for (i in 0..5){
        if (provas[i].podeRealizar(atl1)) println("O atleta ${atl1.nome} pode realizar a prova ${i+1}.")
        else  println("O atleta ${atl1.nome} não pode realizar a prova ${i+1}.")

        if (provas[i].podeRealizar(atl2)) println("O atleta ${atl2.nome} pode realizar a prova ${i+1}.")
        else  println("O atleta ${atl2.nome} não pode realizar a prova ${i+1}.")
    }
}