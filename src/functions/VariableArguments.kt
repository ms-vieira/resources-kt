package functions

//Argumentos Variáveis
fun sorts(vararg numbers: Int): IntArray {
    return numbers.sortedArray()
}

fun main() {
    for(n in sorts(1,2,3,4,5))
        println("$n")
}