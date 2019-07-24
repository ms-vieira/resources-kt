package loop

fun main() {

    //While
    var option = 0
    while (option != 1) {
        val line = readLine() ?: "0"
        option = line.toIntOrNull() ?: 0
        println("Option: $option")
    }

    //for
    for (i in 1..10)
        println(i)

    //for decremento
    for (i in 10 downTo 1)
        println("i = $i")

    //for step
    for (i in 0..100 step 10)
        println(i)

    //for list
    val people = arrayListOf("P 1", "P 2", "P 3.")
    for ((indice, people) in people.withIndex())
        println("$indice - $people")
}