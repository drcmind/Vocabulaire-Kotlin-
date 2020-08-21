package com.example.apprendrelevocabulairekotlin

/*
Les boucles consistent à faire passer l'instruiction encore et encore
jusqu'à ce que la condition soit vraie
on va voir commment les boucles: [for], [forEach] et [while] marchent avec Kotlin
 */

fun main() {
    //la boucle [for]
    val liste = listOf("Musole", "Louis", "Blaise", "Gilbert")

    //Pour afficher les éléments de la liste l'un àprès l'autre
    for (noms in liste){
        println(noms)
    }

    //Pour afficher les index et les noms de la liste l'un après l'autre
    for ((index, value) in liste.withIndex()){
        println(index)
        println(value)
    }

    //pour afficher seulement les index
    for (index in liste.indices) {
        println(index)
    }

    //Pour afficher une liste des entiers de 1 à 100 avec la boucle [for]
    for (i in 0..100){
        println(i)
    }

    //Pour afficher une liste des entiers de 0 à 99 avec la boucle [for]
    for(i in 0 until 100){
        println(i)
    }

    //Pour afficher une liste des entiers de 1 à 100 avec l'incrementation de 5
    for (i in 0..100 step 5){
        println(i)
    }

    //Pour afficher une liste des entiers de 100 à 0 avec un decrementation de 2
    for (i in 100 downTo 0 step 2){
        println(i)
    }

    //La boucle [forEach] nous aide à parcourir chaque élément de la liste avec une condition
    liste.forEach {
        if (it == "Musole"){
            println(true)
        }
    }

    liste.forEachIndexed {index, nom ->
        println("$index $nom")
    }

    //La boucle [while]
    var nbre = 0
    while (nbre < 100){
        println(nbre)
        nbre++
    }
}