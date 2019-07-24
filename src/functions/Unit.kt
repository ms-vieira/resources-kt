package functions

fun printMax(x: Int, y: Int): Unit {
    println(Math.max(x, y))
}

fun printMin(x: Int, y: Int) {
    println(Math.min(x, y))
}

fun main() {
    printMax(10, 20)

    printMin(20,10)
}