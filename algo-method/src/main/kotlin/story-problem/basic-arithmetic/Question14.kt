package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/120

fun main() {
    val (A, B, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    if (A % K == 0) {
        println(B / K - A / K + 1)
    } else {
        println(B / K - A / K)
    }
}