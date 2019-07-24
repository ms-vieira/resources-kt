package functions

class Operation {
    fun sum(x: Int, y: Int): Int {
        return x + y
    }
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun calc(x: Int, y: Int, function: (Int, Int) -> Int): Int {
    return function(x, y)
}

fun main() {
    println(calc(2,3, Operation()::sum))
    println(calc(2 , 5, ::sum))
}