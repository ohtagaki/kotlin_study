package `story-problem`.distribution

// 問題
// https://algo-method.com/tasks/276

fun main() {
    val A = readLine()!!.toInt()
    println(if (A % 3 == 0) A * 2 / 3 else -1)
}
