package de.azxn.de.azxn


class Charakter(val name: String, var lebenspunkte: Int) {
    fun angreifen(gegner: Charakter) {
        println("$name greift ${gegner.name} an!")
        gegner.lebenspunkte -= 10
        println("${gegner.name} hat jetzt noch ${gegner.lebenspunkte} Lebenpunkte!")
    }
}
