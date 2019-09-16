package functions

class Product(val name: String, val price: Double)

//Fun??o infix
infix fun Product.moreExpensive(product: Product):Boolean = this.price > product.price

fun main() {
    val p1 = Product("Stek", 15000.00)
    val p2 = Product(name = "House", price = 1000.00)

    println(p1 moreExpensive p2)
}