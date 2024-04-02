import java.util.* // required
    // will assign kotlin.unit
    /*
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if(temperature > 50) true else false
    println(isHot)

    val temperature2 = 10
    val message = "The water temperature is ${if(temperature2 > 50) "too warm" else "OK"}."
    println(message)
    */

    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }

    fun fishFood (day : String) : String {
        var food : String
        when (day) {
            "Wednesday" -> food = "red worms."
            "Thursday" -> food = "blue worms."
            "Friday" -> food = "mosquitoes."
            "Sunday" -> food = "plankton."
            else -> food = "nada."
        }
        return food
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println("> Today is $day and the fish eat $food")
    }

    fun main(args: Array<String>) {
        feedTheFish()
    }

