package Spices

fun main(args: Array<String>) {
    val curry = Curry("curry", "mild")
    println(curry.color)
}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by Color {
    
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        grind()
    }
    
    override fun grind() {}
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor: SpiceColor {
    override val color = "yellow"
}
