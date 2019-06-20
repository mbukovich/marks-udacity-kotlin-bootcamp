package Spices

fun main(args: Array<String>) {
    val curry = Curry("curry", "mild")
    println(curry.color)
}

sealed abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by Color {
    
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
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
}

enum class Color(val rgb: Int) {
   RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}
