package conditions

fun main() {
    //utilizando range
    val test = 9
    if (test in 9..10) {
        println(test)
    }

    //utilizando when
    when (test) {
        10, 9 -> println("Ok")
        8, 7 -> println("Okay")
        in 0..3 -> println("=/")
        else -> println(":)")
    }

}