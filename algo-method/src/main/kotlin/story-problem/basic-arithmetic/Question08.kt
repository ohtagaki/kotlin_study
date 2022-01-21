package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/111

fun main() {
    val (L, A) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(L / A)
}