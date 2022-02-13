package chapter05.section02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_az

fun main() {
    // 入力
    val N = readLine()!!.toLong()

    // 答えを出力
    if (N % 4L == 0L) {
        println("Second")
    } else {
        println("First")
    }
}
