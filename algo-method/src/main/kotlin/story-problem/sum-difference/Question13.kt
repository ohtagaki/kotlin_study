package `story-problem`.`sum-difference`

// 問題
// https://algo-method.com/tasks/145

fun main() {
    val (A, B) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(if ((A + B) % 2 == 0) (A + B) / 2 else -1)
}
