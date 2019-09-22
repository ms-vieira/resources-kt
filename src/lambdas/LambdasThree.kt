package lambdas

fun main() {

    /*********************************************************************************/
    val listWithNulls: List<String?> = listOf("A", null, "B", null)
    for (itm in listWithNulls) { itm?.let { println(it) } }

    /*********************************************************************************/

    data class House(var address: String = "", var num: Int = 0)
    var house = House()
    house.run {
        address = "Test One"
        num = 9000 }

    println(house)
}