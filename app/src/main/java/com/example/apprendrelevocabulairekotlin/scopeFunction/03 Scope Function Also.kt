package com.example.apprendrelevocabulairekotlin.scopeFunction

fun main() {
    val numeros = mutableListOf("Un", "Deux", "Trois", "Quatre", "Cinq")
    val mapList = numeros.map { it.length }
    println(mapList)

    val resultList = mapList.filter { it > 4 }
    println(resultList)

    //On utilise [Also] pour une chaine d'instruiction sans interruption
    // et sans declaration des variables supplementaires
    numeros.map { it.length }.also { println(it) }.filter { it > 4 }.also { println(it) }

}