package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/115

fun main() {
    val (A, B, C, D) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(A * C + B * D)
}