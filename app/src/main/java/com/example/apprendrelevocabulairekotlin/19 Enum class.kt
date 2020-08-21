package com.example.apprendrelevocabulairekotlin

//[Enum class] est une classe qui nous permet de créer de type données ou de sessions de données
enum class SexeEtudiant(val sex:String){
    MASCULIN("masculin"),
    FEMININ("feminin")
}

class Etudiant(val nom:String, val sexe: SexeEtudiant){
    init {
        println("$nom ${sexe.sex}")
    }
}

fun main() {
    val etudiantA = Etudiant("Musole", SexeEtudiant.MASCULIN)
    val etudiantB = Etudiant("Merry", SexeEtudiant.FEMININ)

    println(etudiantA)
    println(etudiantB)

    for (sex in SexeEtudiant.values()){
        println(sex.name)
        println(sex.ordinal)
    }
}