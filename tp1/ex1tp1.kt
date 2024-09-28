package com.example.kotline_programming

fun checkRep1(rep1:Int) :Boolean
{
    if(rep1 == 1)
    {
        return true
    }
    return false
}

fun checkN(n : Int) :Int
{
    if(n in 0..20)
    {
        return  n
    }
    return -2
}

fun mention(a:Int) : String{
    if (a < 10)
    {
        return "Échec"
    }
    else if(a < 12)
    {
        return "Assez bien"
    }
    else if(a < 14)
    {
        return "bien"
    }
    else if(a < 16)
    {
        return "tres bien"
    }
    else
    {
        return "Excellent"
    }
}

fun checkCa(a : Int) : Int
{
    if(a is Int) {
        return a
    }
    throw IllegalArgumentException("entrer un nombre !! ")
}

fun main()
{
    println("voulez-vous entrer le nombre des notes rependez par si oui repond par (1) si non par n'import quelle nombre : ")
    var reponse1 : Int = readLine()!!.toInt()
    if (checkRep1(reponse1) == true)
    {
        println("entrer le nombre des notes : ")
        var reponse2 : Int = readLine()!!.toInt()
        var i = 0
        var reponse3 :Int = 0
        var total :Int = 0
        while (i < reponse2)
        {
            println("entrer une note entre 0 et 20 : ")
            reponse3 = readLine()!!.toInt()
            if (checkN(reponse3) == -2)
            {
                println("un input est incorrect")
                break
            }
            total = total+ reponse3
            i++
        }
        if (checkN(reponse3) != -2)
        {
            var moyenne : Int = total / reponse2
            println("votre moyenne est : ${moyenne}")
            println("votre mention est ${mention(moyenne)}")
        }
    }
    else{
        println("pour arreter clique sur -1 ")
//        var reponse2 = readLine()!!.toInt()
        var reponse3 : Int = 0
        var total :Int = 0
        var cnt : Int = 0
        while(reponse3 != -1)
        {
            println("entrer une note entre 0 et 20 : ")
            reponse3 = readLine()!!.toInt()
            if (reponse3 == -1)
            {
                break
            }
            if (checkN(reponse3) == -2 && reponse3 != -1)
            {
                println("un input est incorrect")
                break
            }
            total += reponse3
            cnt++
        }
        if (checkN(reponse3) == -2)
        {
            var moyenne : Int = total / cnt
            println("votre moyenne est : ${moyenne}")
            println("votre mention est ${mention(moyenne)}")
        }
    }
}