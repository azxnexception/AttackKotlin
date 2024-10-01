package de.azxn

import de.azxn.de.azxn.Charakter

fun main() {
    val spieler = Charakter("Spieler", 100)
    val orc = Charakter("Orc", 80)

    println("Ein epischer Kamp beginnt!")

    while (spieler.lebenspunkte > 0 && orc.lebenspunkte > 0) {
        spieler.angreifen(orc)
        if (orc.lebenspunkte <= 0) break
        orc.angreifen(spieler)
    }

    if (spieler.lebenspunkte > 0) {
        println("${spieler.name} hat gewonnen!")
    } else {
        println("${orc.name} hat gewonnen!")
    }
}