open class Shape

class Rectangule(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}
fun main() {
    val rectangule = Rectangule(5.0, 2.0)
    println("The perimeter is: ${rectangule.perimeter}")
}