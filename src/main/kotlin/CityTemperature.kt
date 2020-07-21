import WeatherCondition.*
import java.lang.Exception

fun main() {
    val name = getCityName()
    val temperature = getCityTemperature()
    val readableTemperature = getCityReadableTemperature(temperature)

    println("В городе $name сейчас $readableTemperature")
}

fun getCityName() =
    getLine("Введите название города: ")

fun getCityTemperature(): Int {
    while (true) {
        try {
            val line = getLine("Введите температуру в городе: ")
            return line.toInt()
        } catch (e: Exception) {
            println(ERROR_MESSAGE)
        }
    }
}

fun getCityReadableTemperature(temperature: Int) =
    when (temperature) {
        in -50..15 -> COLD.value
        in 15..25 -> NORMAL.value
        in 25..50 -> HOT.value
        else -> CATASTROPHE.value
    }

