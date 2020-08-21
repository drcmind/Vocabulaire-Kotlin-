package com.example.apprendrelevocabulairekotlin

fun main(){
    //Instance de la classe pour la creation d'object
    val footballeur1 = ActualiteFoot("Christiano", "Real Madrid", "Juventus")
    val footballeur2 = ActualiteFoot("Neymar", "Barcelone", "PSG")

    println("Le footballeur ${footballeur1.nomFootballeur} ${footballeur1.equipesFootballeur}")
    println("Le footballeur ${footballeur2.nomFootballeur} ${footballeur2.equipesFootballeur}")

    //Appelation de la fonction se trouvant en [companion objet]
    val sommeAetB = ActualiteFoot.addition(10, 20)
    println(sommeAetB)
}

//classe avec construiteur
class ActualiteFoot(val nom:String, val acienneEquipe:String, val actuelleEquipe:String){
    //Propriète de la classe
    val nomFootballeur = nom
    val equipesFootballeur = "Acienne equipe $acienneEquipe actuellement à $actuelleEquipe"

    init {
        println("Bienvenue...")
    }

    init {
        println("Chargement...")
    }

    //Pour créer une fonction qui ne dépend pas de la valeur des variables en construicteur de la classe
    companion object {
        fun addition(a:Int, b:Int) = a.plus(b)
    }

}