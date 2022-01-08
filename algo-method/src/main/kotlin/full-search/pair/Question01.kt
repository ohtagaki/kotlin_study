package `full-search`.pair

fun main() {
    val(N, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    for (indexA in 0 until N) {
        for (indexB in indexA + 1 until N) {
            if (list[indexA] + list[indexB] <= K) ansCount++
        }
    }
    println(ansCount)
}