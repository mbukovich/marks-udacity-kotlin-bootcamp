package Aquarium

fun main(args: Array<String>) {
    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    
    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    
    println(symptoms.subList(4, symptoms.size))
    
    listOf(1, 5, 3).sum()
    
    listOf("a", "b", "cc").sumBy {it.length}
    
    val cures : Map<String, String> = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    
    println(cures.get("white spots"))
    println(cures["white spots"])
    
    println(cures.getOrDefault("bloating", "sorry I don't know")
    
    cures.getOrElse("bloating") { "No cure for this" }
    
    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")
    
    
}
