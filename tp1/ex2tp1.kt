package com.example.kotline_programming

class Animal(var nom :String, var age : Int)
{
    init {
        if (!(age in 0..30 ))
        {
            throw IllegalArgumentException("age est incorrect !!")
        }
    }
    fun afficherDetails(){
        println(" le nom et l'âge de l'animal est ${this.nom} , ${this.age} ans")
    }
}

fun main()
{
    var A1 = Animal("YASSINE", 20)
    var A2 = Animal("HAMZA", 21)
    A1.afficherDetails()
    A2.afficherDetails()
}