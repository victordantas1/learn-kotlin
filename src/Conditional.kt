fun maior(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    val num1 = 1
    val num2 = 3
    println("Maior entre ${num1} e ${num2} eh ${maior(num1, num2)}")
}