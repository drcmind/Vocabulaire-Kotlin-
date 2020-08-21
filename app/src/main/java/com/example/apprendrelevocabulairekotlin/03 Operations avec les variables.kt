package com.example.apprendrelevocabulairekotlin

fun main() {
    val nbreEntier = 300
    val nbreDecimal = nbreEntier.toDouble()

    println(nbreEntier)
    println(nbreDecimal)

    //Addition de 2 nombres
    val a = 10
    val b = 20
    val resultat = a.plus(b)
    println(resultat)

    //De la concatenation au template
    val nom = "Musole"
    val post = "Louis"
    println("$nom $post")

    //Pour afficher les caractères du postNom Louis
    println(post.length)

    //Pour afficher seulement le premier caractère du postNom
    println(post[0])

    //Pour afficher le nom en majuscule
    println(post.toUpperCase())

    //Pour afficher le nom en miniscule
    println(post.toLowerCase())

    //Une variable qui a une valeur d'une phrase ayant plusieurs lignes
    val phrase = """ Je suis une phrase qui contient plusieurs
                     lignes en Kotlin
    """.trimIndent()

    println(phrase)
}