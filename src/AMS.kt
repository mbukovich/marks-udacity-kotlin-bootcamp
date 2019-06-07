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

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20) : Boolean {
    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"
    
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) > 30 -> true
        isSunday(day) == "Sunday" -> true
        else -> false
    }
}

fun fitMoreFish(
        tankSize : Int,
        currentFish : List<Int>,
        fishSize : Int = 2,
        hasDecorations : Boolean = true) : Boolean {
    var available = (tankSize* (if (hasDecorations) 8 else 10) /10) - currentFish.sum()
    return available >= fishSize
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    
    if(shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun randomDay() : String {
    val week = listOf ("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[random().nextInt(7)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitos"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}
