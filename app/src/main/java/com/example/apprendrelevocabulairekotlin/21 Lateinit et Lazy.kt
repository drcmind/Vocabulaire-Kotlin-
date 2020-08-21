package com.example.apprendrelevocabulairekotlin


fun main() {
    val voiture = Voiture()
    voiture.setValue("Tesla")
    println(voiture.getValue())

    //il y a une allocation de memoire qui se crée à chaque instance
    val utilisateur = DetailUtil("Louis", "25")
    println(utilisateur.toString())

    //il y a une allocation de memoire que lorsque on fait l'affectation
    val utilByLazy : DetailUtil by lazy { DetailUtil("Blaise", "30") }
    println(utilByLazy)//et la variable devient immutable
}

class Voiture {
    //Comment peut-on créer une variable non utiliniatialiser ?
    lateinit var nomVoiture:String

    fun setValue(nomVoit:String){
        nomVoiture = nomVoit
    }

    fun getValue() = if (::nomVoiture.isInitialized) nomVoiture else "Pas encore initialisé"
}

//Notions de Lazy
class DetailUtil(val nom:String, val age:String){
    init {
        println("Le nom est $nom")
        println("L'age est $age")
    }
}