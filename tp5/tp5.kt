package com.example.kotline_programming.collection

data class Livre(
    val titre: String,
    val auteur: String,
    val anneePublication: Int,
    val genre: String,
    val nombrePages: Int,
    val note: Double
)
// Liste de livres pour l'exercice
val bibliotheque = listOf(
    Livre("1984", "George Orwell", 1949, "Science-fiction", 328, 4.5),
    Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, "Conte", 96,
        4.8),
    Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", 1997,
        "Fantasy", 309, 4.7),
    Livre("Orgueil et Préjugés", "Jane Austen", 1813, "Roman", 432, 4.6),
    Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954, "Fantasy", 1178,
        4.9),
    Livre("Crime et Châtiment", "Fiodor Dostoïevski", 1866, "Roman", 671, 4.3),
    Livre("Fondation", "Isaac Asimov", 1951, "Science-fiction", 255, 4.4),
    Livre("Cent ans de solitude", "Gabriel García Márquez", 1967, "Réalisme magique", 417, 4.2)
    )

    fun main() {

        println("***************** question 1***************** ")
        bibliotheque.forEach(){
            println("l'auteur est : ${it.auteur} le titre est : ${it.titre}")
        }
        println("***************** question 2 *****************")
        var listTitre = bibliotheque.map{it.titre}
        listTitre.forEach(){
            println("$it")
        }
        println("***************** question 3 ***************** ")
        var listeTitre1950 = bibliotheque.filter { it.anneePublication > 1950 }
        listeTitre1950.forEach(){
            println("$it")
        }
        println("***************** question 4 ***************** ")
        val genreLivre = bibliotheque.groupBy { it.genre }
        val Sciencefiction = genreLivre["Science-fiction"]?: listOf()
        Sciencefiction.forEach(){
            println("$it")
        }
        println("***************** question 5 ***************** ")
        var nbrTotal = bibliotheque.fold(0){ total, it->total + it.nombrePages}
        println("$nbrTotal")
        println("***************** question 6 ***************** ")
        val listeLivreTrie = bibliotheque.sortedBy { it.anneePublication }
        listeLivreTrie.forEach(){
            println("$it")
        }
        println("***************** question 7 ***************** ")
        val listlivreTrie45 = bibliotheque.filter { it.note > 4.5 }.map{it.titre}.sortedBy { it }
        listlivreTrie45.forEach(){
            println("$it")
        }
        println("***************** question 8 ***************** ")
        val anneDecinne = bibliotheque.groupBy { it.anneePublication /10 * 10 }.map { it ->  it.key  to it.value.map{it.titre} }
        anneDecinne.forEach(){
            println("$it")
        }

    }
