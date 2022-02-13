package chapter05.section03

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_bb

fun main() {
    // 入力
    val N = readLine()!!.toInt()

    // 答えを出力
    println(if (N % 2 == 0) "Yes" else "No")
}
