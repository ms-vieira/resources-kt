package functions

//Aidicionando metodo em classe
fun <T> List<T>.secondOrnull(): T? = if (this.size >= 2) this.get(1) else null

fun main() {
    val list = listOf("Test 1", "Test 2")
    println(list.secondOrnull())
}