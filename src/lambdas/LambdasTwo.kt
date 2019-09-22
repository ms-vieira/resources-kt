package lambdas

fun main() {

    /*********************************************************************************/
    class Product(val name: String, val price: Double)

    val school = listOf(
        Product("Test 1", 22.00),
        Product("Test 2", 50.00)
    )
    val tot = { tot: Double, current: Double -> tot + current }
    val totSchool = school.map { it.price }.reduce(tot)
    println("Hi ${totSchool / school.size}.")
    /*********************************************************************************/

    println("In...")
    val inp = readLine()
    val msg = inp.takeIf { it?.trim() != "" } ?: "..."
    println(msg)
    /*********************************************************************************/

    class Opr {
        var rst = 0
        fun sm(valueOne: Int, valueTwo: Int) {
            rst += valueOne + valueTwo
        }

        fun add(value: Int) {
            rst += value
        }
    }

    val opr = Opr()
    opr.apply { sm(5, 7) }.apply { add(10) }.apply { println(rst) }
    opr.apply {
        sm(10, 20)
        add(30)
        println(rst)
    }
    with(opr) {
        sm(50, 50)
        add(100)
        println(rst)
    }
}
