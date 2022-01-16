package `story-problem`.`basic-arithmetic`

// 問題
// https://algo-method.com/tasks/127

fun main() {
    val (U, T, A) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val t = (A - U) / T
    println(if ((A - U) % T == 0) U + T * t else U + T * (t + 1))
}