fun describe(obj: Any): String =
    when(obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "is not String"
        else -> "Unknown"
    }

fun main() {
    val obj = 1
    val hello = "Hello"
    val num1 = 2L
    val num2 = 2
    println(describe(obj))
    println(describe(hello))
    println(describe(num1))
    println(describe(num2))
}