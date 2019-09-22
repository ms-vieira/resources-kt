package collections

fun main() {

    /*********************************************************************************/
    val number = Array(10) { i -> i * 10 }
    for (nro in number) {
        println(number)
    }

    println(number.get(1))
    println(number.size)

    number[1] = 5555555
    println(number[1])
    /*********************************************************************************/

    val strings = arrayListOf("Test 1", "Test 2")
    for (itm in strings) {
        itm.toUpperCase()
    }
    /*********************************************************************************/

    val pairs = arrayListOf(2, 4, 6)
    val odd = intArrayOf(1, 3, 5)
    for (itm in odd.union(pairs).sorted()) {
        println("$itm")
    }
    /*********************************************************************************/

    val listMix = arrayListOf("Test", true, 1, 3.20, 'p')
    for (itm in listMix) {
        if (itm is String) {
            println(itm.toUpperCase())
        } else {
            println(itm)
        }
    }
    /*********************************************************************************/
}