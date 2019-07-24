package elements

fun printSum(x: Int, y: Int) {
    println(x + y)
}

fun sum(x: Int, y: Int = 1): Int {
    return x + y
}



fun main() {
    printSum(5, 5)

    println(sum(2,3))

    println(sum(11))
}