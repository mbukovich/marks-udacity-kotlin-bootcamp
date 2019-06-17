package Aquarium

fun main(args: Array <String>) {
    buildAquarium()
    markFish()
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
    
    val myAquarium2 = Aquarium(numberOfFish = 9)
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    
    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")
}
