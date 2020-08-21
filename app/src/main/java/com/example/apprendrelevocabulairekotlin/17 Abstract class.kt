package com.example.apprendrelevocabulairekotlin

//[Abstraction] consiste à se consentrer sur le necessaire et non sur le détail
abstract class Ordinateur() {
    abstract fun systemeDexploitation() : String
}

class Asus : Ordinateur() {
    override fun systemeDexploitation(): String {
        return "Windows 10"
    }
}

class MacAir : Ordinateur(){
    override fun systemeDexploitation(): String {
        return "iOS 14"
    }
}

fun obtenirSE(ordinateur: Ordinateur) = ordinateur.systemeDexploitation()
fun main() {
    val asus = Asus()
    println(asus.systemeDexploitation())

    val macAir = MacAir()
    println(macAir.systemeDexploitation())

    println(obtenirSE(asus))
    println(obtenirSE(macAir))
}