package com.example.apprendrelevocabulairekotlin

fun main() {
    var nom:String? = "Musole"


    //Elvis Operator ?:
    val length = nom?.length ?: 0

    println(length)
}