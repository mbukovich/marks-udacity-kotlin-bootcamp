import java.util.Calendar.DAY_OF_WEEK
import java.util.Calendar.getInstance

fun main(args: Array<String>) {
    println("${if (args[1].toInt() < 12) "Good morning" else "Good night"}, ${args[0]}!")
    dayOfWeek()
    feedTheFish()
}

fun dayOfWeek() {
    println("What day is it today?")
    var day: Any = getInstance().get(DAY_OF_WEEK)
    when(day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("You have entered a rift in the space-time continuum.")
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = "Pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf ("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[random().nextInt(7)]
}
