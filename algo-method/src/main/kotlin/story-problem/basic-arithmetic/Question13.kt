package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/119

fun main() {
    val (N, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(N / K)
}