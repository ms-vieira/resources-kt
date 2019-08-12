package exampleclass

class TestC {

    val number: Int
    val other: String

    constructor(name: String, number: Int, other: String = "Default") {
        this.name = name
        this.number = number
        this.other = other
    }

    var name: String
    get() = "My name is ${field}"
    set(value) {
        field = value.takeIf { value.isEmpty() } ?: "Pattern"
    }
}

class TestC1(val name: String, val number: Int)

class TestC2(name: String, number: Int){
    val name: String
    val number: Int

    init {
        this.name = name
        this.number = number
    }
}

fun main() {
    val test = TestC("Name iam", 777)
    println("${test.name} ${test.number} ${test.other}")

    val test1 = TestC1("RSRSRS", 999)
    println("${test1.name} ${test1.number}")

    val test2 = TestC2("Test", 5555)
    println("${test2.name} ${test2.number}")
}