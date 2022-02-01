package `everyDay-algoMethod`.sequence

// 問題
// https://algo-method.com/tasks/653

fun main() {
    val (N, X, d) = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)
    val answer = (2 * X + d * (N - 1)) * N / 2
    println(answer)
}
