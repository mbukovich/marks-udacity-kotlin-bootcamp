fun main(args: Array<String>) {
    
}

fun whatShouldIDoToday(
         mood : String,
         weather : String = "sunny",
         temperature : Int = 24) {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk."
        mood == "angry" -> "Go exercise."
        mood == "happy" && temperature <= 0 -> "Warm yourself by the fire."
        weather == "snowing" -> "Make a Snow Man."
        else -> "Stay home and read."
    }
}
