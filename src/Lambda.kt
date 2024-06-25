fun main() {
    var items = listOf("banana", "orange", "apple", "grape", "avocado")
    items.filter {it.startsWith("a")}
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach {println(it) }
}