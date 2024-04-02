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


    fun swim(speed: String = "fast") {
        println("swimming $speed")
    }

    fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            temperature > 30 -> true
            dirty > 30 -> true
            day == "Sunday" -> true
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

