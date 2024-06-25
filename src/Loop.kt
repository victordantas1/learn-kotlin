fun imprime_lista_for(items: List<String>) {
    for (item in items) {
        println(item)
    }
}
fun imprime_lista_indices_for(items: List<String>) {
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun imprime_lista_while(items: List<String>) {
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun main() {
    val items = listOf("banana", "morango", "abacate", "abacaxi")
    println("Usando for e iterando os elementos da lista:")
    imprime_lista_for(items)
    println("Usando for e iterando os indices da lista:")
    imprime_lista_indices_for(items)
    println("Usando while e iterando os indices da lista:")
    imprime_lista_while(items)
}

