package com.example.apprendrelevocabulairekotlin

//on va convertir cette classe en objet pour avoir une meme instance (Singleton)
object UserProfil{
    fun addition(a:Int, b:Int) = a.plus(b)
}

fun main() {

    println(UserProfil.toString())
    println(UserProfil.toString())

    //pas besoin d'une instance lors de l'appelation comme une classe
    println(UserProfil.addition(2,3))
}