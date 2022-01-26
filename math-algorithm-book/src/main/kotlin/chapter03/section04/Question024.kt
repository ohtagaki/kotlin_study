package chapter03.section04

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_x

fun main() {
    val n = readLine()!!.toInt()
    val list = (0 until n).map{readLine()!!.split(" ").mapNotNull(String::toDoubleOrNull)}
    var answer: Double = 0.00000000
    for (index in 0 until n) {
        answer += list[index].last() / list[index].first()
    }
    println("%.8f".format(answer))
}
