package chapter05.section02

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_ay

fun main() {
    // 入力
    val N = readLine()!!.toLong()

    // 2の階乗の1桁は、2→4→8→6で周期的に回る
    // 答えを出力
    when(N % 4L) {
        1L -> println(2)
        2L -> println(4)
        3L -> println(8)
        else -> println(6)
    }
}
