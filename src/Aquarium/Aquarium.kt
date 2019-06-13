package Aquarium

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    
    var volume: Int
        get() = return width * height * length / 1000
        set(value) {height = (value * 1000) / (width * length)}
    
    
}
