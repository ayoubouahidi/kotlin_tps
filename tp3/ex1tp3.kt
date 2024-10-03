package com.example.kotline_programming

enum class Pays{
    PALESTINE, MAROC, TUNISIE, ALGERIE ,MOURITANIE
}

enum class Equipe{
    OCS, OCK, RCA, WAC
}

data class Joueur(var nom : String, var num : Int, var equipe : String, var nbrPoints :Int) {
}

class Equipe_Final(var Joueurs :MutableList<Joueur> , var  Equipe: Equipe, var pays: Pays)
{
    fun ajout(j : Joueur) : Boolean
    {
        if(Joueurs.contains(j))
        {
            return false
        }
        Joueurs.add(j)
        return true
    }

    fun Recherche(j : Joueur) : Int
    {
        for (i in Joueurs)
        {
            if (i.num == j.num)
            {
                return Joueurs.indexOf(i)
            }
        }
        return -1
    }
    fun suppression(j :Joueur) : Boolean
    {
        if (Joueurs.contains(j))
        {
            Joueurs.remove(j)
            return true
        }
        return false
    }

    fun setPoints(j :Joueur, points :Int)
    {
        if(Recherche(j) != -1)
        {
            j.nbrPoints = points
        }
    }
}
fun main()
{
    var j1=Joueur("ayoub", 19, "OCK", 0)
    var j2 =Joueur("walid", 12, "OCS", 0)
    var j3 =Joueur("omar", 7, "OCS", 0)
    var j4 =Joueur("khalid", 9, "OCS", 0)

    val listDesJoueur : MutableList<Joueur> = mutableListOf(j1, j2, j3)

//    listDesJoueur.add(j4)
    println("===========================================")
    var ocs = Equipe.OCS
    var ock = Equipe.OCK
    var wac = Equipe.WAC
    var rsa = Equipe.RCA

    var maroc = Pays.MAROC

    var eq1 = Equipe_Final(listDesJoueur,ocs,maroc)
    eq1.ajout(j4)
    println("${eq1.Recherche(j4)}")
    println("${eq1.suppression(j4)}")
    println("$listDesJoueur")


}