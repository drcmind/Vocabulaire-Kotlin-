package com.example.apprendrelevocabulairekotlin.scopeFunction

class Personne(val nom:String, val postNom:String){
    var adresse:String = "Inconnue"

    fun obtenirInfo() = """
        Nom = $nom
        postNom = $postNom
        adresse = $adresse
    """.trimIndent()
}

fun main() {
    //On utilise [run] quand on veut initialiser un objet et retourner le resultat
    val info = Personne("Musole", "Louis").run {
        adresse = "Q. Nyamianda Av. Goma n°15"
        obtenirInfo()
    }
    println(info)
}