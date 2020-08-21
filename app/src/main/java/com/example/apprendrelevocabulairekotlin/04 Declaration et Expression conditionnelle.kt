package com.example.apprendrelevocabulairekotlin
//Avec Kotlin pour faire la declaration conditionnelle on utilise [if/else] ou [when/else]

fun main() {
    val age = 212

    if (age == 18){
        println("Accepté")
    }else println("Rejecté")

    //bonne pratique pour utiliser l'expression [else if] en Kotlin
    when(age){
        18 -> println("Accepté")
        20 -> println("Accepté")
        else -> println("Rejecté")
    }

    val checkAge = 5

    //verification de categorie d'age
    when(checkAge){
        in 1..17 -> println("Vous etes encore mineure")
        in 18..50 -> println("Vous etes adultes")
        else -> println("Vous etes viellard")
    }

    //Expression conditionnelle
    val type :String
    type = when(checkAge){
        in 1..17 -> "Mineure"
        in 18..50 -> "Adultes"
        else -> "Viellard"
    }
    println(type)
}