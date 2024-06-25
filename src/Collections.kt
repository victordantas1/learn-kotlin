fun main() {
    var items = listOf("banana", "orange", "apple", "grape")
    when {
        "orange" in items -> println("Juicy")
        "apple" in items -> println("Apple is fine too")
    }
}