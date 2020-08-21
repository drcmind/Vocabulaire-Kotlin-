package com.example.apprendrelevocabulairekotlin

//Map: C'est une collection des données [clé-valeur] un peu comme un document Json
/*
Il existe deux types de maps en kotlin
le map mutable et immutable tel que [val] et [var]
 */

fun main() {
    val mapAgeImmutable = mapOf("Musole" to 26, "Blaise" to 90)
    var mapAgeMutable = mutableMapOf("Louis" to 23, "Musole" to 30, "Kyata" to 16)

    println(mapAgeImmutable)
    println(mapAgeMutable)

    //Afficher l'age de Musole
    println(mapAgeMutable["Musole"])

    //Pour afficher le nombre des elements du map
    println(mapAgeMutable.count())
    println(mapAgeMutable.size)

    //pour afficher le nombre des éléments du map avec une  condition
    println(mapAgeMutable.count {
        it.value > 26
    })

    //Pour ajouter un élément dans le map
    mapAgeMutable["Sadiki"] = 26
    println(mapAgeMutable)

    //Pour retirer/supprimer un élément dans le map
    mapAgeMutable.remove("Musole")
    println(mapAgeMutable)

    //Pour verifier
    println(mapAgeMutable.containsKey("Musole"))
    println(mapAgeMutable.containsValue(16))

    //Pour filtrer un map par le key & value
    println(mapAgeMutable.filter {
        it.key == "Sadiki" || it.value == 36
    })

    //Pour filtrer un map seulement par le key
    println(mapAgeMutable.filter {
        it.key == "Sadiki"
    })

    //Pour filtrer un map seulement par le value
    println(mapAgeMutable.filter {
        it.value == 36
    })

    //Pour afficher seulement les values du map
    println(mapAgeMutable.values)

    //Pour afficher seulement les keys du map
    println(mapAgeMutable.keys)

    //Pour le tri croissant
    println(mapAgeMutable.toSortedMap())

}