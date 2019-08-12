package exampleclass

class Test(val name: String, val ml: Int)
data class Test1(val name: String, val ml: Int)

fun main() {
    val t1 = Test("iam", 333)
    val t2 = Test("iam", 333)

    val tt1 = Test1 ("iamm", 999)
    val tt2 = Test1 ("iamm", 999)

    println(t1 == t2)
    println(tt1 == tt2)
}