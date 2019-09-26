package collections

fun Any.print() = println(this)

fun main() {

    val set = hashSetOf(3, 'a', "Test", true, 3.50)
    set.add(3).print()
    set.add(10).print()
    set.size.print()

    set.remove('a').print()
    set.contains('a').print()
    set.contains("TEST").print()
    set.contains("Test").print()

    val nums = setOf(1, 2, 3) // somente leitura
    (set + nums).print()
    (set - nums).print()

    set.intersect(nums).print() // nao muda o conjunto
    set.retainAll(nums).print() //muda o conjunto
    set.print()

    set.clear()
    set.isEmpty().print()

    val approved = hashSetOf("Test 1", "Test 2", "Test 3")
    for(app in approved) app.print()

    val approvedOne = linkedSetOf("11111", "22222", "33333", "44444")
    println("------------------------------------------------")
    for (appOne in approvedOne) appOne.print()

    approved.sortedBy { it.substring(1) }.print()
}