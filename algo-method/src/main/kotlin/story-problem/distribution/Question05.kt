package `story-problem`.distribution

// 問題
// https://algo-method.com/tasks/279

fun main() {
    val (A, B, K) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    println(if ((B + A) % (1 + K) == 0 && (B + A) / (1 + K) * K - A >= 0) (B + A) / (1 + K) * K - A  else -1)
}
