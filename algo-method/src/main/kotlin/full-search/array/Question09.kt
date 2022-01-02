package `full-search`.array

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    for(index in 1..9) {
        println(list.filter { it == index }.size)
    }
}