package com.example.apprendrelevocabulairekotlin.scopeFunction

class Person(val nom:String, val postNom:String){
    var adresse:String = "Inconnue"
    var numeroDeTel = "Inconnue"

    fun obtenirInfo() = """
        Nom = $nom
        postNom = $postNom
        adresse = $adresse
        numero de tél = $numeroDeTel
    """.trimIndent()
}

fun main() {

    //On utilise [apply] que lorsqu'on veut initialiser un objet
    //avec [apply] il n'est pas possible de retourne le resultat comme avec [run]
    val person = Person("Musole", "Louis").apply {
        adresse = "Q. Nyamianda Av. Goma n° 15"
        numeroDeTel = "0977330307"
    }

    println(person.obtenirInfo())
}