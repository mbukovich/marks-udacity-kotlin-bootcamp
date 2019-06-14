package Spice

fun main(args: Array<String>) {
    
    val spices = ListOf(Spice("Curry"), Spice("Salt"), Spice("Nutmeg", "spicy"), Spice("Chile","flaming"))
    
    val aSpice = Spice("salt")
    
    val bySpiciness = spices.filter {it.heat <= 10}
    
}
