package `full-search`.`multi-array`

fun main() {
    val(N, M, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var ansCount = 0
    for (indexA in 0 until N) {
        for (indexB in 0 until M) {
            if (listA[indexA] + listB[indexB] == K) ansCount++
        }
    }
    println(ansCount)
}