package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/343

fun main() {
    val (A, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(if (A % K == 0) A else K * (A / K + 1))
}