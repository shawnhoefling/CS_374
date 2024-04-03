package example.myapp

interface FishAction {
    fun eat()
}
interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("eat algae"), FishColor by fishColor

class Shark(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("hunt and eat fish"), FishColor by fishColor


