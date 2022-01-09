package `full-search`.pair

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    (0..N - 1).forEach { first ->
        (first + 1..N - 1).forEach { second ->
            (second + 1..N - 1).forEach { third
                -> if (list[first] <= list[second] && list[second] >= list[third]) ansCount++
            }
        }
    }
    println(ansCount)
}