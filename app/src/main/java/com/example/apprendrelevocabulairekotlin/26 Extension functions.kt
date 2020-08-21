package com.example.apprendrelevocabulairekotlin

fun main() {
    val nbre = 10
    nbre.arthmetic(2)

    println("----------------------------------------------")
    val nbre2 = 20
    nbre2.arthmetic(2)

    "Musole".midValue()
    "Lul".midValue()
}

fun Int.arthmetic(nbre:Int) {
    println("L'addition de $this et $nbre est ${this.plus(nbre)}")
    println("La soustraction de $this et $nbre est ${this.minus(nbre)}")
    println("La multiplication de $this et $nbre est ${this.times(nbre)}")
}

fun String.midValue() {
    if(this.length % 2 == 0){
        println("ce nom n'a pas de valeur du milieu")
    }else println(this[this.length%2])
}