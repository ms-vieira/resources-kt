package lambdas

fun main() {

    /*********************************************************************************/
    fun calc(valueOne: Int, valueTwo: Int, operation: (Int, Int) -> Int): Int =
        operation(valueOne, valueTwo)

    val sum = { x: Int, y: Int -> x + y }
    val sub = { valueOne: Int, valueTwo: Int -> (valueOne - valueTwo) }

    println(calc(20, 30, sum))
    println(calc(10, 5, sub))
    /*********************************************************************************/

    val names = arrayListOf("Test1", "Test2", "Test3")
    val ordered = names.sortedBy { it }
    val ordered2 = names.sortedBy { it.reversed() }

    println(ordered)
    println(ordered2)
    /*********************************************************************************/

    data class Students(val name: String, val score: Double)

    val students = arrayListOf(
        Students(name = "Test 1 ", score = 8.0),
        Students(name = "Test 2 ", score = 9.0),
        Students(name = "Test 3 ", score = 10.0)
    )

    val approved = students.filter { it.score >= 7.0 }.sortedBy { it.name }
    println(approved)
    /*********************************************************************************/

    val disciple = arrayListOf("Test 1", "Test 2", "Test 3")
    disciple.map { it.toUpperCase() }.apply { println(this) }
}