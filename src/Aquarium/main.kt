package Aquarium

fun main(args: Array <String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")
    
    myAquarium.height = 80
    
    println("Height: ${myAquarium.height} cm")
    
    println("Volume: ${myAquarium.volume} liters")
    
    val smallAquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")
}
