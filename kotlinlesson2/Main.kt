// full code for Kotlin lesson 2

import java.util.* // required

fun main() {

    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    fun increaseDirty(start: Int) = start + 1
    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)

    val decorations =
        listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot", "coral", "wood", "sand", "stone")

    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().filter { it[1] == 'o' }.map {
        println("access: $it")
        it
    }
    println("----------------------------------------")
    println("filtered: ${lazyMap.toList()}")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("Lebron James", "Kimi Raikkonen", "Mika Hakkanen")
    val mycities = listOf("Houston", "Helsinki", "New York")
    val mylist = listOf(mysports, myplayers, mycities)
    println("------------------------------------------")
    println("Flat: ${mylist.flatten()}")


    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val temperature2 = 10
    val message = "The water temperature is ${if (temperature2 > 50) "too warm" else "OK"}."
    println(message)

    fun randomDay(): String {
        val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }

    fun fishFood(day: String): String {
        var food: String
        when (day) {
            "Wednesday" -> food = "red worms."
            "Thursday" -> food = "blue worms."
            "Friday" -> food = "mosquitoes."
            "Sunday" -> food = "plankton."
            else -> food = "nada."
        }
        return food
    }


    fun swim(speed: String = "fast") {
        println("swimming $speed")
    }

    fun isTooHot(temperature: Int) = temperature < 10

    fun isDirty(dirty: Int) = dirty < 10

    fun isSunday(day: String) = day == "Sunday"

    fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else -> false
        }
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}")
    }

    fun main(args: Array<String>) {
        feedTheFish()
    }
}
