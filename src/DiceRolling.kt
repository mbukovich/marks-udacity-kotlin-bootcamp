{
    gameplay(6,rollDice2)
}

fun gameplay(sides: Int, operation: (Int) -> Int) {
    println(operation(sides))
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}
