package example.myapp

class Aquarium (length:Int = 3000, width: Int = 2000, height: Int = 2500) {
    // dimensions are in cm
    var width: Int = width
    var height: Int = height
    var length: Int = length


    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}