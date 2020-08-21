package com.example.apprendrelevocabulairekotlin

/*On utilise le mot clé [fun] pour créer une fonction en Kotlin
main() c'est la fonction principale*/

fun main(){
  //Appelation
    direBonjour()
    direBonjour("Musole")
    println(retourneBonjour())
    println(retourneBonjour("Blaise"))
    println(addition(2,3))
    println(multiplicationPar2(8))
    println(salutation(nom = "Louis", salutation = "Bonjour"))
    println(salutation2(nom = "le monde", salutation = "Bonjour"))
}

//fonction sans paramètre qui retourne rien
fun direBonjour(){
    println("Bonjour")
}

//fonction sans paramètre qui retourne une valeur
fun retourneBonjour() : String {
    return "Bonjour"
}

//fonction avec paramètre qui ne retourne rien
fun direBonjour(nom:String) {
    println("Bonjour $nom")
}

//fonction avec paramètre qui retourne une valeur
fun retourneBonjour(nom:String):String {
    return "Bonjour $nom"
}

//fonction avec plusieurs paramètres
fun addition(a:Int, b:Int) : Int {
    return a.plus(b)
}

//fonction avec un paramètre par défaut
fun multiplicationPar2(x:Int, y:Int=2) : Int {
    return x.times(y)
}

// fonction avec un paramètre nominé
fun salutation(salutation:String, nom:String) : String {
    return "$salutation $nom"
}

//fonction d'expresion unique
fun salutation2(salutation: String, nom: String) = "$salutation $nom"