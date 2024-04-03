package example.myapp

class Aquarium (var length:Int = 100, var width: Int = 20, var height: Int = 40) {
    // dimensions are in cm
    init {
        println("---------------------")
        println("> aquarium initializing")
        println("---------------------")
    }
    constructor(numberOfFish: Int) : this() {
        // 2000 cm^3 per fish
        val tank = numberOfFish * 2000 * 1.1
        // calculating height needed
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000 // 1000 cm^3 = 1 liter
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 liter = 1000 cm^3
        println("Volume: $volume liters")
    }
}