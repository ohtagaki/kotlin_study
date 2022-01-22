package chapter02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_j

fun main() {
    val N = readLine()!!.toInt()
    var answer: Long = 1
    for (index in 1..N) {
        answer *= index
    }
    println(answer)
}
