package com.example.kotline_programming
import com.example.kotline_programming.collection.Cookie

//fun main(){
//    //substring
//    var string : String = "ayoub ouahidi"
//    println("${string.substring(1,string.length-1)}")
//    //
//    var c1 = Client("ayoub","ouahidi")
//    c1.ajout()
//    fun Client.suprimmer(){
//        println("fct du suppresion")
//    }
//}
//
//class Client(var nom:String,var prenom:String)
//{
//    fun ajout(){
//        println("fct d'ajout")
//    }
//}
     /*exemple 2*/
//fun main(){
//    fun MutableList<String>.supp(){
//        if (!this.isEmpty()){
//            removeAt(0)
//        }
//        throw IllegalArgumentException("erreur: liste vide ")
//    }
//    val liste : MutableList<String> = mutableListOf("ayoub","ouahidi","22ans")
//    liste.supp()
//}
fun main() {
    println("********* exe 1 *************")

    fun String.removeFirstLastChar(): String {
        return this.substring(1, this.length - 1)
    }
    println("********* exe 2 *************")
    fun MutableList<Int>.Echange(ind1: Int, ind2: Int) {
        var i = this[ind1]
        this[ind1] = this[ind2]
        this[ind2] = i
    }
    println("********* exe 3 *************")
    class Cercle(var pi: Int, var r: Int) {

    }

    fun Cercle.perimetre(): Int {
        return (2 * this.pi * this.r)
    }
    println("********* exe 4 *************")
    class Student(var note: Int) {

    }

    fun Student.isExcellent(): Boolean {
        if (this.note >= 90) return true
        return false
    }
    println("********* exe bonus *************")
    val list: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    fun MutableList<Int>.echange2() {
        var i: Int = 0
        var tmp: Int = 0
        while (i != list.lastIndex) {
            if (i % 2 == 0) {
                tmp = list[i]
                list[i] = list[i + 1]
                list[i + 1] = tmp
            }
        }
        i++
    }
}




}

//
