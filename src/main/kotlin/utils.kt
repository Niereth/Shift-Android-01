import java.lang.Exception

const val ERROR_MESSAGE = "Некорректный ввод."

fun getLine(notification: String): String {
    while (true) {
        print(notification)
        val line = readLine()

        if (line.isNullOrEmpty()) {
            println(ERROR_MESSAGE)
        } else {
            return line
        }
    }
}

fun getParsedLineToInt(notification: String): Int {
    while (true) {
        try {
            val line = getLine(notification)
            return line.toInt()
        } catch (e: Exception) {
            println(ERROR_MESSAGE)
        }
    }
}