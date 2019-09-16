package clas

class ConstructorOne {
    val name: String
    val release: Int
    val genus: String

    constructor(name: String, release: Int, genus: String = "Default") {
        this.name = name
        this.release = release
        this.genus = genus
    }
}

class ConstructorTwo(val name: String, val release: Int, val genus: String)

class ConstructorThree(name: String, release: Int, genus: String) {
    val name: String
    val release: Int
    val genus: String

    init {
        this.name = name
        this.release = release
        this.genus = genus
    }
}


fun main() {

    val cntOne = ConstructorOne("Crazy", 2003)
    println("${cntOne.name} was released in ${cntOne.release}, ${cntOne.genus}")

    val cntTwo = ConstructorTwo("Sa", 2005, "fear")
    println("${cntTwo.name} was relead in ${cntTwo.release}, ${cntTwo.genus}")

    val cntThree = ConstructorThree("ABCD", 2009, "fear")
    println("${cntThree.name} was relead in ${cntThree.release}, ${cntThree.genus}")


}