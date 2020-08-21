package com.example.apprendrelevocabulairekotlin

interface Computer {
    fun systemeDexploitation() : String
    fun dateDeCreation() : Int
    fun creE() = "ABC"
}

interface typeComputer {
    fun modelComputer() : String
}

class Hp() : Computer, typeComputer {
    override fun systemeDexploitation(): String {
        return "Windows 10"
    }

    override fun dateDeCreation(): Int {
       return 2020
    }

    override fun modelComputer(): String {
        return "Elite Probook"
    }
}

fun main() {
    val hp = Hp()
    println(hp.systemeDexploitation())
    println(hp.dateDeCreation())
    println(hp.creE())
    println(hp.modelComputer())
}