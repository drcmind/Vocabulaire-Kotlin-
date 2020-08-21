package com.example.apprendrelevocabulairekotlin

fun main() {
    println(nbreAuCarrE1(2))

    //fonction lambda
    val nbreAuCarrE2 : (Int) -> Int = {nbre ->
        nbre * nbre
    }
    //Appelation de la fonction lambda
    println(nbreAuCarrE2(5))

    //fonction lambda qui retourne rien
    val afficheNom : (String) -> Unit = {
        println(it)
    }

    afficheNom("Musole")
}

//fonction ordinaire
fun nbreAuCarrE1(nbre:Int) = nbre * nbre