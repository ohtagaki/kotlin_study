package `everyDay-algoMethod`.sigmaAndPi

// 問題
// https://algo-method.com/tasks/567

fun main() {
    val(L, R) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    var count = 0
    for (index in L .. R) {
        val x = 2 * index - 1
        count += x * x
    }
    println(count)
}