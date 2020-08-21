package com.example.apprendrelevocabulairekotlin

//Liste :  est comme un tableau dynamique
/*Dans un tableau, il n'est pas possible d'ajout ou supprimer un
élémént mais avec une liste cela devient possible
Il existe deux types de liste en Kotlin
La liste mutable et Immutable tel que [val] et [var]
 */

fun main() {
    //Declaration et Affectation d'une liste
    val listImmutable = listOf(1,2,3,4,5)
    var listMutable = mutableListOf(1,2,3,4,5,6,7)

    println(listImmutable)
    println(listMutable)

    listMutable = mutableListOf(1,2,3,4,5,66,85,25,48,322)
    println(listMutable)

    //Ajout d'un élément dans la liste
    listMutable.add(11)
    listMutable[0] = 10 //Mise à jour d'un élément de la liste
    println(listMutable)

    //Retirer/Supprimer un élément dans la liste
    listMutable.remove(66)
    println(listMutable)

    //Vérification d'un élément dans la liste
    println(listMutable.contains(50))
    println(listMutable.contains(10))

    //Utilisez la fonction [map] pour appliquer quelques modification de la liste
    val nbreCarreDelaListe =  listMutable.map {
        it * it
    }
    println(nbreCarreDelaListe)

    //Utlisez la fonction [slice] ou [subList] pour trancher les éléments dans la liste
    val sliceListe = listMutable.slice(0..5)
    val subList = listMutable.subList(0,5)
    println(sliceListe)
    println(subList)

    //Utilisez la fonction [take] pour la subdivision des éléments de la liste
    val takeList = listMutable.take(5)
    val takeLastList = listMutable.takeLast(5)
    println(takeList)
    println(takeLastList)

    //verifion si la liste est vide ou pas
    println(listMutable.isEmpty())

    //Affichage de tri croissant et decroissant de la liste
    println(listMutable.sorted()) //Croissant
    println(listMutable.sortedDescending()) //Descroissant
}