package `story-problem`.`sum-difference`

// 問題
// https://algo-method.com/tasks/144

fun main() {
    val (A, B) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println((A + B) / 2)
}
