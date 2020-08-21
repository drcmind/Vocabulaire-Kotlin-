package com.example.apprendrelevocabulairekotlin

open class BaseAddition(val num1:Int, val num2:Int){
    open fun add() = num1.plus(num2)
}

class Addition(val numero1:Int, val numero2:Int, val numero3:Int) : BaseAddition(numero1, numero2){
    //on a aussi la possibilité de modifier la methode heritée
    override fun add(): Int {
        return numero1.plus(numero2).plus(numero3)
    }
}

fun main() {
    val addition = Addition(5,5, 2)
    println(addition.add())
}