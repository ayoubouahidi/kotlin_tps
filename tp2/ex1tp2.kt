package com.example.kotline_programming

class Langue(var id : Int, var nom : String)

class Etudiant(var nom : String, var prenom :  String , var age : Int, val langues : List<Langue>)
{
    fun liste() : String
    {
        var result = ""
        for(i in langues.indices)
        {
            result += langues[i].nom + " "
        }
        return result
    }
    
    fun affiche()
    {
        println("Etudiant : $nom age de $age ans \nles langues maitriser sont : ${liste()}")
    }
}

fun main()
{
    var arabe = Langue(1, "arabe")
    var francais = Langue(2, "francais")
    var english = Langue(3, "english")

    var E1 = Etudiant("ayoub", "ouahidi",22,listOf(arabe, francais, english))
    E1.affiche()

}