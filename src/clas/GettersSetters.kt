package clas

class GtSt {

    constructor(name: String) {
        this.name = name
    }

    var name: String
        get() = "My name is $field"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "unknown"
        }

}

class GtStC (val name: String, val active: Boolean) {
    val inactive: Boolean get() = !active
}



fun main() {
    val gst = GtSt("")
    println(gst.name)

    val gStc = GtStC("Prd", active = true)
    println(gStc.active)
}