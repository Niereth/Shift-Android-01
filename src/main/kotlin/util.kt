const val ERROR_MESSAGE = "Некорректный ввод."

fun getLine(notification : String): String {
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