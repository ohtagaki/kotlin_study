package chapter05.section07

// 問題
// https://atcoder.jp/contests/math-and-algorithm/tasks/math_and_algorithm_bh

fun main() {
    // 入力
    val N = readLine()!!.toInt()
    val list = readLine()!!.split(" ").mapNotNull(String::toLongOrNull)

    // 計算
    var answer = 0L
    for (index in 0 until N) {
        answer += list[index] * (- N + 2L * index + 1L)
    }

    // 出力
    println(answer)
}
