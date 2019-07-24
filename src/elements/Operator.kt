package elements

fun main() {
    //safe call operator
    var x: Int? = null
    println(x)

    //elvis operator
    val opcional: String? = null
    val obrigatoria: String = opcional ?: "Valor Padrao"

    println(obrigatoria)

}