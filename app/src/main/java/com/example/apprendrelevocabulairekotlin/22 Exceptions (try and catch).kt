package com.example.apprendrelevocabulairekotlin

fun main() {
    //création d'une exception
    val age = 15
   try {
       getAge(age)
   }catch (e:Exception){
       println(e)
   }finally {
       println("Appelation de la methode finally")
   }

    println("Le programme fonctionne toujours...")
}

fun getAge(age: Int){
    if (age < 18){
        throw ExceptionAge(age)
    }
}
//Exception personnalisée
class ExceptionAge(val age:Int) : Exception("$age non valide")