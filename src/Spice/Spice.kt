package Spice

class Spice(val name: String, val spiciness: String = "mild") {
    var heat: Int
        get() = when(spiciness) {
            "mild" -> 5
            else -> 5
        }
    
}
