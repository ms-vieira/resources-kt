package loop

fun main() {

    /*********************************************************************************/
    val students = arrayListOf("Test 1", "Test 2", "Test 3")

    for(student in students) { println(student) }

    for((index, student) in students.withIndex()) {
        println("$index - $student")
    }
    /*********************************************************************************/

    val names = arrayListOf("Test 1", "Test 2", "Test 3")
    names.forEach { println(it) }
    /*********************************************************************************/
}