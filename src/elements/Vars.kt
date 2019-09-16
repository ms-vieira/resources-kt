package elements

fun main () {
    //Declara??es
    val a: Int = 33.dec()
    var b: String = a.toString()
    println("Int: $a")
    println("Primeiro caracter ${b.first()}")

    //Acessando o Java
    val ray = 4.5
    println(ray * ray * Math.PI)

    //Acessando o valor
    val approved = listOf("Test_1", "Test_2", "Test_3")
    println("First: ${approved[0]}")

    //Template String
    val humor = true
    println("I am ${if (humor) "happy" else "trash"}")
}
