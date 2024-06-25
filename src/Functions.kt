fun sum(num1: Int, num2: Int): Int = num1 + num2
fun mult(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun main() {
    println("A soma dos numeros eh: ${sum(1, 2)}")
    println("O produto dos numeros eh: ${mult(5, 3)}")
}