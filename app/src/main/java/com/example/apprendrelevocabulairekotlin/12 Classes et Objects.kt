package com.example.apprendrelevocabulairekotlin

/*
[classe] est une maquette (model) nous permettant de créer des objects
[Object] est une instance (implementation) d'une classe
 */

fun main() {
   //creation d'un object
    val person = Person()
    person.personne("Musole", 26)
    println(person.nom)
    println(person.age)
}

//Voici la declaration d'une classe
class Person{
    //Propriète d'une classe
    var nom = ""
    var age = 0

    //Une ou plusieurs fonctions/methodes
    fun personne(name:String, agE:Int){
        nom = name
        age = agE
    }
}