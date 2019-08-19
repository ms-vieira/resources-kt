package lambdas

data class Students(val name: String, val value: Double)

class Product(val name: String, val price: Double)

class Calc {
    var res = 0
    fun summ(value1: Int, value2: Int){
        res += value1 + value2
    }
    fun add(value: Int) {
        res =+ value
    }
}

fun main() {

    val sum = { x: Int, y: Int -> x + y }
    println(sum(5, 3))

    val names = arrayListOf("TESTE1", "TESTE2", "TESTE3")
    val ordered = names.sortedBy { it }
    val ordered2 = names.sortedBy { it.reversed() }
    println(ordered)
    println(ordered2)

    val students = arrayListOf(
        Students("Brito", 6.0),
        Students("Vinicius", 7.0),
        Students("Carneiro", 8.0)
    )
    val approved = students.filter { it.value >= 6.0 }.sortedBy { it.value }
    println(approved)

    val people = arrayListOf("Silva", "Matheus", "Vieira")
    people.map { it.toUpperCase().apply { println(this) } }

    val material = listOf(
        Product("Pencil", 1.0),
        Product("Pen", 2.0),
        Product("Book", 3.0)
    )
    val total = { total: Double, current: Double -> total + current }
    val all = material.map{ it.price }.reduce(total)
    println(all)

    println("Enter a message:")
    val input = readLine()
    val msg = input.takeIf { it != "" } ?: "Empty"
    println(msg)

    val calc = Calc()
    calc.apply { summ(5,7) }.apply { add(9) }.apply { println(res) }
    calc.apply {
        summ(9,9)
        add(10)
        println(res)
    }
    with(calc) {
        summ(3,7)
        add(55)
        println(res)
    }

    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)
    for (item in listWithNulls) item?.let{ println(it)}
}