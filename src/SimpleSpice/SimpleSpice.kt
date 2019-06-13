package SimpleSpice

class SimpleSpice {
    
    var spiceName = "Curry"
    var spiciness = "mild"
    var heat: Int 
        get() = when(spiciness) {
            "mild" -> 5
            else -> 5
        }
}
