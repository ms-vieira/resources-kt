package clas

class Refrigerator(val brand: String, val liters: Int)

data class Television(val brand: String, val inches: Int)

fun main() {
    val r1 = Refrigerator("Brastemp", 500)
    val r2 = Refrigerator("Brastemp", 500)

    println(r1 == r2) //equals

    val tv1 = Television("LG", 32)
    val tv2 = Television("LG", 32)

    println(tv1 == tv2) //equals

    println(tv1 === tv2)
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(inches = 42))

    //Destructuring em data class
    val (brand, inches) = tv1
    println("$brand $inches")

}