package collections

fun main() {

    val map = HashMap<Long, String>()

    map[123456789] = "Test 1"
    map[987654321] = "Test 2"
    map[333333333] = "Test 3"

    for (par in map) println(par)
    println("-------------------------------------------------------------------")

    for (name in map.values) println(name)

    for (key in map.keys) println(key)

    for ((key, name) in map) println("$name - $key")

    map.size.print()
    map[333333333]?.print()
    map.contains(333333333).print()
    map.remove(333333333)?.print()
    map.clear()
    map.isEmpty().print()

    val mapp = hashMapOf(1 to "Test", 2 to "Test 2")
    for((id, name) in mapp) println("$id ------- $name")
}
