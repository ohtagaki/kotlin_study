package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/116

fun main() {
    val (A, B) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(A / B)
}