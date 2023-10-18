package com.example.m202_fonctions

fun main() {

    // inputs
    print("Entrer le prix unitaire \n")

    var prixUnitaire = readLine()?.toDoubleOrNull()
    prixUnitaire = prixUnitaire ?:0.0

    print("Entrer la quantité \n")

    var quantite = readLine()?.toIntOrNull()
    quantite = quantite ?:0



    // Traitement
    var prixTotal = prixUnitaire * quantite

    
    // Sortie
    print("Le prix total est: $prixTotal")
    print("\n")



}