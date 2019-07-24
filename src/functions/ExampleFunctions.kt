package functions

// Exemplo de fun
fun min(numberOne: Int, numberTwo: Int): Int = if (numberOne < numberTwo) numberOne else numberTwo

fun main() {
    println("Min: ${min(3, 5)}")
    println(min(numberOne = 10, numberTwo = 20))
}