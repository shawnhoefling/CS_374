package example.myapp

fun buildAquarium() {
    // mavis = The Mavis Aquarium
    val mavis = Aquarium()
    mavis.printSize()
    val mavis2 = Aquarium(width = 25)
    mavis2.printSize()
    val mavis3 = Aquarium(height = 50, length = 100)
    mavis3.printSize()
    val mavis4 = Aquarium(width = 400, height = 500, length = 1000)
    mavis4.printSize()

    // for secondary constructor
    val mavis5 = Aquarium(numberOfFish = 40)
    mavis5.printSize()
    mavis5.volume = 60
    mavis5.printSize()
}

fun main() {
    buildAquarium()
}

