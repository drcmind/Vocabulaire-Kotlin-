package com.example.apprendrelevocabulairekotlin

//Higher order function est une fonction qui prend en paramètre une fonction lambda et qui
// retourne une fonction
fun main() {
    val addition = faireAddition()
    println(addition(2,3))

    afficheMonNom {
        println("Musole")
    }

    affichage {
       println(it)
    }
}

fun faireAddition() : (Int, Int) -> Int {
    return ::ajoutNbres
}

fun ajoutNbres(nbre1:Int, nbre2:Int) = nbre1.plus(nbre2)

fun afficheMonNom(print:()-> Unit) {
    print()
}

fun affichage(print: (String) -> Unit) {
    print("Blaise")
}