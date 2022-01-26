package chapter03.section04

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_y

fun main() {
    val N = readLine()!!.toInt()
    val listA = readLine()!!.split(" ").mapNotNull(String::toDoubleOrNull)
    val listB = readLine()!!.split(" ").mapNotNull(String::toDoubleOrNull)
    var answer: Double = 0.000000000000
    answer = listA.sum() / 3 + 2 * listB.sum() / 3
    println(answer)
}
