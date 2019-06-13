package SimpleSpice

class SimpleSpice {
    
    var spiceName = "Curry"
    var spiciness = "mild"
    var heat: Int 
        get() = when(spiciness) {
            "mild" -> 5
            "hot" -> 6
            "fire" -> 7
            "blazing" -> 8
            "scorching" -> 9
            else -> 5
        }
}
