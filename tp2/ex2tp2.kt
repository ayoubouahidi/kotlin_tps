package com.example.kotline_programming

open class Personne(private var id : Int = 0,private var nom : String = "nom",private var prenom : String = "prenom",private var age : Byte = 0)
{
    companion object{
        private var nbrEmploye :Int = 0

    }

    init{
        nbrEmploye += 1
    }
    fun getNbrEmpleye() : Int{
        return nbrEmploye
    }
//    getters
    fun getId() : Int
    {
        return id
    }
    fun getNom() : String
    {
        return nom
    }
    fun getPrenom() : String
    {
        return prenom
    }
    fun getAge() : Byte
    {
        return age
    }
//setters
    fun setId(a : Int)
    {
        id = a
    }
    fun setNom(a : String)
    {
        nom = a
    }
    fun setPrenom(a : String)
    {
        prenom = a
    }
    fun setAge(a : Byte)
    {
        age = a
    }
//affichage
    open fun afficherInfo() {
        println("${this.getId()} : ${this.getNom()}, ${this.getPrenom()}, age de ${this.getAge()}")
    }

}

class Employe(id : Int, nom : String, prenom: String, age: Byte, var Salaire : Double) : Personne(id,nom,prenom,age)
{
    override fun afficherInfo(){
        super.afficherInfo()
        println("${this.Salaire}")
    }
}

fun main()
{
    var p1 = Personne(1, "ayoub", "ouahidi", 22)
    p1.afficherInfo()
    var e1 = Employe(1,"ayoub","ouahidi",22, 20000.00)
    var e2 = Employe(1,"ayoub","ouahidi",22, 20000.00)
    var e3 = Employe(1,"ayoub","ouahidi",22, 20000.00)

    e1.afficherInfo()
    println("************")
    println("${e1.getNbrEmpleye()}")

}