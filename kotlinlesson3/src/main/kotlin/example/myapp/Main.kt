package example.myapp

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()


    println("Fish Types")
    println("-----------")
    println("Shark ${shark.color}")
    shark.eat()
    println("Plecostomous ${pleco.color}")
    pleco.eat()

}

fun main() {
    makeFish()
}

