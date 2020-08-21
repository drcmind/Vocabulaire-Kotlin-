package com.example.apprendrelevocabulairekotlin

//Une variable est une case memoire reserve pour stocker une valeur donnée
/*Le mot clé [var] et [val] nous permet de faire la déclaration des variables
[var] est pour la declaration d'une variable mutable
[val] est pour la declaration d'une variable immutable*/

fun main() {
    //declaration et l'affectation
    val nom = "Musole"
    var postNom = "Blaise"

    println(nom)
    println(postNom)

    //nom = "Alain" le mot clé [val] est beaucoup utilisé pour la declaration des constantes
    postNom = "Arlain"
    println(postNom)

    //Le Type en programmation c'est une classe ou section de valeur que peut prendre une variable
    //Voici les differents types de variables en Kotlin
    val byte:Byte =0
    val short:Short = 0
    val int:Int = 0
    val long:Long = 0

    val float:Float = 0F
    val double:Double = 0.0

    val string:String = "String"
    val char:Char = 'C'

    val boolean:Boolean = false

    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)
    println(string)
    println(char)
    println(boolean)
}