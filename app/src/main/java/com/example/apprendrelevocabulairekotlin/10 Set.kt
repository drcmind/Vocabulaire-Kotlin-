package com.example.apprendrelevocabulairekotlin

//Set : est comme une liste mais avec d'autres options d'avantages que la liste
fun main() {
    val noms = setOf("Musole", "Gilbert", "Blaise", "Louis", "Bukavu")
    val villes = mutableSetOf("Kinshansa", "Lubumbashi", "Bukavu", "Goma", "Blaise")

    //Voici meilleures avantages de [set]
    val unionNomsEtVilles = noms union villes
    println(unionNomsEtVilles)

    val intersectionNomsEtVilles = noms intersect villes
    println(intersectionNomsEtVilles)
}