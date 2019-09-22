package collections

fun main() {

    val matrix = Array(3) { arrayOfNulls<Int>(3) }

    matrix[0][0] = 1
    matrix[0][1] = 2
    matrix[0][2] = 3
    matrix[1][0] = 4
    matrix[1][1] = 5
    matrix[1][2] = 6
    matrix[2][0] = 7
    matrix[2][1] = 8
    matrix[2][2] = 9

    for ((line, lineArray) in matrix.withIndex()) {
        for ((column, value) in lineArray.withIndex()) {
            println("[$line] [$column] - ${matrix[line][column]} == $value")
        }
    }

    matrix.forEach { line -> line.forEach { value -> println(value) } }
}