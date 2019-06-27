package Game

fun main(args: Array<String>) {
    val game = Game()
    
    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)
    
    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    
    val end = {
        path.add(END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }
    
    fun move(where : () -> Boolean) : Unit {
        where.invoke()
    }
    
    fun makeMove(direction : String!) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}
