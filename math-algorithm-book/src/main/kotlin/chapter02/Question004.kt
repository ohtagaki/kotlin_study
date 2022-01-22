package chapter02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_d

fun main() {
    val(A1, A2, A3) = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer = A1 * A2 * A3
    println(answer)
}
