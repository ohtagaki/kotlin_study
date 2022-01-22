package chapter02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_c

fun main() {
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toIntOrNull)
    val answer = list.sum()
    println(answer)
}
