package com.example.apprendrelevocabulairekotlin

//[Data class] est une classe utilisée pour contenir des données
data class Utilisateur(val nomUtilisateur: String, val age:Int)

fun main() {
    val utilisateur1 = Utilisateur("Musole", 26)
    val utilisateur2 = Utilisateur("Louis", 36)
    println(utilisateur1)
    println(utilisateur2)

    //Pour afficher seulement le nom d'utilisateur
    println(utilisateur1.nomUtilisateur)
    println(utilisateur1.component2())

    //Pour afficher une copie de l'utilisateur1 avec une certaines modification
    println(utilisateur1.copy(age = 30))

    //Destructuration des données
    val(nom, age) = utilisateur1
    println(nom)
    println("L'utilisateur n°1 s'appelle $nom et son age est $age ans")
}