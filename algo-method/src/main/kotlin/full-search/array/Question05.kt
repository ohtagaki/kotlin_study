package `full-search`.array

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var count = 0
    for (index in 0 until list.size - 1) {
        if ( list[index] < list[index + 1] ) count++
    }
    println(count)
}