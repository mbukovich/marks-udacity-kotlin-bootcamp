package Spices

fun main(args: Array<String>) {
    val curryContainer = SpiceContainer(Curry("curry", "mild"))
    val saltContainer = SpiceContainer(Curry("salt", "mild"))
    println(curryContainer.name)
    println(saltContainer.name)
}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}
