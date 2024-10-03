package com.example.kotline_programming

import java.sql.Date

data class Etape (var nom : String, var date_debut : Date, var date_fin, var distance : Int, var diff : String) {}
data class Resultat (var temps_eff : Date  , var classemment :Int)

