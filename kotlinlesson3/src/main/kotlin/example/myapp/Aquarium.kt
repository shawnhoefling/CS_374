package example.myapp

import kotlin.math.PI

open class Aquarium (open var length:Int = 100, open var width: Int = 20, open var height: Int = 40) {
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

    open var volume: Int
        get() = width * height * length / 1000 // 1000 cm^3 = 1 liter
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    open fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 liter = 1000 cm^3
        println("Volume: $volume liters\nWater: $water liters (${water / volume * 100.0}% FULL)")
    }
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width/2 * length/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}