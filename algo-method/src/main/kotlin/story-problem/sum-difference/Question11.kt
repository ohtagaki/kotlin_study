package `story-problem`.`sum-difference`

// 問題
// https://algo-method.com/tasks/143

fun main() {
    val A = readLine()!!.toInt()
    println(if (A % 2 == 0) A / 2 else -1)
}
