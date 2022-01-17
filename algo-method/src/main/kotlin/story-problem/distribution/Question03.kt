package `story-problem`.distribution

// 問題
// https://algo-method.com/tasks/277

fun main() {
    val (A, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(if (A % (1 + K) == 0) A * K / (1 + K) else -1)
}
