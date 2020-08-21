package com.example.apprendrelevocabulairekotlin

fun main() {
    Evenement("Musole")
    Evenement(266)
    Evenement(true)
    Event<String, Int>()
    Event(33, "T")
}
class Evenement<T>(value: T){
    init {
        println(value.toString().length)
    }
}

class Event<T, V>(value: T? = null, data: V? = null){
    init {
        if (value != null) value.toString().length else println("Parametre vide")
    }
}