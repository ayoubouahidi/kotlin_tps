package com.example.kotline_programming

class CompteBancaire(var titulaire :  String, var solde : Double)
{
    fun depot(argent :Double)
    {
          this.solde += argent
    }

    fun retrait(argent: Double)
    {
        if (this.solde >= argent)
        {
            this.solde -= argent
        }
        println("votre sold est insufissant !")

    }

    fun  afficherSolde()
    {
        println("votre solde est : ${this.solde}  DH" )
    }
}

fun main()
{
    var P1 = CompteBancaire("Ayoub",20000.00)
    println("pour commencer cliquer sur 1 ou 0 pour arrater !")
    var choix: Int = readLine()!!.toInt()
    if (choix == 1) {
        println("Bonjour ${P1.titulaire}\n  entrer votre choix (-1 ou entre  1 et 3 ) : \n 1)ajout l'argent a votre compte \n 2)retirer d'argent \n 3)affiche du sold\n-1)pour quiter le programme ")
        while (choix != -1) {
            var choix: Int = readLine()!!.toInt()
            when (choix) {
                1 -> {
                    println("entrer l somme que vous voulez ajoutez :")
                    var Argent: Double = readLine()!!.toDouble()
                    P1.depot(Argent)
                    println("votre amount d'argent est rectifier ")
                }
                2 -> {
                    println("entrer l somme que vous voulez retirer  :")
                    var Argent: Double = readLine()!!.toDouble()
                    P1.retrait(Argent)
                    println("votre amount d'argent est rectifier ")
                }
                3 -> {
                    P1.afficherSolde()
                }
                -1 -> break
                else -> println("votre input est incorrect")
            }
        }
    }
}