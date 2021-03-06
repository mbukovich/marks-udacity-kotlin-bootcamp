fun main(args: Array<String>) {
    println(whatShouldIDoToday())
}

fun whatShouldIDoToday(
         weather : String = "sunny",
         temperature : Int = 24) {
    print("Please enter your mood: ")
    var mood : String? = readLine()?: "happy"
    
    fun isNiceWeather(mood: String, weather: String) = mood == "happy" && weather == "sunny"
    fun isAngry(mood: String) = mood == "angry"
    fun isColdOutside(mood: String, temperature: String) = mood == "happy" && temperature <= 0
    fun isSnowing(weather: String) = weather == "snowing"
    
    return when {
        isNiceWeather(mood!!, weather) -> "Go for a walk."
        isAngry(mood!!) -> "Go exercise."
        isColdOutside(mood!!, temperature) -> "Warm yourself by the fire."
        isSnowing(weather) -> "Make a Snow Man."
        else -> "Stay home and read."
    }
}
