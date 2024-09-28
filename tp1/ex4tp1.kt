package com.example.kotline_programming

open class Forme(var Couleur :String)
{
    open fun afficherCouleur()
    {
        println("votre couleur ${this.Couleur}")
    }
}

class Cercle(Couleur: String, var Rayon :Double) :Forme(Couleur)
{
    fun CalcAire() :Double
    {
        return 3.14 * Rayon * Rayon
    }
    override fun afficherCouleur()
    {
        super.afficherCouleur()
        println("votre aire du cercle est : ${this.CalcAire()}")
    }
}

class Rectangle(Couleur: String,var largeur : Double, var hauteur :Double): Forme(Couleur)
{
    fun CalcAire() :Double
    {
        return  largeur * hauteur
    }
    override fun afficherCouleur()
    {
        super.afficherCouleur()
        println("votre aire du rectangle est : ${this.CalcAire()}")
    }
}

fun main()
{
    var C1 = Cercle("rouge", 200.00)
    var R1 = Cercle("noire",230.00)
    C1.CalcAire()
    C1.afficherCouleur()
    R1.CalcAire()
    R1.afficherCouleur()
}