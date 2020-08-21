package com.example.apprendrelevocabulairekotlin.scopeFunction

fun main() {
    val numeros = mutableListOf("Un", "Deux", "Trois", "Quatre", "Cinq")
    val resultList = numeros.map { it.length }.filter { it > 3 }
    println(resultList)

    val nullableString : String? = "Null"
    if (nullableString != null){
        println(nullableString)
    }

    //On utilise [let] quand on veut effectuer une action en chaine d'instruction
    numeros.map { it.length }.filter { it > 3 }.let { println(it) }

    nullableString?.let { println(it) }
}