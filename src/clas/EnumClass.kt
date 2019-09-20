package clas

enum class DayWeek{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

enum class DayWeek2 (val id: Int,  val nameW: String, val useful: Boolean) {
    MONDAY(1, "Monday", true),
    SUNDAY(2,"Sunday", false)
}

fun main() {
    println("The best ${DayWeek.FRIDAY}")

    for(day in DayWeek2.values())
        println("${day.nameW} it's a day ${if(day.useful) "useful" else "not"}")
}