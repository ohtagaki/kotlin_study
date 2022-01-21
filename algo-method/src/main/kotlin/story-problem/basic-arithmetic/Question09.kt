package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/112

fun main() {
    val (N, A) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(if (N % A == 0) N / A else N / A + 1)
}