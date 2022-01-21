package `everyDay-algoMethod`.sigmaAndPi

// 問題
// https://algo-method.com/tasks/568
fun main() {
    val(N, M) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listA = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var count = 0
    for (indexA in 0 until N) {
        for (indexB in 0 until M) {
            count += listA[indexA] + listB[indexB]
        }
    }
    println(count)
}