package Aquarium5

data class Fish (var name: String)

fun main(args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")
    
    myWith (fish.name) {
        println(capitalize())
    }
    
    println(fish.run {name})
    
    println(fish.apply{})
    
    val fish2: Fish = Fish(name = "Splashy").apply{name = "sharky"}
    println(fish2.name)
    
    println(fish2.let{it.name.capitalize()}
            .let{it + "fish"}
            .let{it.length}
            .let{it + 31})
}

fun myWith(name: String, block: String.() -> unit) {
    name.block()
}
