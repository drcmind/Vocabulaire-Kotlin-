package com.example.apprendrelevocabulairekotlin

fun main() {
    //Notion de paires
    val pair = Pair("Musole", 26)
    println(pair)

    val pairSalutation = Pair("Bonjour", "Louis")
    println(pairSalutation)

    val(nom, postNom) = Pair("Musole", "Louis")
    println(nom)
    println(postNom)

    //Conversion en list
    val pairEnList = pair.toList()
    println(pairEnList[0])
    println(pairEnList[1])

    //Notion des triples
    val triples = Triple("Musole", "Louis", 25)
    println(triples)

    val(nom1, postNom1, age) = Triple("Musole", "Louis", 25)
    println(nom1)
    println(postNom1)
    println(age)
    println("Nom: ${triples.first} postNom: ${triples.second} age: ${triples.third}")

    val listeTriple = triples.toList()
    println(listeTriple)
}