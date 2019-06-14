package Spice

class Spice(val name: String, val spiciness: String = "mild") {
    
    init {
        println("Spice Name: $name  Spiciness: $spiciness")
    }
    
    var heat: Int
        get() = when(spiciness) {
            "mild" -> 5
            "spicy" -> 10
            "flaming" -> 15
            else -> 5
        }
    
    fun makeSalt() = Spice("Salt", "mild")
}
