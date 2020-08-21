package com.example.apprendrelevocabulairekotlin

import java.util.*

fun main() {
   val tableau = arrayOf(1,2,3, "Blaise")
    println(tableau.contentToString())

    //affichage d'un seul élément
    println(tableau[3])

    //afficher le premier élément du tableau
    println(tableau.first())

    //afficher le dernier élément du tableau
    println(tableau.last())

    //Mise à jour d'un élément du tableau
    tableau[0] = 12
    println(tableau.contentToString())

    //afficher l'index/la position d'un élément dans le tableau
    val indexElement = tableau.indexOf("Blaise")
    println(indexElement)

    //affichage de la somme des éléments du tableau
    val tableauInt = intArrayOf(10,2,30,4,5,6,40,70,700,100)
    println(tableauInt.sum())

    //Affichage de nombre le plus grand du tableau
    println(tableauInt.max())

    //Affichage de nombre le plus petit du tableau
    println(tableauInt.min())

    //Affichage de compte d'éléments du tableau
    println(tableauInt.count())

    //Affichage d'un tableau trié ordre croissant
    println(tableauInt.sortedArray().contentToString())

    //Affichage d'un tableau trié ordre decroissant
    println(tableauInt.sortedArrayDescending().contentToString())

    //Afficher les nombres pairs
    val nombrePair = tableauInt.find {
        it % 2 == 0
    }
    println(nombrePair)

    //Afficher les nombres impairs
    val nombreImpair = tableauInt.find {
        it % 2 != 0
    }
    println(nombreImpair)
}