package com.example.kotline_programming

import android.widget.MultiAutoCompleteTextView

open class Produit(var code : Int , var prix :Int) {
    constructor(code : Int):this(code,0)
//    constructor():this(0,0)

    open fun prixProduit() :Int{
        return this.prix
    }
    override fun toString() : String{
        return  "le code est : ${this.code}; le prix : ${this.prix}"
    }

    fun equals(c : Int){
        if(this.code == c){
            println("sont equaux")
        }
        print("ne sont pas equaux !!")
    }
}
class ProduitsEnSold(code: Int, prix: Int, var remise : Double) : Produit(code, prix){
    init{
        if (remise < 0 && remise > 90){
            throw IllegalArgumentException("erreur dans remise !!")
        }
    }
    fun prixProduit1() : Double{
        val nvprix = this.prix -(this.prix * (this.remise / 100))
        return nvprix
    }
    override fun toString(): String {

        return super.toString()+" le prix apres la reduction ${this.prixProduit1()} "
    }
}

class Boutique(val listedesproduits : MutableList<Produit>){
    fun indice(c : Int) : Int{
        for (i in listedesproduits){
            if(i.code == c){
                return listedesproduits.indexOf(i)
            }
        }
        return -1
    }

    fun ajout(p :Produit){
        if(listedesproduits.contains(p)){
            throw IllegalArgumentException("Erreur")
        }
        listedesproduits.add(p)
        println("ajout avec succes !!")
    }

    fun supprimer(c :Int) : Boolean{
        for (i in listedesproduits){
            if(i.code == c)
            {
                listedesproduits.remove(i)
                return true
            }
        }
        return false
    }

    fun supprimer(p :Produit) : Boolean{
        return listedesproduits.remove(p)
    }

    fun nbrProduitsEnStock() : Int{
        var cmp = 0
        for(i in listedesproduits){
            if (i is ProduitsEnSold){
                cmp++
            }
        }
        return  cmp
    }
}

fun main()
{
    println("==========================================")
    var p1 = Produit(1,100)
    var p2 = Produit(2,100)
    var p3 = Produit(3,100)
    var p4 = ProduitsEnSold(4,120,30.00)
    val list : MutableList<Produit> = mutableListOf(p1, p2, p3)
    var B1 = Boutique(list)
    B1.ajout(p4)
    println("==========================================")
    println("${ p4.toString()}")
    var a = B1.nbrProduitsEnStock()
    println("$a")
    println("==========================================")
//    B1.supprimer(3)
    println("${B1.supprimer(4)}")
}