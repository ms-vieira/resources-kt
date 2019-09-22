package collections

fun main() {

    /*********************************************************************************/
    val number = arrayListOf(1, 2, 3, 4)
    val strings = arrayListOf("Test 1 ", "Test 2", "Test 3")
    val union = number + strings

    for (item in union) { println(item) }
    /*********************************************************************************/

    data class Fruit(val name: String, val price: Double)

    val fruits = arrayListOf(Fruit("Wimp", 4.50),
        Fruit("Strawberry", 5.50))
    for(fruit in fruits) { println("${fruit.name}  -  R$ ${fruit.price}") }

    println(fruits.distinctBy { it.price })
    /*********************************************************************************/
}