package `everyDay-algoMethod`.set

// 問題
// https://algo-method.com/tasks/639

fun main() {
    val(N, M, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(N + M - K)
}