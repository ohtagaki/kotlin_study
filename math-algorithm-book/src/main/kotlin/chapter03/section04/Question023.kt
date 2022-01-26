package chapter03.section04

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_w

fun main() {
    val N = readLine()!!.toInt()
    val listB = readLine()!!.split(" ").mapNotNull(String::toDoubleOrNull)
    val listR = readLine()!!.split(" ").mapNotNull(String::toDoubleOrNull)
    var answer: Double = listB.sum() / N + listR.sum() / N
    println("%.8f".format(answer))
}
