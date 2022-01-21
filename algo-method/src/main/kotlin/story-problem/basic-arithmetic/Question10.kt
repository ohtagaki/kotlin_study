package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/118

fun main() {
    val (M, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(if (M % K == 0) M / K else M / K + 1)
}