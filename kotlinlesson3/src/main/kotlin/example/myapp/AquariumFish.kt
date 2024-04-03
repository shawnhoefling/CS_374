package example.myapp

class Shark: AquariumFish(), FishAction {
    override val color = "color: BLACK"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "color: GOLD"
    override fun eat() {
        println("eat algae")
    }
}

interface FishAction {
    fun eat()
}

abstract class AquariumFish : FishAction {
    abstract val color : String
    override fun eat() = println("yum")
}